package com.jack.mapper;

import com.jack.bean.CmsJobLog;
import com.jack.bean.CmsJobLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsJobLogMapper {
    int countByExample(CmsJobLogExample example);

    int deleteByExample(CmsJobLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsJobLog record);

    int insertSelective(CmsJobLog record);

    List<CmsJobLog> selectByExample(CmsJobLogExample example);

    CmsJobLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsJobLog record, @Param("example") CmsJobLogExample example);

    int updateByExample(@Param("record") CmsJobLog record, @Param("example") CmsJobLogExample example);

    int updateByPrimaryKeySelective(CmsJobLog record);

    int updateByPrimaryKey(CmsJobLog record);
}