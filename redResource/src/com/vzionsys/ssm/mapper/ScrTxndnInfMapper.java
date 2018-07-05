package com.vzionsys.ssm.mapper;

import com.vzionsys.ssm.po.ScrTxndnInf;
import com.vzionsys.ssm.po.ScrTxndnInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScrTxndnInfMapper {
    int countByExample(ScrTxndnInfExample example);

    int deleteByExample(ScrTxndnInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScrTxndnInf record);

    int insertSelective(ScrTxndnInf record);

    List<ScrTxndnInf> selectByExample(ScrTxndnInfExample example);

    ScrTxndnInf selectByPrimaryKey(Integer id);
    
    List<ScrTxndnInf> selectByAccnos(@Param("list")List<String> list,@Param("upload_batch")String upload_batch);

    int updateByExampleSelective(@Param("record") ScrTxndnInf record, @Param("example") ScrTxndnInfExample example);

    int updateByExample(@Param("record") ScrTxndnInf record, @Param("example") ScrTxndnInfExample example);

    int updateByPrimaryKeySelective(ScrTxndnInf record);

    int updateByPrimaryKey(ScrTxndnInf record);
}