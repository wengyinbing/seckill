package com.weng.seckill.generator.mapper;

import com.weng.seckill.generator.model.Seckill;
import com.weng.seckill.generator.model.SeckillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeckillMapper {
    long countByExample(SeckillExample example);

    int deleteByExample(SeckillExample example);

    int deleteByPrimaryKey(Long seckillId);

    int insert(Seckill record);

    int insertSelective(Seckill record);

    List<Seckill> selectByExample(SeckillExample example);

    Seckill selectByPrimaryKey(Long seckillId);

    int updateByExampleSelective(@Param("record") Seckill record, @Param("example") SeckillExample example);

    int updateByExample(@Param("record") Seckill record, @Param("example") SeckillExample example);

    int updateByPrimaryKeySelective(Seckill record);

    int updateByPrimaryKey(Seckill record);
}