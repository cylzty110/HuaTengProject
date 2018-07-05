package com.vzionsys.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TsTaskInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TsTaskInfoExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgIsNull() {
            addCriterion("TASK_TABLE_MSG is null");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgIsNotNull() {
            addCriterion("TASK_TABLE_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgEqualTo(String value) {
            addCriterion("TASK_TABLE_MSG =", value, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgNotEqualTo(String value) {
            addCriterion("TASK_TABLE_MSG <>", value, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgGreaterThan(String value) {
            addCriterion("TASK_TABLE_MSG >", value, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_MSG >=", value, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgLessThan(String value) {
            addCriterion("TASK_TABLE_MSG <", value, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgLessThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_MSG <=", value, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgLike(String value) {
            addCriterion("TASK_TABLE_MSG like", value, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgNotLike(String value) {
            addCriterion("TASK_TABLE_MSG not like", value, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgIn(List<String> values) {
            addCriterion("TASK_TABLE_MSG in", values, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgNotIn(List<String> values) {
            addCriterion("TASK_TABLE_MSG not in", values, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_MSG between", value1, value2, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableMsgNotBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_MSG not between", value1, value2, "taskTableMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgIsNull() {
            addCriterion("TASK_TABLE_BATCH_MSG is null");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgIsNotNull() {
            addCriterion("TASK_TABLE_BATCH_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgEqualTo(String value) {
            addCriterion("TASK_TABLE_BATCH_MSG =", value, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgNotEqualTo(String value) {
            addCriterion("TASK_TABLE_BATCH_MSG <>", value, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgGreaterThan(String value) {
            addCriterion("TASK_TABLE_BATCH_MSG >", value, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_BATCH_MSG >=", value, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgLessThan(String value) {
            addCriterion("TASK_TABLE_BATCH_MSG <", value, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgLessThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_BATCH_MSG <=", value, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgLike(String value) {
            addCriterion("TASK_TABLE_BATCH_MSG like", value, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgNotLike(String value) {
            addCriterion("TASK_TABLE_BATCH_MSG not like", value, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgIn(List<String> values) {
            addCriterion("TASK_TABLE_BATCH_MSG in", values, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgNotIn(List<String> values) {
            addCriterion("TASK_TABLE_BATCH_MSG not in", values, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_BATCH_MSG between", value1, value2, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskTableBatchMsgNotBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_BATCH_MSG not between", value1, value2, "taskTableBatchMsg");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageIsNull() {
            addCriterion("TASK_RETURN_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageIsNotNull() {
            addCriterion("TASK_RETURN_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageEqualTo(String value) {
            addCriterion("TASK_RETURN_MESSAGE =", value, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageNotEqualTo(String value) {
            addCriterion("TASK_RETURN_MESSAGE <>", value, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageGreaterThan(String value) {
            addCriterion("TASK_RETURN_MESSAGE >", value, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_RETURN_MESSAGE >=", value, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageLessThan(String value) {
            addCriterion("TASK_RETURN_MESSAGE <", value, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageLessThanOrEqualTo(String value) {
            addCriterion("TASK_RETURN_MESSAGE <=", value, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageLike(String value) {
            addCriterion("TASK_RETURN_MESSAGE like", value, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageNotLike(String value) {
            addCriterion("TASK_RETURN_MESSAGE not like", value, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageIn(List<String> values) {
            addCriterion("TASK_RETURN_MESSAGE in", values, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageNotIn(List<String> values) {
            addCriterion("TASK_RETURN_MESSAGE not in", values, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageBetween(String value1, String value2) {
            addCriterion("TASK_RETURN_MESSAGE between", value1, value2, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskReturnMessageNotBetween(String value1, String value2) {
            addCriterion("TASK_RETURN_MESSAGE not between", value1, value2, "taskReturnMessage");
            return (Criteria) this;
        }

        public Criteria andTaskDateIsNull() {
            addCriterion("TASK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTaskDateIsNotNull() {
            addCriterion("TASK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDateEqualTo(String value) {
            addCriterion("TASK_DATE =", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateNotEqualTo(String value) {
            addCriterion("TASK_DATE <>", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateGreaterThan(String value) {
            addCriterion("TASK_DATE >", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_DATE >=", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateLessThan(String value) {
            addCriterion("TASK_DATE <", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateLessThanOrEqualTo(String value) {
            addCriterion("TASK_DATE <=", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateLike(String value) {
            addCriterion("TASK_DATE like", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateNotLike(String value) {
            addCriterion("TASK_DATE not like", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateIn(List<String> values) {
            addCriterion("TASK_DATE in", values, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateNotIn(List<String> values) {
            addCriterion("TASK_DATE not in", values, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateBetween(String value1, String value2) {
            addCriterion("TASK_DATE between", value1, value2, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateNotBetween(String value1, String value2) {
            addCriterion("TASK_DATE not between", value1, value2, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateIsNull() {
            addCriterion("TASK_RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateIsNotNull() {
            addCriterion("TASK_RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateEqualTo(String value) {
            addCriterion("TASK_RETURN_DATE =", value, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateNotEqualTo(String value) {
            addCriterion("TASK_RETURN_DATE <>", value, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateGreaterThan(String value) {
            addCriterion("TASK_RETURN_DATE >", value, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_RETURN_DATE >=", value, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateLessThan(String value) {
            addCriterion("TASK_RETURN_DATE <", value, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateLessThanOrEqualTo(String value) {
            addCriterion("TASK_RETURN_DATE <=", value, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateLike(String value) {
            addCriterion("TASK_RETURN_DATE like", value, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateNotLike(String value) {
            addCriterion("TASK_RETURN_DATE not like", value, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateIn(List<String> values) {
            addCriterion("TASK_RETURN_DATE in", values, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateNotIn(List<String> values) {
            addCriterion("TASK_RETURN_DATE not in", values, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateBetween(String value1, String value2) {
            addCriterion("TASK_RETURN_DATE between", value1, value2, "taskReturnDate");
            return (Criteria) this;
        }

        public Criteria andTaskReturnDateNotBetween(String value1, String value2) {
            addCriterion("TASK_RETURN_DATE not between", value1, value2, "taskReturnDate");
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

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("CREATE_USER_ID like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("CREATE_USER_ID not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
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

        public Criteria andTaskStatusIsNull() {
            addCriterion("TASK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("TASK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(String value) {
            addCriterion("TASK_STATUS =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(String value) {
            addCriterion("TASK_STATUS <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(String value) {
            addCriterion("TASK_STATUS >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(String value) {
            addCriterion("TASK_STATUS <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLike(String value) {
            addCriterion("TASK_STATUS like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotLike(String value) {
            addCriterion("TASK_STATUS not like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<String> values) {
            addCriterion("TASK_STATUS in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<String> values) {
            addCriterion("TASK_STATUS not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(String value1, String value2) {
            addCriterion("TASK_STATUS between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(String value1, String value2) {
            addCriterion("TASK_STATUS not between", value1, value2, "taskStatus");
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