package com.jack.bean;

import java.math.BigDecimal;

public class CmsWithholdRequestConfirm {
    private Long id;

    private Long requestId;

    private String contractNo;

    private Long requestNo;

    private Long projectId;

    private Integer planStep;

    private BigDecimal totalAmount;

    private BigDecimal commission;

    private Integer status;

    private Long addTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Long getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(Long requestNo) {
        this.requestNo = requestNo;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Integer getPlanStep() {
        return planStep;
    }

    public void setPlanStep(Integer planStep) {
        this.planStep = planStep;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }
}