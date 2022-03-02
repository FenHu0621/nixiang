package com.lening.mapper;

import com.lening.entity.SubjectBean;
import com.lening.entity.SubjectBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectBeanMapper {
    long countByExample(SubjectBeanExample example);

    int deleteByExample(SubjectBeanExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(SubjectBean record);

    int insertSelective(SubjectBean record);

    List<SubjectBean> selectByExample(SubjectBeanExample example);

    SubjectBean selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") SubjectBean record, @Param("example") SubjectBeanExample example);

    int updateByExample(@Param("record") SubjectBean record, @Param("example") SubjectBeanExample example);

    int updateByPrimaryKeySelective(SubjectBean record);

    int updateByPrimaryKey(SubjectBean record);
}