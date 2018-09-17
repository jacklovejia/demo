package com.jack.mapper;

import com.jack.bean.CmsWithholdRequestConfirmDetail;
import com.jack.bean.CmsWithholdRequestConfirmDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsWithholdRequestConfirmDetailMapper {
    int countByExample(CmsWithholdRequestConfirmDetailExample example);

    int deleteByExample(CmsWithholdRequestConfirmDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsWithholdRequestConfirmDetail record);

    int insertSelective(CmsWithholdRequestConfirmDetail record);

    List<CmsWithholdRequestConfirmDetail> selectByExample(CmsWithholdRequestConfirmDetailExample example);

    CmsWithholdRequestConfirmDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsWithholdRequestConfirmDetail record, @Param("example") CmsWithholdRequestConfirmDetailExample example);

    int updateByExample(@Param("record") CmsWithholdRequestConfirmDetail record, @Param("example") CmsWithholdRequestConfirmDetailExample example);

    int updateByPrimaryKeySelective(CmsWithholdRequestConfirmDetail record);

    int updateByPrimaryKey(CmsWithholdRequestConfirmDetail record);
}