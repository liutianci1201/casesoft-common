package com.casesoft.common.hub.entity;


@Deprecated
public class BusinessDtl implements java.io.Serializable {

    private static final long serialVersionUID = 1145893475448737925L;
    private String id;
    private String taskId;
    private String ownerId;
    private Integer token;
    private String deviceId;
    private String sku;
    private Integer qty;
    private String origId;//
    private String origUnitId;

    private String styleId;
    private String colorId;
    private String sizeId;

    private String srcTaskId;
    private String styleName;
    private String colorName;
    private String sizeName;

    private String destId;
    private String destUnitId; //如果是品牌商自己的门店，值为null
    private Integer type;//0:出库1：入库3：盘点

    private String destName;
    private String destUnitName;
    private String origName;
    private String deviceName;
    private String origUnitName;

    private Integer billQty;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getOrigId() {
        return origId;
    }

    public void setOrigId(String origId) {
        this.origId = origId;
    }

    public String getOrigUnitId() {
        return origUnitId;
    }

    public void setOrigUnitId(String origUnitId) {
        this.origUnitId = origUnitId;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    public String getSrcTaskId() {
        return srcTaskId;
    }

    public void setSrcTaskId(String srcTaskId) {
        this.srcTaskId = srcTaskId;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public String getDestId() {
        return destId;
    }

    public void setDestId(String destId) {
        this.destId = destId;
    }

    public String getDestUnitId() {
        return destUnitId;
    }

    public void setDestUnitId(String destUnitId) {
        this.destUnitId = destUnitId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public String getDestUnitName() {
        return destUnitName;
    }

    public void setDestUnitName(String destUnitName) {
        this.destUnitName = destUnitName;
    }

    public String getOrigName() {
        return origName;
    }

    public void setOrigName(String origName) {
        this.origName = origName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getOrigUnitName() {
        return origUnitName;
    }

    public void setOrigUnitName(String origUnitName) {
        this.origUnitName = origUnitName;
    }

    public Integer getBillQty() {
        return billQty;
    }

    public void setBillQty(Integer billQty) {
        this.billQty = billQty;
    }
}