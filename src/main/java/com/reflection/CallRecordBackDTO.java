package com.reflection;

import lombok.Data;

@Data
public class CallRecordBackDTO {
    public CallRecordBackDTO() {
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    private String sn;

    private String startTime;
}
