package com.baidu.longjt.util;

public enum ErrorStatus {
    SUCCESS(20000, "success", "成功");
    int status;
    String messege;
    String tip;
    ErrorStatus(int status,String messege,String tip){
        this.status = status;
        this.messege = messege;
        this.tip = tip;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
