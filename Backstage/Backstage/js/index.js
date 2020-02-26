//全局变量
var Stime = '';
var Etime = '';
var a = '';
var jsArr = {
    code: [],
    items: []
};
//登陆id，name,phone
var id = localStorage.lastname;
var loginId = '';
var loginName = '';
var loginPhone = '';
// 查看点击
function See(url,temp,name,e){
    a = e.getAttribute("data-input");
    var json = {
        infoId : a
    };
    ajax( url,temp,json,name);
}
//模态框点击
function Ddit(url1,url2,name,e){
    if(e) {
        a = e.getAttribute("data-input");
        var json = {
            infoId : a
        };
    }
    else {
        var json ='';
    }
    $.ajax({
        type: "POST",
        url: url1,
        data: json,
        dataType: "json",
        success : function (data) {
            if (!(data instanceof Array)){
                data = [data];
            }

            jsArr.items.length = 0;
            for(var i=0;i<data.length;i++){
                jsArr.items.push(data[i])
            }
            $('.modal-content').children().remove();
            var str = template(name, jsArr);
            $('.modal-content').append(str);  
               
        },
        error:function(){
            alert("获取数据失败")
        }
    })
}


//模态框确认
function EDdit(url1,url2,name,temp){
    if(name == "DditIcode"){
        var goodsName = $('#goodsName').val();
        var Selet1 = $('#example-radio1 option:selected').val();
        var Selet2 = $('#example-radio2 option:selected').val();
        var json = {
            goodsId : a,
            goodsName : goodsName,
            goodsState : Selet1,
            wareHouseName : Selet2
        }
    }else if (name == "DditWcode") {
        var userName = $('#userName').val(); 
        var wareHouseName = $('#wareHouseName').val()+"仓库";
        var wareHouseAddress = $('#wareHouseAddress').val();
        var json = {
            wareHouseId : a,
            userName : userName,
            wareHouseName : wareHouseName,
            wareHouseAddress : wareHouseAddress
        }  
    }
    else if (name == "IncreaseWcode") {
        var wareHouseId = $('#wareHouseId').val(); 
        var wareHouseName = $('#wareHouseName').val()+"仓库";
        var Selet1 = $('#example-radio1 option:selected').val();
        var wareHouseAddress = $('#wareHouseAddress').val();
        var json = {
            wareHouseId: wareHouseId,
            wareHouseName: wareHouseName,
            userId: Selet1,
            wareHouseAddress: wareHouseAddress
        }
    }
    $.ajax({
        type: "POST",
        url: url1,
        data: json,
        dataType: "json",
        success: function (data) {
            if(name == "DditWcode") {
                alert('修改数据成功');
            }else {
                alert('新增数据成功');
            }
            
            $('.modal-backdrop').remove();
            ajax(url2,temp,"",name);
        },
        error:function () {
            alert('数据出错');
        }
    }) 
}
// 搜索点击
function Search(url1,temp,url2) {
    var Selet = '';
    var Rfid = $('.Rfid').val();
    Selet = $('#example-radio option:selected').val();
    var json = {
        rfidId : Rfid,
        wareHouseName : Selet,
        beginTime : Stime,
        endTime : Etime
    }
    ajax(url1,temp,json,'',url2);
}
//时间控件
function DataTime(){
    $("#start_time1").datetimepicker({
        format: "yyyy-mm-dd",
        language: "zh-CN",
        todayBtn: 1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 4,
        forceParse: 0,
        showMeridian: 1,
        minView: "month",
        startDate: '2018-01-01'
    }).on('hide', function (ev) {
        Stime = $('#start_time1').val();
    });
    $("#start_time2").datetimepicker({
        format: "yyyy-mm-dd",
        language: "zh-CN",
        todayBtn: 1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 4,
        forceParse: 0,
        showMeridian: 1,
        minView: "month",
        startDate: '2018-01-01'
    }).on('hide', function (ev) {
        Etime = $('#start_time2').val();
    });
    $('#start_time1').on('changeDate', function(ev){
        $('#start_time2').datetimepicker('setStartDate', ev.date);
        var d = $('#start_time2').val();
        if (d) {
            var date = new Date(d.replace(/-/g, '/'));
            if(date != 'Invalid Date' && date < ev.date){
                $('#start_time2').datetimepicker('setDate', ev.date)
            }
        }
    });
}
//时间戳转换
function formatDate(inputTime) {
    var date = new Date(inputTime);
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    m = m < 10 ? ('0' + m) : m;
    var d = date.getDate();
    d = d < 10 ? ('0' + d) : d;
    return y + '-' + m + '-' + d;
};
//获取后台数据
function ajax(url1,temp,record,see) {
    $.ajax({
        type: "POST",
        url: url1,
        data: record,
        dataType: "json",
        success: function (data) {
            Stime = '';
            Etime = '';
            if (!(data instanceof Array)){
                data = [data];
            }
            if (data == ''){
                return alert("数据为空，无法显示");
            }
            if (see == "tdbtn"){
                for (var i = 0; i < data[0].DateList.length; i++) {
                    data[0].DateList[i] = formatDate(data[0].DateList[i]);
                }
            }else if (see == "Wcode"){
                for (var i = 0; i < data.length; i++) {
                    data[i].addTime = formatDate(data[i].time);
                }
                for (var j = 0; j < data[0].goodslist.length; j++){
                    data[0].goodslist[j].addTime = formatDate(data[0].goodslist[j].time)
                }
                
            }else if (see == "Icode" || see == "DditIcode"){
                for (var i = 0; i < data.length; i++) {
                    data[i].addTime = formatDate(data[i].time);
                    if(data[i].goodsState == "in") {
                        data[i].goodsState = "监控"
                    }else {
                        data[i].goodsState = "已出库"
                    }
                }
            }
            else{
                for (var i = 0; i < data.length; i++) {
                    data[i].addTime = formatDate(data[i].time);
                }
                
            }
            jsArr.items.length = 0;
            for(var i=0;i<data.length;i++){
                jsArr.items.push(data[i])
            }
            console.log(jsArr)
            $('.yemain').children().remove();
            var str = template(temp, jsArr);
            $('.yemain').append(str);
            DataTime();
            },
            error: function () {
                alert("数据获取有问题");
            }
      
    })
}

// 获取下拉仓库
function WarehouseList(){
    $.ajax({
        type: "POST",
        url: "http://10.10.72.10:8080/rfid1.1/WareHouse/warehouseList.action",
        data: undefined,
        dataType: "json",
        success: function(data){
            for(var i=0;i<data.length;i++){
                jsArr.code.push(data[i])
            }
        },
        error: function () {
            alert("仓库数据获取失败")
        }
    })
}
// 初始页面
$(function () {
    var json = {
        token: id
    }
    // 获取登陆信息
    $.ajax({
        type: "POST",
        url: "http://10.10.72.10:8080/rfid1.1/User/token.action",
        data: json,
        dataType: "json",
        success: function (data) {    
            if (data.status == 200){
                // 获取仓库下拉数据
                WarehouseList();
                loginId = data.data.userId;
                loginName = data.data.userName;
                loginPhone = data.data.userPhone;
                StatisticsAjax("http://10.10.72.10:8080/rfid1.1/AlarmRecord/index.action","Index","index")
              }else {
                alert('登陆过期，请重新登陆');
                window.location="Login.html";
              }
        },
        error:function () {
            alert('获取数据失败，返回登陆界面');
            window.location="Login.html";
        }
    }) 
    // 首页
    $('.li0').click(function () {
        var that = this;
        Btnblue(that);
        StatisticsAjax("http://10.10.72.10:8080/rfid1.1/AlarmRecord/index.action","Index","index");
    })
    //监控管理
    $('.li1').click(function () {   
        var that = this;
        Btnblue(that);   
        ajax("http://10.10.72.10:8080/rfid1.1/AlarmRecord/selectNowAlarmRecord.action","Rmonitoring","","");
    });

    $('.li2').click(function () {
        var that = this;
        Btnblue(that);
        ajax("http://10.10.72.10:8080/rfid1.1/AlarmRecord/selectAllAlarmRecord.action","Hmonitoring","","");
    });
    //物品管理
    $('.li3').click(function () {
        var that = this;
        Btnblue(that);
        ajax("http://10.10.72.10:8080/rfid1.1/Goods/selectGoodsByQueryVo.action","Icode","","Icode");
    });
    $('.li4').click(function () {
        var that = this;
        Btnblue(that);
        ajax("http://10.10.72.10:8080/rfid1.1/Export/selectAll.action","Ocode","","");
    });
    $('.li5').click(function () {
        var that = this;
        Btnblue(that);
        ajax("http://10.10.72.10:8080/rfid1.1/Inport/selectAllInport.action","Ecode","","");
    });
    $('.li6').click(function () {
        var that = this;
        Btnblue(that);
        ajax("http://10.10.72.10:8080/rfid1.1/WareHouse/selectAllWareHouse.action","Wcode","","");
    });
    //数据统计
    $('.li7').click(function () {
        var that = this;
        Btnblue(that);
        StatisticsAjax("http://10.10.72.10:8080/rfid1.1/Goods/goodsCount.action","DStatistics");
        ChartAjax("http://10.10.72.10:8080/rfid1.1/Goods/countGoodsSevenDays.action");
    });
    $('.li8').click(function () {
        var that = this;
        Btnblue(that);
        StatisticsAjax("http://10.10.72.10:8080/rfid1.1/Export/exportCount.action","DStatistics");
        ChartAjax("http://10.10.72.10:8080/rfid1.1/Export/countExportSevenDays.action");
    });
    $('.li9').click(function () {
        var that = this;
        Btnblue(that);
        StatisticsAjax("http://10.10.72.10:8080/rfid1.1/Inport/inportCount.action","DStatistics");
        ChartAjax("http://10.10.72.10:8080/rfid1.1/Inport/countInportSevenDays.action");
    });
    $('.li10').click(function () {
        var that = this;
        Btnblue(that);
        StatisticsAjax("http://10.10.72.10:8080/rfid1.1/AlarmRecord/AlarmRecordCount.action","DStatistics");
        ChartAjax("http://10.10.72.10:8080/rfid1.1/AlarmRecord/countAlarmRecordSevenDays.action");
    });
    //系统管理
    $('.li11').click(function () {
        var that = this;
        Btnblue(that);
        $('.yemain').children().remove();
        var str = template('Ipush');
        $('.yemain').append(str);
    });
    $('.li12').click(function () {
        var that = this;
        Btnblue(that);
        ajax("http://10.10.72.10:8080/rfid1.1/User/selectAllUser.action", "IAmanagement");
    });
    $('.li13').click(function () {
        var that = this;
        Btnblue(that);
        $('.yemain').children().remove();
        var str = template('RAmanagement');
        $('.yemain').append(str);

    });
    $('.li14').click(function () {
        var that = this;
        Btnblue(that);
        $('.yemain').children().remove();
        var str = template('JAmanagement');
        $('.yemain').append(str);
    });
    // 导航点击
    function Btnblue(that){
        for(var i=0;i<15;i++){
            $('.li'+i).removeClass("Btnblue")
        }
        $(that).addClass("Btnblue");
    }
    //获取数据统计顶部数据
    function StatisticsAjax(url,temp,name){
        $.ajax({
            type: "POST",
            url: url,
            data: undefined,
            dataType: "json",
            success: function (data) {
                var item = [];
                var sum = [];
                var record = [];
                for (var i in data){
                    if(i == "alarmList"){
                        continue;
                    }else if (i == "监控数"){
                        continue;
                    }
                    item.push(i);
                    sum.push(data[i])
                }
                                
                if (name == "index"){
                    var alarmList = data.alarmList;
                    for (var i = 0;i<alarmList.length;i++) {
                        alarmList[i].addTime = formatDate(alarmList[i].alarmRecordTime);
                        record.push(alarmList[i]);
                    }
                }
                 var jsnum = {
                    item : item,
                    cate: sum,
                    record : record
                }               
                $('.yemain').children().remove();
                var str = template(temp, jsnum);
                $('.yemain').append(str);
            },
            error: function(){
                alert("数据有错误")
            }
        });
    }
    //获取数据统计数据图数据
    function ChartAjax(url){
        $.ajax({
            type: "POST",
            url:url,
            data: undefined,
            dataType: "json",
            success: function (data) {
                var date = [];
                var sum = [];
                for (var i in data) {
                    date.push(i);
                    sum.push(data[i]);
                    EChart(date,sum )
                }
            }
        })
    }




    //统计图
    function EChart(date,sum ) {
        var myChart = echarts.init(document.getElementById('main'));
        var option = {
            color: ['#1296db'],
            tooltip : {
                trigger: 'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            xAxis : [
                {
                    type : 'category',
                    data : date,
                    axisTick: {
                        alignWithLabel: true
                    }
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'震动次数',
                    type:'bar',
                    barWidth: '60%',
                    data:sum
                }
            ]
        };
        myChart.setOption(option);
    }
})