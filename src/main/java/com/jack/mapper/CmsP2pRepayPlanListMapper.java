package com.jack.mapper;

import com.jack.bean.CmsP2pRepayPlanList;
import com.jack.bean.CmsP2pRepayPlanListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsP2pRepayPlanListMapper {
    int countByExample(CmsP2pRepayPlanListExample example);

    int deleteByExample(CmsP2pRepayPlanListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsP2pRepayPlanList record);

    int insertSelective(CmsP2pRepayPlanList record);

    List<CmsP2pRepayPlanList> selectByExample(CmsP2pRepayPlanListExample example);

    CmsP2pRepayPlanList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsP2pRepayPlanList record, @Param("example") CmsP2pRepayPlanListExample example);

    int updateByExample(@Param("record") CmsP2pRepayPlanList record, @Param("example") CmsP2pRepayPlanListExample example);

    int updateByPrimaryKeySelective(CmsP2pRepayPlanList record);

    int updateByPrimaryKey(CmsP2pRepayPlanList record);
}