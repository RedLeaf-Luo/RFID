package com.bulb.rfid.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlarmRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmRecordExample() {
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

        public Criteria andAlarmRecordIdIsNull() {
            addCriterion("alarm_record_id is null");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdIsNotNull() {
            addCriterion("alarm_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdEqualTo(Integer value) {
            addCriterion("alarm_record_id =", value, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdNotEqualTo(Integer value) {
            addCriterion("alarm_record_id <>", value, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdGreaterThan(Integer value) {
            addCriterion("alarm_record_id >", value, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_record_id >=", value, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdLessThan(Integer value) {
            addCriterion("alarm_record_id <", value, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_record_id <=", value, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdIn(List<Integer> values) {
            addCriterion("alarm_record_id in", values, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdNotIn(List<Integer> values) {
            addCriterion("alarm_record_id not in", values, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("alarm_record_id between", value1, value2, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_record_id not between", value1, value2, "alarmRecordId");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
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

        public Criteria andAlarmRecordTimeIsNull() {
            addCriterion("alarm_record_time is null");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeIsNotNull() {
            addCriterion("alarm_record_time is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeEqualTo(Date value) {
            addCriterion("alarm_record_time =", value, "alarmRecordTime");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeNotEqualTo(Date value) {
            addCriterion("alarm_record_time <>", value, "alarmRecordTime");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeGreaterThan(Date value) {
            addCriterion("alarm_record_time >", value, "alarmRecordTime");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("alarm_record_time >=", value, "alarmRecordTime");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeLessThan(Date value) {
            addCriterion("alarm_record_time <", value, "alarmRecordTime");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("alarm_record_time <=", value, "alarmRecordTime");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeIn(List<Date> values) {
            addCriterion("alarm_record_time in", values, "alarmRecordTime");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeNotIn(List<Date> values) {
            addCriterion("alarm_record_time not in", values, "alarmRecordTime");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeBetween(Date value1, Date value2) {
            addCriterion("alarm_record_time between", value1, value2, "alarmRecordTime");
            return (Criteria) this;
        }

        public Criteria andAlarmRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("alarm_record_time not between", value1, value2, "alarmRecordTime");
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