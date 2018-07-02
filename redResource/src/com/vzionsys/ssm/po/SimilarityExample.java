package com.vzionsys.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class SimilarityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimilarityExample() {
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

        public Criteria andFundIdFirstIsNull() {
            addCriterion("FUND_ID_FIRST is null");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstIsNotNull() {
            addCriterion("FUND_ID_FIRST is not null");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstEqualTo(String value) {
            addCriterion("FUND_ID_FIRST =", value, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstNotEqualTo(String value) {
            addCriterion("FUND_ID_FIRST <>", value, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstGreaterThan(String value) {
            addCriterion("FUND_ID_FIRST >", value, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_ID_FIRST >=", value, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstLessThan(String value) {
            addCriterion("FUND_ID_FIRST <", value, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstLessThanOrEqualTo(String value) {
            addCriterion("FUND_ID_FIRST <=", value, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstLike(String value) {
            addCriterion("FUND_ID_FIRST like", value, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstNotLike(String value) {
            addCriterion("FUND_ID_FIRST not like", value, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstIn(List<String> values) {
            addCriterion("FUND_ID_FIRST in", values, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstNotIn(List<String> values) {
            addCriterion("FUND_ID_FIRST not in", values, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstBetween(String value1, String value2) {
            addCriterion("FUND_ID_FIRST between", value1, value2, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdFirstNotBetween(String value1, String value2) {
            addCriterion("FUND_ID_FIRST not between", value1, value2, "fundIdFirst");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondIsNull() {
            addCriterion("FUND_ID_SECOND is null");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondIsNotNull() {
            addCriterion("FUND_ID_SECOND is not null");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondEqualTo(String value) {
            addCriterion("FUND_ID_SECOND =", value, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondNotEqualTo(String value) {
            addCriterion("FUND_ID_SECOND <>", value, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondGreaterThan(String value) {
            addCriterion("FUND_ID_SECOND >", value, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_ID_SECOND >=", value, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondLessThan(String value) {
            addCriterion("FUND_ID_SECOND <", value, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondLessThanOrEqualTo(String value) {
            addCriterion("FUND_ID_SECOND <=", value, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondLike(String value) {
            addCriterion("FUND_ID_SECOND like", value, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondNotLike(String value) {
            addCriterion("FUND_ID_SECOND not like", value, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondIn(List<String> values) {
            addCriterion("FUND_ID_SECOND in", values, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondNotIn(List<String> values) {
            addCriterion("FUND_ID_SECOND not in", values, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondBetween(String value1, String value2) {
            addCriterion("FUND_ID_SECOND between", value1, value2, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andFundIdSecondNotBetween(String value1, String value2) {
            addCriterion("FUND_ID_SECOND not between", value1, value2, "fundIdSecond");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("SCORE like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("SCORE not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("SCORE not between", value1, value2, "score");
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