package com.jack.mapper;

import com.jack.bean.CmsConfigQuota;
import com.jack.bean.CmsConfigQuotaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsConfigQuotaMapper {
    int countByExample(CmsConfigQuotaExample example);

    int deleteByExample(CmsConfigQuotaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsConfigQuota record);

    int insertSelective(CmsConfigQuota record);

    List<CmsConfigQuota> selectByExample(CmsConfigQuotaExample example);

    CmsConfigQuota selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsConfigQuota record, @Param("example") CmsConfigQuotaExample example);

    int updateByExample(@Param("record") CmsConfigQuota record, @Param("example") CmsConfigQuotaExample example);

    int updateByPrimaryKeySelective(CmsConfigQuota record);

    int updateByPrimaryKey(CmsConfigQuota record);
}