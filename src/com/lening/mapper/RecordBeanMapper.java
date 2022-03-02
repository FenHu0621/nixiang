package com.lening.mapper;

import com.lening.entity.RecordBean;
import com.lening.entity.RecordBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordBeanMapper {
    long countByExample(RecordBeanExample example);

    int deleteByExample(RecordBeanExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(RecordBean record);

    int insertSelective(RecordBean record);

    List<RecordBean> selectByExample(RecordBeanExample example);

    RecordBean selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") RecordBean record, @Param("example") RecordBeanExample example);

    int updateByExample(@Param("record") RecordBean record, @Param("example") RecordBeanExample example);

    int updateByPrimaryKeySelective(RecordBean record);

    int updateByPrimaryKey(RecordBean record);
}