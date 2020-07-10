package com.baidu.longjt.util;

public enum ReturnState {
    SUCCESS(20000,"success","操作成功"),
    ERROR(40000,"error","操作失败"),
    SERVICE_ERROR(40001,"error","逻辑错误，重新再试"),
    DAO_ERROR(400012,"error","访问失败，稍后再试");
    int status;
    String msg;
    String tip;

    ReturnState(int status, String msg, String tip) {
        this.status = status;
        this.msg = msg;
        this.tip = tip;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
