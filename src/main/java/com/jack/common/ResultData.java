package com.jack.common;

import com.alibaba.fastjson.JSONObject;

public class ResultData {
    private int status;
    private String desc;
    private JSONObject data;

    public ResultData(int status, String desc, JSONObject data) {
        this.status = status;
        this.desc = desc;
        this.data = data;
    }
    public ResultData(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }


    public ResultData ResultDataSuccss(int status, String desc, JSONObject data) {
        this.status = RequestStatus.SUCCESS;
        return new ResultData(status, desc, data);
    }

    public ResultData ResultDataFiled(int status, String desc) {
        this.status = RequestStatus.FILED;
        return new ResultData(status, desc);
    }

    public ResultData ResultDataError(int status, String desc) {
        this.status = RequestStatus.ERROR;
        return new ResultData(status, desc);
    }

}
