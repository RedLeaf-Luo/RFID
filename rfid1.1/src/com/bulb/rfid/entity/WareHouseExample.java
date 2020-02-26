package com.bulb.rfid.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WareHouseExample() {
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

        public Criteria andWareHouseIdIsNull() {
            addCriterion("ware_house_id is null");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdIsNotNull() {
            addCriterion("ware_house_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdEqualTo(String value) {
            addCriterion("ware_house_id =", value, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdNotEqualTo(String value) {
            addCriterion("ware_house_id <>", value, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdGreaterThan(String value) {
            addCriterion("ware_house_id >", value, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("ware_house_id >=", value, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdLessThan(String value) {
            addCriterion("ware_house_id <", value, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdLessThanOrEqualTo(String value) {
            addCriterion("ware_house_id <=", value, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdLike(String value) {
            addCriterion("ware_house_id like", value, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdNotLike(String value) {
            addCriterion("ware_house_id not like", value, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdIn(List<String> values) {
            addCriterion("ware_house_id in", values, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdNotIn(List<String> values) {
            addCriterion("ware_house_id not in", values, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdBetween(String value1, String value2) {
            addCriterion("ware_house_id between", value1, value2, "wareHouseId");
            return (Criteria) this;
        }

        public Criteria andWareHouseIdNotBetween(String value1, String value2) {
            addCriterion("ware_house_id not between", value1, value2, "wareHouseId");
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

        public Criteria andWareHouseAddressIsNull() {
            addCriterion("ware_house_address is null");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressIsNotNull() {
            addCriterion("ware_house_address is not null");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressEqualTo(String value) {
            addCriterion("ware_house_address =", value, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressNotEqualTo(String value) {
            addCriterion("ware_house_address <>", value, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressGreaterThan(String value) {
            addCriterion("ware_house_address >", value, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ware_house_address >=", value, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressLessThan(String value) {
            addCriterion("ware_house_address <", value, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("ware_house_address <=", value, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressLike(String value) {
            addCriterion("ware_house_address like", value, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressNotLike(String value) {
            addCriterion("ware_house_address not like", value, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressIn(List<String> values) {
            addCriterion("ware_house_address in", values, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressNotIn(List<String> values) {
            addCriterion("ware_house_address not in", values, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressBetween(String value1, String value2) {
            addCriterion("ware_house_address between", value1, value2, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddressNotBetween(String value1, String value2) {
            addCriterion("ware_house_address not between", value1, value2, "wareHouseAddress");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeIsNull() {
            addCriterion("ware_house_add_time is null");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeIsNotNull() {
            addCriterion("ware_house_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeEqualTo(Date value) {
            addCriterion("ware_house_add_time =", value, "wareHouseAddTime");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeNotEqualTo(Date value) {
            addCriterion("ware_house_add_time <>", value, "wareHouseAddTime");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeGreaterThan(Date value) {
            addCriterion("ware_house_add_time >", value, "wareHouseAddTime");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ware_house_add_time >=", value, "wareHouseAddTime");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeLessThan(Date value) {
            addCriterion("ware_house_add_time <", value, "wareHouseAddTime");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("ware_house_add_time <=", value, "wareHouseAddTime");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeIn(List<Date> values) {
            addCriterion("ware_house_add_time in", values, "wareHouseAddTime");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeNotIn(List<Date> values) {
            addCriterion("ware_house_add_time not in", values, "wareHouseAddTime");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeBetween(Date value1, Date value2) {
            addCriterion("ware_house_add_time between", value1, value2, "wareHouseAddTime");
            return (Criteria) this;
        }

        public Criteria andWareHouseAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("ware_house_add_time not between", value1, value2, "wareHouseAddTime");
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