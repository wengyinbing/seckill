package com.weng.seckill.generator.mapper;

import com.weng.seckill.generator.model.RedRacket;
import com.weng.seckill.generator.model.RedRacketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedRacketMapper {
    long countByExample(RedRacketExample example);

    int deleteByExample(RedRacketExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RedRacket record);

    int insertSelective(RedRacket record);

    List<RedRacket> selectByExample(RedRacketExample example);

    RedRacket selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RedRacket record, @Param("example") RedRacketExample example);

    int updateByExample(@Param("record") RedRacket record, @Param("example") RedRacketExample example);

    int updateByPrimaryKeySelective(RedRacket record);

    int updateByPrimaryKey(RedRacket record);
}