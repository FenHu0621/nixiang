package com.lening.mapper;

import com.lening.entity.T_s_rBean;
import com.lening.entity.T_s_rBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T_s_rBeanMapper {
    long countByExample(T_s_rBeanExample example);

    int deleteByExample(T_s_rBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(T_s_rBean record);

    int insertSelective(T_s_rBean record);

    List<T_s_rBean> selectByExample(T_s_rBeanExample example);

    T_s_rBean selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T_s_rBean record, @Param("example") T_s_rBeanExample example);

    int updateByExample(@Param("record") T_s_rBean record, @Param("example") T_s_rBeanExample example);

    int updateByPrimaryKeySelective(T_s_rBean record);

    int updateByPrimaryKey(T_s_rBean record);
}