package com.jack.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CmsConfigQuotaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsConfigQuotaExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andDayCountIsNull() {
            addCriterion("day_count is null");
            return (Criteria) this;
        }

        public Criteria andDayCountIsNotNull() {
            addCriterion("day_count is not null");
            return (Criteria) this;
        }

        public Criteria andDayCountEqualTo(Integer value) {
            addCriterion("day_count =", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountNotEqualTo(Integer value) {
            addCriterion("day_count <>", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountGreaterThan(Integer value) {
            addCriterion("day_count >", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_count >=", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountLessThan(Integer value) {
            addCriterion("day_count <", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountLessThanOrEqualTo(Integer value) {
            addCriterion("day_count <=", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountIn(List<Integer> values) {
            addCriterion("day_count in", values, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountNotIn(List<Integer> values) {
            addCriterion("day_count not in", values, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountBetween(Integer value1, Integer value2) {
            addCriterion("day_count between", value1, value2, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("day_count not between", value1, value2, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayAmountIsNull() {
            addCriterion("day_amount is null");
            return (Criteria) this;
        }

        public Criteria andDayAmountIsNotNull() {
            addCriterion("day_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDayAmountEqualTo(BigDecimal value) {
            addCriterion("day_amount =", value, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andDayAmountNotEqualTo(BigDecimal value) {
            addCriterion("day_amount <>", value, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andDayAmountGreaterThan(BigDecimal value) {
            addCriterion("day_amount >", value, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andDayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("day_amount >=", value, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andDayAmountLessThan(BigDecimal value) {
            addCriterion("day_amount <", value, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andDayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("day_amount <=", value, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andDayAmountIn(List<BigDecimal> values) {
            addCriterion("day_amount in", values, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andDayAmountNotIn(List<BigDecimal> values) {
            addCriterion("day_amount not in", values, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andDayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_amount between", value1, value2, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andDayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_amount not between", value1, value2, "dayAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountIsNull() {
            addCriterion("single_amount is null");
            return (Criteria) this;
        }

        public Criteria andSingleAmountIsNotNull() {
            addCriterion("single_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSingleAmountEqualTo(BigDecimal value) {
            addCriterion("single_amount =", value, "singleAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountNotEqualTo(BigDecimal value) {
            addCriterion("single_amount <>", value, "singleAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountGreaterThan(BigDecimal value) {
            addCriterion("single_amount >", value, "singleAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("single_amount >=", value, "singleAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountLessThan(BigDecimal value) {
            addCriterion("single_amount <", value, "singleAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("single_amount <=", value, "singleAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountIn(List<BigDecimal> values) {
            addCriterion("single_amount in", values, "singleAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountNotIn(List<BigDecimal> values) {
            addCriterion("single_amount not in", values, "singleAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("single_amount between", value1, value2, "singleAmount");
            return (Criteria) this;
        }

        public Criteria andSingleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("single_amount not between", value1, value2, "singleAmount");
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