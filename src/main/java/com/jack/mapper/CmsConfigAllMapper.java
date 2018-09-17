package com.jack.mapper;

import com.jack.bean.CmsConfigAll;
import com.jack.bean.CmsConfigAllExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsConfigAllMapper {
    int countByExample(CmsConfigAllExample example);

    int deleteByExample(CmsConfigAllExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsConfigAll record);

    int insertSelective(CmsConfigAll record);

    List<CmsConfigAll> selectByExample(CmsConfigAllExample example);

    CmsConfigAll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsConfigAll record, @Param("example") CmsConfigAllExample example);

    int updateByExample(@Param("record") CmsConfigAll record, @Param("example") CmsConfigAllExample example);

    int updateByPrimaryKeySelective(CmsConfigAll record);

    int updateByPrimaryKey(CmsConfigAll record);
}