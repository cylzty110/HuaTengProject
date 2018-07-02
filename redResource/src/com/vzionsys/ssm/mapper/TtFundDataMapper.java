package com.vzionsys.ssm.mapper;

import com.vzionsys.ssm.po.TtFundData;
import com.vzionsys.ssm.po.TtFundDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtFundDataMapper {
    int countByExample(TtFundDataExample example);

    int deleteByExample(TtFundDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TtFundData record);

    int insertSelective(TtFundData record);
    
    int insertList(@Param("list")List<TtFundData> list);

    List<TtFundData> selectByExample(TtFundDataExample example);

    TtFundData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TtFundData record, @Param("example") TtFundDataExample example);

    int updateByExample(@Param("record") TtFundData record, @Param("example") TtFundDataExample example);

    int updateByPrimaryKeySelective(TtFundData record);

    int updateByPrimaryKey(TtFundData record);
}