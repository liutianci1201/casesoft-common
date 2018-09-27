package com.casesoft.common.hub.entity;

import java.util.Date;

/**
 * TblTaskRecord entity. @author
 */
@Deprecated
public class Record implements java.io.Serializable {

    private static final long serialVersionUID = -6159224187040781317L;

    private String id;
    private String code;/* 唯一码 */
    private String taskId;
    private String cartonId;
    private Integer token;
    private String deviceId;
    private String ownerId;

    private Date scanTime;

    private String sku;
    private String styleId;
    private String colorId;
    private String sizeId;

    private String srcTaskId;
    private String styleName;
    private String colorName;
    private String sizeName;
    private String deviceName;
    private String origUnitId;//发货方组织
    private String origUnitName;
    private String origId;//发货方仓库
    private String origName;
    private String billId;

    private String destId;//收货方仓库
    private String destName;

    private String destUnitId; //如果是品牌商自己的门店，值为null
    private String destUnitName;
    private Integer type;//0:出库1：入库3：盘点

    private String extField;//扩展字段

    private String tagCode;//SKU+序号

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCartonId() {
        return cartonId;
    }

    public void setCartonId(String cartonId) {
        this.cartonId = cartonId;
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

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Date getScanTime() {
        return scanTime;
    }

    public void setScanTime(Date scanTime) {
        this.scanTime = scanTime;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getOrigUnitId() {
        return origUnitId;
    }

    public void setOrigUnitId(String origUnitId) {
        this.origUnitId = origUnitId;
    }

    public String getOrigUnitName() {
        return origUnitName;
    }

    public void setOrigUnitName(String origUnitName) {
        this.origUnitName = origUnitName;
    }

    public String getOrigId() {
        return origId;
    }

    public void setOrigId(String origId) {
        this.origId = origId;
    }

    public String getOrigName() {
        return origName;
    }

    public void setOrigName(String origName) {
        this.origName = origName;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getDestId() {
        return destId;
    }

    public void setDestId(String destId) {
        this.destId = destId;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public String getDestUnitId() {
        return destUnitId;
    }

    public void setDestUnitId(String destUnitId) {
        this.destUnitId = destUnitId;
    }

    public String getDestUnitName() {
        return destUnitName;
    }

    public void setDestUnitName(String destUnitName) {
        this.destUnitName = destUnitName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getExtField() {
        return extField;
    }

    public void setExtField(String extField) {
        this.extField = extField;
    }

    public String getTagCode() {
        return tagCode;
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }
}