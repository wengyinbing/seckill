package com.weng.seckill.generator.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class RedRacket implements Serializable {
    private Long id;

    private Date createTime;

    private Long redPacketId;

    private Integer totalAmount;

    private Integer totalPacket;

    private Integer type;

    private Integer uid;

    private Integer version;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalPacket() {
        return totalPacket;
    }

    public void setTotalPacket(Integer totalPacket) {
        this.totalPacket = totalPacket;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", redPacketId=").append(redPacketId);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", totalPacket=").append(totalPacket);
        sb.append(", type=").append(type);
        sb.append(", uid=").append(uid);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}