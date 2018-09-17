package com.jack.mapper;

import com.jack.bean.CmsConfigChannel;
import com.jack.bean.CmsConfigChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsConfigChannelMapper {
    int countByExample(CmsConfigChannelExample example);

    int deleteByExample(CmsConfigChannelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsConfigChannel record);

    int insertSelective(CmsConfigChannel record);

    List<CmsConfigChannel> selectByExample(CmsConfigChannelExample example);

    CmsConfigChannel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsConfigChannel record, @Param("example") CmsConfigChannelExample example);

    int updateByExample(@Param("record") CmsConfigChannel record, @Param("example") CmsConfigChannelExample example);

    int updateByPrimaryKeySelective(CmsConfigChannel record);

    int updateByPrimaryKey(CmsConfigChannel record);
}