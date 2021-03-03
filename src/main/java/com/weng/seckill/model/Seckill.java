package com.weng.seckill.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class Seckill implements Serializable {
    @ApiModelProperty(value = "商品库存id")
    private Long seckillId;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "库存数量")
    private Integer number;

    @ApiModelProperty(value = "秒杀开启时间")
    private Date startTime;

    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    //@JsonFormat(shape = JsonFormat.Shape.STRING,timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "秒杀结束时间")
    private Date endTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "版本号")
    private Integer version;

    private static final long serialVersionUID = 1L;

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", seckillId=").append(seckillId);
        sb.append(", name=").append(name);
        sb.append(", number=").append(number);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}