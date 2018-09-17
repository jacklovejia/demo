package com.jack.mapper;

import com.jack.bean.CmsConfigBank;
import com.jack.bean.CmsConfigBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsConfigBankMapper {
    int countByExample(CmsConfigBankExample example);

    int deleteByExample(CmsConfigBankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsConfigBank record);

    int insertSelective(CmsConfigBank record);

    List<CmsConfigBank> selectByExample(CmsConfigBankExample example);

    CmsConfigBank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsConfigBank record, @Param("example") CmsConfigBankExample example);

    int updateByExample(@Param("record") CmsConfigBank record, @Param("example") CmsConfigBankExample example);

    int updateByPrimaryKeySelective(CmsConfigBank record);

    int updateByPrimaryKey(CmsConfigBank record);
}