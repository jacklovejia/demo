package com.jack.bean;

public class CmsWithholdRequestRoute {
    private Long id;

    private Long requestId;

    private Long requestSplitId;

    private String contractNo;

    private Long requestNo;

    private Integer splitNo;

    private String channel;

    private String billingRequestNo;

    private Integer status;

    private Long addTime;

    private Long endTime;

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

    public Long getRequestSplitId() {
        return requestSplitId;
    }

    public void setRequestSplitId(Long requestSplitId) {
        this.requestSplitId = requestSplitId;
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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getBillingRequestNo() {
        return billingRequestNo;
    }

    public void setBillingRequestNo(String billingRequestNo) {
        this.billingRequestNo = billingRequestNo == null ? null : billingRequestNo.trim();
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

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}