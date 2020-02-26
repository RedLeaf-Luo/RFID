package com.bulb.rfid.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andExportIdIsNull() {
            addCriterion("export_id is null");
            return (Criteria) this;
        }

        public Criteria andExportIdIsNotNull() {
            addCriterion("export_id is not null");
            return (Criteria) this;
        }

        public Criteria andExportIdEqualTo(Integer value) {
            addCriterion("export_id =", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotEqualTo(Integer value) {
            addCriterion("export_id <>", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdGreaterThan(Integer value) {
            addCriterion("export_id >", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("export_id >=", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLessThan(Integer value) {
            addCriterion("export_id <", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLessThanOrEqualTo(Integer value) {
            addCriterion("export_id <=", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdIn(List<Integer> values) {
            addCriterion("export_id in", values, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotIn(List<Integer> values) {
            addCriterion("export_id not in", values, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdBetween(Integer value1, Integer value2) {
            addCriterion("export_id between", value1, value2, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("export_id not between", value1, value2, "exportId");
            return (Criteria) this;
        }

        public Criteria andRfidIdIsNull() {
            addCriterion("rfid_id is null");
            return (Criteria) this;
        }

        public Criteria andRfidIdIsNotNull() {
            addCriterion("rfid_id is not null");
            return (Criteria) this;
        }

        public Criteria andRfidIdEqualTo(String value) {
            addCriterion("rfid_id =", value, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdNotEqualTo(String value) {
            addCriterion("rfid_id <>", value, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdGreaterThan(String value) {
            addCriterion("rfid_id >", value, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdGreaterThanOrEqualTo(String value) {
            addCriterion("rfid_id >=", value, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdLessThan(String value) {
            addCriterion("rfid_id <", value, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdLessThanOrEqualTo(String value) {
            addCriterion("rfid_id <=", value, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdLike(String value) {
            addCriterion("rfid_id like", value, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdNotLike(String value) {
            addCriterion("rfid_id not like", value, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdIn(List<String> values) {
            addCriterion("rfid_id in", values, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdNotIn(List<String> values) {
            addCriterion("rfid_id not in", values, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdBetween(String value1, String value2) {
            addCriterion("rfid_id between", value1, value2, "rfidId");
            return (Criteria) this;
        }

        public Criteria andRfidIdNotBetween(String value1, String value2) {
            addCriterion("rfid_id not between", value1, value2, "rfidId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameIsNull() {
            addCriterion("ware_house_name is null");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameIsNotNull() {
            addCriterion("ware_house_name is not null");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameEqualTo(String value) {
            addCriterion("ware_house_name =", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameNotEqualTo(String value) {
            addCriterion("ware_house_name <>", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameGreaterThan(String value) {
            addCriterion("ware_house_name >", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("ware_house_name >=", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameLessThan(String value) {
            addCriterion("ware_house_name <", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameLessThanOrEqualTo(String value) {
            addCriterion("ware_house_name <=", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameLike(String value) {
            addCriterion("ware_house_name like", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameNotLike(String value) {
            addCriterion("ware_house_name not like", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameIn(List<String> values) {
            addCriterion("ware_house_name in", values, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameNotIn(List<String> values) {
            addCriterion("ware_house_name not in", values, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameBetween(String value1, String value2) {
            addCriterion("ware_house_name between", value1, value2, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameNotBetween(String value1, String value2) {
            addCriterion("ware_house_name not between", value1, value2, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andExportTimeIsNull() {
            addCriterion("export_time is null");
            return (Criteria) this;
        }

        public Criteria andExportTimeIsNotNull() {
            addCriterion("export_time is not null");
            return (Criteria) this;
        }

        public Criteria andExportTimeEqualTo(Date value) {
            addCriterion("export_time =", value, "exportTime");
            return (Criteria) this;
        }

        public Criteria andExportTimeNotEqualTo(Date value) {
            addCriterion("export_time <>", value, "exportTime");
            return (Criteria) this;
        }

        public Criteria andExportTimeGreaterThan(Date value) {
            addCriterion("export_time >", value, "exportTime");
            return (Criteria) this;
        }

        public Criteria andExportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("export_time >=", value, "exportTime");
            return (Criteria) this;
        }

        public Criteria andExportTimeLessThan(Date value) {
            addCriterion("export_time <", value, "exportTime");
            return (Criteria) this;
        }

        public Criteria andExportTimeLessThanOrEqualTo(Date value) {
            addCriterion("export_time <=", value, "exportTime");
            return (Criteria) this;
        }

        public Criteria andExportTimeIn(List<Date> values) {
            addCriterion("export_time in", values, "exportTime");
            return (Criteria) this;
        }

        public Criteria andExportTimeNotIn(List<Date> values) {
            addCriterion("export_time not in", values, "exportTime");
            return (Criteria) this;
        }

        public Criteria andExportTimeBetween(Date value1, Date value2) {
            addCriterion("export_time between", value1, value2, "exportTime");
            return (Criteria) this;
        }

        public Criteria andExportTimeNotBetween(Date value1, Date value2) {
            addCriterion("export_time not between", value1, value2, "exportTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}