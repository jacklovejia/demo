package com.jack.mapper;

import com.jack.bean.CmsWithholdRequestSplit;
import com.jack.bean.CmsWithholdRequestSplitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsWithholdRequestSplitMapper {
    int countByExample(CmsWithholdRequestSplitExample example);

    int deleteByExample(CmsWithholdRequestSplitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsWithholdRequestSplit record);

    int insertSelective(CmsWithholdRequestSplit record);

    List<CmsWithholdRequestSplit> selectByExample(CmsWithholdRequestSplitExample example);

    CmsWithholdRequestSplit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsWithholdRequestSplit record, @Param("example") CmsWithholdRequestSplitExample example);

    int updateByExample(@Param("record") CmsWithholdRequestSplit record, @Param("example") CmsWithholdRequestSplitExample example);

    int updateByPrimaryKeySelective(CmsWithholdRequestSplit record);

    int updateByPrimaryKey(CmsWithholdRequestSplit record);
}