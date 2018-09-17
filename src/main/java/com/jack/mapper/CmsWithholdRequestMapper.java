package com.jack.mapper;

import com.jack.bean.CmsWithholdRequest;
import com.jack.bean.CmsWithholdRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsWithholdRequestMapper {
    int countByExample(CmsWithholdRequestExample example);

    int deleteByExample(CmsWithholdRequestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsWithholdRequest record);

    int insertSelective(CmsWithholdRequest record);

    List<CmsWithholdRequest> selectByExample(CmsWithholdRequestExample example);

    CmsWithholdRequest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsWithholdRequest record, @Param("example") CmsWithholdRequestExample example);

    int updateByExample(@Param("record") CmsWithholdRequest record, @Param("example") CmsWithholdRequestExample example);

    int updateByPrimaryKeySelective(CmsWithholdRequest record);

    int updateByPrimaryKey(CmsWithholdRequest record);
}