package com.vzionsys.ssm.mapper;

import com.vzionsys.ssm.po.TsTaskInfo;
import com.vzionsys.ssm.po.TsTaskInfoExample;
import com.vzionsys.ssm.po.TtFundData;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TsTaskInfoMapper {
    int countByExample(TsTaskInfoExample example);

    int deleteByExample(TsTaskInfoExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TsTaskInfo record);

    int insertSelective(TsTaskInfo record);

    List<TsTaskInfo> selectByExample(TsTaskInfoExample example);

    TsTaskInfo selectByPrimaryKey(Integer taskId);
    
    int insertList(@Param("list")List<TsTaskInfo> list);

    int updateByExampleSelective(@Param("record") TsTaskInfo record, @Param("example") TsTaskInfoExample example);

    int updateByExample(@Param("record") TsTaskInfo record, @Param("example") TsTaskInfoExample example);

    int updateByPrimaryKeySelective(TsTaskInfo record);

    int updateByPrimaryKey(TsTaskInfo record);
}