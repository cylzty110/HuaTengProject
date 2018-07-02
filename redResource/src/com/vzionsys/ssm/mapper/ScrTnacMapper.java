package com.vzionsys.ssm.mapper;

import com.vzionsys.ssm.po.ScrTnac;
import com.vzionsys.ssm.po.ScrTnacExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScrTnacMapper {
    int countByExample(ScrTnacExample example);

    int deleteByExample(ScrTnacExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScrTnac record);

    int insertSelective(ScrTnac record);

    List<ScrTnac> selectByExample(ScrTnacExample example);

    ScrTnac selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScrTnac record, @Param("example") ScrTnacExample example);

    int updateByExample(@Param("record") ScrTnac record, @Param("example") ScrTnacExample example);

    int updateByPrimaryKeySelective(ScrTnac record);

    int updateByPrimaryKey(ScrTnac record);
}