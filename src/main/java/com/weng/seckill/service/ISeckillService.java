package com.weng.seckill.service;

import com.weng.seckill.generator.model.Seckill;

import java.util.List;

public interface ISeckillService {

    /**
     * 查询全部的秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 按ID查询
     */
    Seckill getSeckkillById(Long seckillId);

    /*
    名字模糊查询
     */
    List<Seckill> getSecKillByName(String name);

    /*
    增添秒杀商品
     */
    int createSecKill(Seckill s);
    /*
    delete
     */
    int deleteSeckillById(Long seckillId);
    /*
    update
     */
    boolean update(Seckill s);

}
