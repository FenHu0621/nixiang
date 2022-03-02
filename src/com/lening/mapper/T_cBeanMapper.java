package com.lening.mapper;

import com.lening.entity.T_cBean;
import com.lening.entity.T_cBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T_cBeanMapper {
    long countByExample(T_cBeanExample example);

    int deleteByExample(T_cBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(T_cBean record);

    int insertSelective(T_cBean record);

    List<T_cBean> selectByExample(T_cBeanExample example);

    T_cBean selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T_cBean record, @Param("example") T_cBeanExample example);

    int updateByExample(@Param("record") T_cBean record, @Param("example") T_cBeanExample example);

    int updateByPrimaryKeySelective(T_cBean record);

    int updateByPrimaryKey(T_cBean record);
}