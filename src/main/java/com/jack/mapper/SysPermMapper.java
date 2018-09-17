package com.jack.mapper;

import com.jack.bean.SysPerm;
import com.jack.bean.SysPermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermMapper {
    int countByExample(SysPermExample example);

    int deleteByExample(SysPermExample example);

    int deleteByPrimaryKey(String pval);

    int insert(SysPerm record);

    int insertSelective(SysPerm record);

    List<SysPerm> selectByExample(SysPermExample example);

    SysPerm selectByPrimaryKey(String pval);

    int updateByExampleSelective(@Param("record") SysPerm record, @Param("example") SysPermExample example);

    int updateByExample(@Param("record") SysPerm record, @Param("example") SysPermExample example);

    int updateByPrimaryKeySelective(SysPerm record);

    int updateByPrimaryKey(SysPerm record);
}