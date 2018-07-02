package com.vzionsys.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TtFundDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TtFundDataExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andProbilityIsNull() {
            addCriterion("PROBILITY is null");
            return (Criteria) this;
        }

        public Criteria andProbilityIsNotNull() {
            addCriterion("PROBILITY is not null");
            return (Criteria) this;
        }

        public Criteria andProbilityEqualTo(String value) {
            addCriterion("PROBILITY =", value, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityNotEqualTo(String value) {
            addCriterion("PROBILITY <>", value, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityGreaterThan(String value) {
            addCriterion("PROBILITY >", value, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityGreaterThanOrEqualTo(String value) {
            addCriterion("PROBILITY >=", value, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityLessThan(String value) {
            addCriterion("PROBILITY <", value, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityLessThanOrEqualTo(String value) {
            addCriterion("PROBILITY <=", value, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityLike(String value) {
            addCriterion("PROBILITY like", value, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityNotLike(String value) {
            addCriterion("PROBILITY not like", value, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityIn(List<String> values) {
            addCriterion("PROBILITY in", values, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityNotIn(List<String> values) {
            addCriterion("PROBILITY not in", values, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityBetween(String value1, String value2) {
            addCriterion("PROBILITY between", value1, value2, "probility");
            return (Criteria) this;
        }

        public Criteria andProbilityNotBetween(String value1, String value2) {
            addCriterion("PROBILITY not between", value1, value2, "probility");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIsNull() {
            addCriterion("TASK_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIsNotNull() {
            addCriterion("TASK_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andTaskBatchEqualTo(String value) {
            addCriterion("TASK_BATCH =", value, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchNotEqualTo(String value) {
            addCriterion("TASK_BATCH <>", value, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchGreaterThan(String value) {
            addCriterion("TASK_BATCH >", value, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_BATCH >=", value, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchLessThan(String value) {
            addCriterion("TASK_BATCH <", value, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchLessThanOrEqualTo(String value) {
            addCriterion("TASK_BATCH <=", value, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchLike(String value) {
            addCriterion("TASK_BATCH like", value, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchNotLike(String value) {
            addCriterion("TASK_BATCH not like", value, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIn(List<String> values) {
            addCriterion("TASK_BATCH in", values, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchNotIn(List<String> values) {
            addCriterion("TASK_BATCH not in", values, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchBetween(String value1, String value2) {
            addCriterion("TASK_BATCH between", value1, value2, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andTaskBatchNotBetween(String value1, String value2) {
            addCriterion("TASK_BATCH not between", value1, value2, "taskBatch");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
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