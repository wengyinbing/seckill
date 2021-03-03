package com.weng.seckill.common.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "success_killed")
public class SuccessKilled implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "seckill_id", nullable = false)
    @ApiModelProperty(value = "秒杀商品id")
    private Long seckillId;

    @Id
    @ApiModelProperty(value = "用户Id")
    private Long userId;

    @ApiModelProperty(value = "状态标示：-1指无效，0指成功，1指已付款")
    private Byte state;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seckillId=").append(seckillId);
        sb.append(", userId=").append(userId);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}