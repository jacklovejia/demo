package com.jack.mapper;

import com.jack.bean.CmsWithholdRequestRoute;
import com.jack.bean.CmsWithholdRequestRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsWithholdRequestRouteMapper {
    int countByExample(CmsWithholdRequestRouteExample example);

    int deleteByExample(CmsWithholdRequestRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsWithholdRequestRoute record);

    int insertSelective(CmsWithholdRequestRoute record);

    List<CmsWithholdRequestRoute> selectByExample(CmsWithholdRequestRouteExample example);

    CmsWithholdRequestRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsWithholdRequestRoute record, @Param("example") CmsWithholdRequestRouteExample example);

    int updateByExample(@Param("record") CmsWithholdRequestRoute record, @Param("example") CmsWithholdRequestRouteExample example);

    int updateByPrimaryKeySelective(CmsWithholdRequestRoute record);

    int updateByPrimaryKey(CmsWithholdRequestRoute record);
}