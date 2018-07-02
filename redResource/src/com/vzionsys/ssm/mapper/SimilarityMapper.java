package com.vzionsys.ssm.mapper;

import com.vzionsys.ssm.po.Similarity;
import com.vzionsys.ssm.po.SimilarityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimilarityMapper {
    int countByExample(SimilarityExample example);

    int deleteByExample(SimilarityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Similarity record);

    int insertSelective(Similarity record);

    List<Similarity> selectByExample(SimilarityExample example);
    
    int insertList(@Param("list")List<Similarity> list);

    Similarity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Similarity record, @Param("example") SimilarityExample example);

    int updateByExample(@Param("record") Similarity record, @Param("example") SimilarityExample example);

    int updateByPrimaryKeySelective(Similarity record);

    int updateByPrimaryKey(Similarity record);
}