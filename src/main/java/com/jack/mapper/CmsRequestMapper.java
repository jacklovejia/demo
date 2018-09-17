package com.jack.mapper;

import com.jack.bean.CmsRequest;
import com.jack.bean.CmsRequestExample;
import com.jack.bean.CmsRequestWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsRequestMapper {
    int countByExample(CmsRequestExample example);

    int deleteByExample(CmsRequestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsRequestWithBLOBs record);

    int insertSelective(CmsRequestWithBLOBs record);

    List<CmsRequestWithBLOBs> selectByExampleWithBLOBs(CmsRequestExample example);

    List<CmsRequest> selectByExample(CmsRequestExample example);

    CmsRequestWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsRequestWithBLOBs record, @Param("example") CmsRequestExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsRequestWithBLOBs record, @Param("example") CmsRequestExample example);

    int updateByExample(@Param("record") CmsRequest record, @Param("example") CmsRequestExample example);

    int updateByPrimaryKeySelective(CmsRequestWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CmsRequestWithBLOBs record);

    int updateByPrimaryKey(CmsRequest record);
}