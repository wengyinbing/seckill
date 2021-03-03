package com.weng.seckill.generator.mapper;

import com.weng.seckill.generator.model.RedPacketRecord;
import com.weng.seckill.generator.model.RedPacketRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedPacketRecordMapper {
    long countByExample(RedPacketRecordExample example);

    int deleteByExample(RedPacketRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RedPacketRecord record);

    int insertSelective(RedPacketRecord record);

    List<RedPacketRecord> selectByExample(RedPacketRecordExample example);

    RedPacketRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RedPacketRecord record, @Param("example") RedPacketRecordExample example);

    int updateByExample(@Param("record") RedPacketRecord record, @Param("example") RedPacketRecordExample example);

    int updateByPrimaryKeySelective(RedPacketRecord record);

    int updateByPrimaryKey(RedPacketRecord record);
}