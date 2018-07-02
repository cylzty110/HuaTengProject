package com.vzionsys.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class ScrTxndnInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScrTxndnInfExample() {
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

        public Criteria andTxnCfmDtIsNull() {
            addCriterion("TXN_CFM_DT is null");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtIsNotNull() {
            addCriterion("TXN_CFM_DT is not null");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtEqualTo(String value) {
            addCriterion("TXN_CFM_DT =", value, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtNotEqualTo(String value) {
            addCriterion("TXN_CFM_DT <>", value, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtGreaterThan(String value) {
            addCriterion("TXN_CFM_DT >", value, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtGreaterThanOrEqualTo(String value) {
            addCriterion("TXN_CFM_DT >=", value, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtLessThan(String value) {
            addCriterion("TXN_CFM_DT <", value, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtLessThanOrEqualTo(String value) {
            addCriterion("TXN_CFM_DT <=", value, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtLike(String value) {
            addCriterion("TXN_CFM_DT like", value, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtNotLike(String value) {
            addCriterion("TXN_CFM_DT not like", value, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtIn(List<String> values) {
            addCriterion("TXN_CFM_DT in", values, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtNotIn(List<String> values) {
            addCriterion("TXN_CFM_DT not in", values, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtBetween(String value1, String value2) {
            addCriterion("TXN_CFM_DT between", value1, value2, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andTxnCfmDtNotBetween(String value1, String value2) {
            addCriterion("TXN_CFM_DT not between", value1, value2, "txnCfmDt");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdIsNull() {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD is null");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdIsNotNull() {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD is not null");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdEqualTo(String value) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD =", value, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdNotEqualTo(String value) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD <>", value, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdGreaterThan(String value) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD >", value, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdGreaterThanOrEqualTo(String value) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD >=", value, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdLessThan(String value) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD <", value, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdLessThanOrEqualTo(String value) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD <=", value, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdLike(String value) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD like", value, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdNotLike(String value) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD not like", value, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdIn(List<String> values) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD in", values, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdNotIn(List<String> values) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD not in", values, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdBetween(String value1, String value2) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD between", value1, value2, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andFndbgamtrdmtnpcsgtpcdNotBetween(String value1, String value2) {
            addCriterion("FNDBGAMTRDMTNPCSGTPCD not between", value1, value2, "fndbgamtrdmtnpcsgtpcd");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoIsNull() {
            addCriterion("CFM_PCSG_TXNSRLNO is null");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoIsNotNull() {
            addCriterion("CFM_PCSG_TXNSRLNO is not null");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoEqualTo(String value) {
            addCriterion("CFM_PCSG_TXNSRLNO =", value, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoNotEqualTo(String value) {
            addCriterion("CFM_PCSG_TXNSRLNO <>", value, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoGreaterThan(String value) {
            addCriterion("CFM_PCSG_TXNSRLNO >", value, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_PCSG_TXNSRLNO >=", value, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoLessThan(String value) {
            addCriterion("CFM_PCSG_TXNSRLNO <", value, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoLessThanOrEqualTo(String value) {
            addCriterion("CFM_PCSG_TXNSRLNO <=", value, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoLike(String value) {
            addCriterion("CFM_PCSG_TXNSRLNO like", value, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoNotLike(String value) {
            addCriterion("CFM_PCSG_TXNSRLNO not like", value, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoIn(List<String> values) {
            addCriterion("CFM_PCSG_TXNSRLNO in", values, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoNotIn(List<String> values) {
            addCriterion("CFM_PCSG_TXNSRLNO not in", values, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoBetween(String value1, String value2) {
            addCriterion("CFM_PCSG_TXNSRLNO between", value1, value2, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmPcsgTxnsrlnoNotBetween(String value1, String value2) {
            addCriterion("CFM_PCSG_TXNSRLNO not between", value1, value2, "cfmPcsgTxnsrlno");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtIsNull() {
            addCriterion("CFM_TXNAMT is null");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtIsNotNull() {
            addCriterion("CFM_TXNAMT is not null");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtEqualTo(String value) {
            addCriterion("CFM_TXNAMT =", value, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtNotEqualTo(String value) {
            addCriterion("CFM_TXNAMT <>", value, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtGreaterThan(String value) {
            addCriterion("CFM_TXNAMT >", value, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_TXNAMT >=", value, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtLessThan(String value) {
            addCriterion("CFM_TXNAMT <", value, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtLessThanOrEqualTo(String value) {
            addCriterion("CFM_TXNAMT <=", value, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtLike(String value) {
            addCriterion("CFM_TXNAMT like", value, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtNotLike(String value) {
            addCriterion("CFM_TXNAMT not like", value, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtIn(List<String> values) {
            addCriterion("CFM_TXNAMT in", values, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtNotIn(List<String> values) {
            addCriterion("CFM_TXNAMT not in", values, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtBetween(String value1, String value2) {
            addCriterion("CFM_TXNAMT between", value1, value2, "cfmTxnamt");
            return (Criteria) this;
        }

        public Criteria andCfmTxnamtNotBetween(String value1, String value2) {
            addCriterion("CFM_TXNAMT not between", value1, value2, "cfmTxnamt");
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

        public Criteria andCstScrtacnoIsNull() {
            addCriterion("CST_SCRTACNO is null");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoIsNotNull() {
            addCriterion("CST_SCRTACNO is not null");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoEqualTo(String value) {
            addCriterion("CST_SCRTACNO =", value, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoNotEqualTo(String value) {
            addCriterion("CST_SCRTACNO <>", value, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoGreaterThan(String value) {
            addCriterion("CST_SCRTACNO >", value, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoGreaterThanOrEqualTo(String value) {
            addCriterion("CST_SCRTACNO >=", value, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoLessThan(String value) {
            addCriterion("CST_SCRTACNO <", value, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoLessThanOrEqualTo(String value) {
            addCriterion("CST_SCRTACNO <=", value, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoLike(String value) {
            addCriterion("CST_SCRTACNO like", value, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoNotLike(String value) {
            addCriterion("CST_SCRTACNO not like", value, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoIn(List<String> values) {
            addCriterion("CST_SCRTACNO in", values, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoNotIn(List<String> values) {
            addCriterion("CST_SCRTACNO not in", values, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoBetween(String value1, String value2) {
            addCriterion("CST_SCRTACNO between", value1, value2, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andCstScrtacnoNotBetween(String value1, String value2) {
            addCriterion("CST_SCRTACNO not between", value1, value2, "cstScrtacno");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeIsNull() {
            addCriterion("TXN_ITT_CHNL_CGY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeIsNotNull() {
            addCriterion("TXN_ITT_CHNL_CGY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeEqualTo(String value) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE =", value, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeNotEqualTo(String value) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE <>", value, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeGreaterThan(String value) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE >", value, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE >=", value, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeLessThan(String value) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE <", value, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeLessThanOrEqualTo(String value) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE <=", value, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeLike(String value) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE like", value, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeNotLike(String value) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE not like", value, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeIn(List<String> values) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE in", values, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeNotIn(List<String> values) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE not in", values, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeBetween(String value1, String value2) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE between", value1, value2, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andTxnIttChnlCgyCodeNotBetween(String value1, String value2) {
            addCriterion("TXN_ITT_CHNL_CGY_CODE not between", value1, value2, "txnIttChnlCgyCode");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdIsNull() {
            addCriterion("BYSLDRC_CD is null");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdIsNotNull() {
            addCriterion("BYSLDRC_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdEqualTo(String value) {
            addCriterion("BYSLDRC_CD =", value, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdNotEqualTo(String value) {
            addCriterion("BYSLDRC_CD <>", value, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdGreaterThan(String value) {
            addCriterion("BYSLDRC_CD >", value, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdGreaterThanOrEqualTo(String value) {
            addCriterion("BYSLDRC_CD >=", value, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdLessThan(String value) {
            addCriterion("BYSLDRC_CD <", value, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdLessThanOrEqualTo(String value) {
            addCriterion("BYSLDRC_CD <=", value, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdLike(String value) {
            addCriterion("BYSLDRC_CD like", value, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdNotLike(String value) {
            addCriterion("BYSLDRC_CD not like", value, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdIn(List<String> values) {
            addCriterion("BYSLDRC_CD in", values, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdNotIn(List<String> values) {
            addCriterion("BYSLDRC_CD not in", values, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdBetween(String value1, String value2) {
            addCriterion("BYSLDRC_CD between", value1, value2, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andBysldrcCdNotBetween(String value1, String value2) {
            addCriterion("BYSLDRC_CD not between", value1, value2, "bysldrcCd");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeIsNull() {
            addCriterion("SYS_TX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeIsNotNull() {
            addCriterion("SYS_TX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeEqualTo(String value) {
            addCriterion("SYS_TX_CODE =", value, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeNotEqualTo(String value) {
            addCriterion("SYS_TX_CODE <>", value, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeGreaterThan(String value) {
            addCriterion("SYS_TX_CODE >", value, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_TX_CODE >=", value, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeLessThan(String value) {
            addCriterion("SYS_TX_CODE <", value, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_TX_CODE <=", value, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeLike(String value) {
            addCriterion("SYS_TX_CODE like", value, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeNotLike(String value) {
            addCriterion("SYS_TX_CODE not like", value, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeIn(List<String> values) {
            addCriterion("SYS_TX_CODE in", values, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeNotIn(List<String> values) {
            addCriterion("SYS_TX_CODE not in", values, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeBetween(String value1, String value2) {
            addCriterion("SYS_TX_CODE between", value1, value2, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andSysTxCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_TX_CODE not between", value1, value2, "sysTxCode");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdIsNull() {
            addCriterion("SCR_PD_ECD is null");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdIsNotNull() {
            addCriterion("SCR_PD_ECD is not null");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdEqualTo(String value) {
            addCriterion("SCR_PD_ECD =", value, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdNotEqualTo(String value) {
            addCriterion("SCR_PD_ECD <>", value, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdGreaterThan(String value) {
            addCriterion("SCR_PD_ECD >", value, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdGreaterThanOrEqualTo(String value) {
            addCriterion("SCR_PD_ECD >=", value, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdLessThan(String value) {
            addCriterion("SCR_PD_ECD <", value, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdLessThanOrEqualTo(String value) {
            addCriterion("SCR_PD_ECD <=", value, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdLike(String value) {
            addCriterion("SCR_PD_ECD like", value, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdNotLike(String value) {
            addCriterion("SCR_PD_ECD not like", value, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdIn(List<String> values) {
            addCriterion("SCR_PD_ECD in", values, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdNotIn(List<String> values) {
            addCriterion("SCR_PD_ECD not in", values, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdBetween(String value1, String value2) {
            addCriterion("SCR_PD_ECD between", value1, value2, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andScrPdEcdNotBetween(String value1, String value2) {
            addCriterion("SCR_PD_ECD not between", value1, value2, "scrPdEcd");
            return (Criteria) this;
        }

        public Criteria andAplyIdIsNull() {
            addCriterion("APLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andAplyIdIsNotNull() {
            addCriterion("APLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAplyIdEqualTo(String value) {
            addCriterion("APLY_ID =", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdNotEqualTo(String value) {
            addCriterion("APLY_ID <>", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdGreaterThan(String value) {
            addCriterion("APLY_ID >", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("APLY_ID >=", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdLessThan(String value) {
            addCriterion("APLY_ID <", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdLessThanOrEqualTo(String value) {
            addCriterion("APLY_ID <=", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdLike(String value) {
            addCriterion("APLY_ID like", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdNotLike(String value) {
            addCriterion("APLY_ID not like", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdIn(List<String> values) {
            addCriterion("APLY_ID in", values, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdNotIn(List<String> values) {
            addCriterion("APLY_ID not in", values, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdBetween(String value1, String value2) {
            addCriterion("APLY_ID between", value1, value2, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdNotBetween(String value1, String value2) {
            addCriterion("APLY_ID not between", value1, value2, "aplyId");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotIsNull() {
            addCriterion("CFM_TXN_LOT is null");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotIsNotNull() {
            addCriterion("CFM_TXN_LOT is not null");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotEqualTo(String value) {
            addCriterion("CFM_TXN_LOT =", value, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotNotEqualTo(String value) {
            addCriterion("CFM_TXN_LOT <>", value, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotGreaterThan(String value) {
            addCriterion("CFM_TXN_LOT >", value, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_TXN_LOT >=", value, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotLessThan(String value) {
            addCriterion("CFM_TXN_LOT <", value, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotLessThanOrEqualTo(String value) {
            addCriterion("CFM_TXN_LOT <=", value, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotLike(String value) {
            addCriterion("CFM_TXN_LOT like", value, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotNotLike(String value) {
            addCriterion("CFM_TXN_LOT not like", value, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotIn(List<String> values) {
            addCriterion("CFM_TXN_LOT in", values, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotNotIn(List<String> values) {
            addCriterion("CFM_TXN_LOT not in", values, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotBetween(String value1, String value2) {
            addCriterion("CFM_TXN_LOT between", value1, value2, "cfmTxnLot");
            return (Criteria) this;
        }

        public Criteria andCfmTxnLotNotBetween(String value1, String value2) {
            addCriterion("CFM_TXN_LOT not between", value1, value2, "cfmTxnLot");
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