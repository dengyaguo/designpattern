package com.stream;

public class WaybillDto {

    public WaybillDto() {
    }

    public WaybillDto(String waybillId, String packageNumber) {
        this.waybillId = waybillId;
        this.packageNumber = packageNumber;
    }

    private String waybillId;

    private String packageNumber;

    public String getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId;
    }

    public String getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
    }
}
