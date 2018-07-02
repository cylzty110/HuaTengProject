package com.vzionsys.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class ScrTnacExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScrTnacExample() {
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

        public Criteria andScrTxnAccnoIsNull() {
            addCriterion("SCR_TXN_ACCNO is null");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoIsNotNull() {
            addCriterion("SCR_TXN_ACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoEqualTo(String value) {
            addCriterion("SCR_TXN_ACCNO =", value, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoNotEqualTo(String value) {
            addCriterion("SCR_TXN_ACCNO <>", value, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoGreaterThan(String value) {
            addCriterion("SCR_TXN_ACCNO >", value, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoGreaterThanOrEqualTo(String value) {
            addCriterion("SCR_TXN_ACCNO >=", value, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoLessThan(String value) {
            addCriterion("SCR_TXN_ACCNO <", value, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoLessThanOrEqualTo(String value) {
            addCriterion("SCR_TXN_ACCNO <=", value, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoLike(String value) {
            addCriterion("SCR_TXN_ACCNO like", value, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoNotLike(String value) {
            addCriterion("SCR_TXN_ACCNO not like", value, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoIn(List<String> values) {
            addCriterion("SCR_TXN_ACCNO in", values, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoNotIn(List<String> values) {
            addCriterion("SCR_TXN_ACCNO not in", values, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoBetween(String value1, String value2) {
            addCriterion("SCR_TXN_ACCNO between", value1, value2, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andScrTxnAccnoNotBetween(String value1, String value2) {
            addCriterion("SCR_TXN_ACCNO not between", value1, value2, "scrTxnAccno");
            return (Criteria) this;
        }

        public Criteria andCstIdIsNull() {
            addCriterion("CST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCstIdIsNotNull() {
            addCriterion("CST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCstIdEqualTo(String value) {
            addCriterion("CST_ID =", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotEqualTo(String value) {
            addCriterion("CST_ID <>", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdGreaterThan(String value) {
            addCriterion("CST_ID >", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdGreaterThanOrEqualTo(String value) {
            addCriterion("CST_ID >=", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdLessThan(String value) {
            addCriterion("CST_ID <", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdLessThanOrEqualTo(String value) {
            addCriterion("CST_ID <=", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdLike(String value) {
            addCriterion("CST_ID like", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotLike(String value) {
            addCriterion("CST_ID not like", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdIn(List<String> values) {
            addCriterion("CST_ID in", values, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotIn(List<String> values) {
            addCriterion("CST_ID not in", values, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdBetween(String value1, String value2) {
            addCriterion("CST_ID between", value1, value2, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotBetween(String value1, String value2) {
            addCriterion("CST_ID not between", value1, value2, "cstId");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(String value) {
            addCriterion("UPLOAD_TIME =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(String value) {
            addCriterion("UPLOAD_TIME <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(String value) {
            addCriterion("UPLOAD_TIME >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_TIME >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(String value) {
            addCriterion("UPLOAD_TIME <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_TIME <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLike(String value) {
            addCriterion("UPLOAD_TIME like", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotLike(String value) {
            addCriterion("UPLOAD_TIME not like", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<String> values) {
            addCriterion("UPLOAD_TIME in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<String> values) {
            addCriterion("UPLOAD_TIME not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(String value1, String value2) {
            addCriterion("UPLOAD_TIME between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_TIME not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadUserIsNull() {
            addCriterion("UPLOAD_USER is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIsNotNull() {
            addCriterion("UPLOAD_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserEqualTo(String value) {
            addCriterion("UPLOAD_USER =", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotEqualTo(String value) {
            addCriterion("UPLOAD_USER <>", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserGreaterThan(String value) {
            addCriterion("UPLOAD_USER >", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_USER >=", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserLessThan(String value) {
            addCriterion("UPLOAD_USER <", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_USER <=", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserLike(String value) {
            addCriterion("UPLOAD_USER like", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotLike(String value) {
            addCriterion("UPLOAD_USER not like", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserIn(List<String> values) {
            addCriterion("UPLOAD_USER in", values, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotIn(List<String> values) {
            addCriterion("UPLOAD_USER not in", values, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserBetween(String value1, String value2) {
            addCriterion("UPLOAD_USER between", value1, value2, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_USER not between", value1, value2, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadBatchIsNull() {
            addCriterion("UPLOAD_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andUploadBatchIsNotNull() {
            addCriterion("UPLOAD_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andUploadBatchEqualTo(String value) {
            addCriterion("UPLOAD_BATCH =", value, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchNotEqualTo(String value) {
            addCriterion("UPLOAD_BATCH <>", value, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchGreaterThan(String value) {
            addCriterion("UPLOAD_BATCH >", value, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_BATCH >=", value, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchLessThan(String value) {
            addCriterion("UPLOAD_BATCH <", value, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_BATCH <=", value, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchLike(String value) {
            addCriterion("UPLOAD_BATCH like", value, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchNotLike(String value) {
            addCriterion("UPLOAD_BATCH not like", value, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchIn(List<String> values) {
            addCriterion("UPLOAD_BATCH in", values, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchNotIn(List<String> values) {
            addCriterion("UPLOAD_BATCH not in", values, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchBetween(String value1, String value2) {
            addCriterion("UPLOAD_BATCH between", value1, value2, "uploadBatch");
            return (Criteria) this;
        }

        public Criteria andUploadBatchNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_BATCH not between", value1, value2, "uploadBatch");
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