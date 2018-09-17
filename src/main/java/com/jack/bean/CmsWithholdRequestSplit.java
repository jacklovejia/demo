package com.jack.bean;

import java.math.BigDecimal;

public class CmsWithholdRequestSplit {
    private Long id;

    private Long requestId;

    private String contractNo;

    private Long requestNo;

    private Integer splitNo;

    private BigDecimal amount;

    private Byte executingFlag;

    private Integer status;

    private Integer requestNoStart;

    private Long addTime;

    private Long endTime;

    private Long execTime;

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

    public Integer getSplitNo() {
        return splitNo;
    }

    public void setSplitNo(Integer splitNo) {
        this.splitNo = splitNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Byte getExecutingFlag() {
        return executingFlag;
    }

    public void setExecutingFlag(Byte executingFlag) {
        this.executingFlag = executingFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRequestNoStart() {
        return requestNoStart;
    }

    public void setRequestNoStart(Integer requestNoStart) {
        this.requestNoStart = requestNoStart;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getExecTime() {
        return execTime;
    }

    public void setExecTime(Long execTime) {
        this.execTime = execTime;
    }
}