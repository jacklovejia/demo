package com.jack.mapper;

import com.jack.bean.CmsWithholdRequestPrepare;
import com.jack.bean.CmsWithholdRequestPrepareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsWithholdRequestPrepareMapper {
    int countByExample(CmsWithholdRequestPrepareExample example);

    int deleteByExample(CmsWithholdRequestPrepareExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsWithholdRequestPrepare record);

    int insertSelective(CmsWithholdRequestPrepare record);

    List<CmsWithholdRequestPrepare> selectByExample(CmsWithholdRequestPrepareExample example);

    CmsWithholdRequestPrepare selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsWithholdRequestPrepare record, @Param("example") CmsWithholdRequestPrepareExample example);

    int updateByExample(@Param("record") CmsWithholdRequestPrepare record, @Param("example") CmsWithholdRequestPrepareExample example);

    int updateByPrimaryKeySelective(CmsWithholdRequestPrepare record);

    int updateByPrimaryKey(CmsWithholdRequestPrepare record);
}