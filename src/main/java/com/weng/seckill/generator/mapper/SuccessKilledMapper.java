package com.weng.seckill.generator.mapper;

import com.weng.seckill.generator.model.SuccessKilled;
import com.weng.seckill.generator.model.SuccessKilledExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuccessKilledMapper {
    long countByExample(SuccessKilledExample example);

    int deleteByExample(SuccessKilledExample example);

    int deleteByPrimaryKey(@Param("seckillId") Long seckillId, @Param("userId") Long userId);

    int insert(SuccessKilled record);

    int insertSelective(SuccessKilled record);

    List<SuccessKilled> selectByExample(SuccessKilledExample example);

    SuccessKilled selectByPrimaryKey(@Param("seckillId") Long seckillId, @Param("userId") Long userId);

    int updateByExampleSelective(@Param("record") SuccessKilled record, @Param("example") SuccessKilledExample example);

    int updateByExample(@Param("record") SuccessKilled record, @Param("example") SuccessKilledExample example);

    int updateByPrimaryKeySelective(SuccessKilled record);

    int updateByPrimaryKey(SuccessKilled record);
}