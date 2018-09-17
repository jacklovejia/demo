package com.jack.bean;

import java.math.BigDecimal;

public class CmsP2pRepayPlanList {
    private Long id;

    private Integer sid;

    private Integer borrowerUid;

    private String repayDate;

    private Integer repayType;

    private Integer repayStatus;

    private BigDecimal repayAmount;

    private BigDecimal provision;

    private BigDecimal serviceFee;

    private BigDecimal thirdServiceFee;

    private BigDecimal capital;

    private BigDecimal interest;

    private Integer step;

    private String biztype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getBorrowerUid() {
        return borrowerUid;
    }

    public void setBorrowerUid(Integer borrowerUid) {
        this.borrowerUid = borrowerUid;
    }

    public String getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(String repayDate) {
        this.repayDate = repayDate == null ? null : repayDate.trim();
    }

    public Integer getRepayType() {
        return repayType;
    }

    public void setRepayType(Integer repayType) {
        this.repayType = repayType;
    }

    public Integer getRepayStatus() {
        return repayStatus;
    }

    public void setRepayStatus(Integer repayStatus) {
        this.repayStatus = repayStatus;
    }

    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    public BigDecimal getProvision() {
        return provision;
    }

    public void setProvision(BigDecimal provision) {
        this.provision = provision;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getThirdServiceFee() {
        return thirdServiceFee;
    }

    public void setThirdServiceFee(BigDecimal thirdServiceFee) {
        this.thirdServiceFee = thirdServiceFee;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getBiztype() {
        return biztype;
    }

    public void setBiztype(String biztype) {
        this.biztype = biztype == null ? null : biztype.trim();
    }
}