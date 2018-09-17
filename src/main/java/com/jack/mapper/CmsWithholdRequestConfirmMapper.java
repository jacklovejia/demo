package com.jack.mapper;

import com.jack.bean.CmsWithholdRequestConfirm;
import com.jack.bean.CmsWithholdRequestConfirmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsWithholdRequestConfirmMapper {
    int countByExample(CmsWithholdRequestConfirmExample example);

    int deleteByExample(CmsWithholdRequestConfirmExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsWithholdRequestConfirm record);

    int insertSelective(CmsWithholdRequestConfirm record);

    List<CmsWithholdRequestConfirm> selectByExample(CmsWithholdRequestConfirmExample example);

    CmsWithholdRequestConfirm selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsWithholdRequestConfirm record, @Param("example") CmsWithholdRequestConfirmExample example);

    int updateByExample(@Param("record") CmsWithholdRequestConfirm record, @Param("example") CmsWithholdRequestConfirmExample example);

    int updateByPrimaryKeySelective(CmsWithholdRequestConfirm record);

    int updateByPrimaryKey(CmsWithholdRequestConfirm record);
}