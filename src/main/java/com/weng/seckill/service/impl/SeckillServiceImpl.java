package com.weng.seckill.service.impl;

import com.weng.seckill.generator.model.Seckill;
import com.weng.seckill.mapper.SeckillMapper;
import com.weng.seckill.service.ISeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SeckillServiceImpl implements ISeckillService {
    @Autowired
    private SeckillMapper seckillMapper;

    @Override
    public List<Seckill> getSeckillList() {
        return seckillMapper.findAll();
    }

    @Override
    public Seckill getSeckkillById(Long seckillId) {
        return seckillMapper.selectByPrimaryKey(seckillId);
    }

    @Override
    public List<Seckill> getSecKillByName(String name) {
        return seckillMapper.selectByName(name);
    }

    @Override
    public int createSecKill(Seckill s) {
        seckillMapper.insert(s);
        return 0;
    }

    @Override
    public int deleteSeckillById(Long seckillId) {
        if(getSeckkillById(seckillId)==null) {return -1;}
        seckillMapper.deleteByPrimaryKey(seckillId);
        return 0;
    }

    @Override
    public boolean update(Seckill s) {
        if(seckillMapper.updateByPrimaryKey(s)>0){
            return true;}
        return true;
    }

}
