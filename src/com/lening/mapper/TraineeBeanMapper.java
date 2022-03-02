package com.lening.mapper;

import com.lening.entity.TraineeBean;
import com.lening.entity.TraineeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraineeBeanMapper {
    long countByExample(TraineeBeanExample example);

    int deleteByExample(TraineeBeanExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(TraineeBean record);

    int insertSelective(TraineeBean record);

    List<TraineeBean> selectByExample(TraineeBeanExample example);

    TraineeBean selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") TraineeBean record, @Param("example") TraineeBeanExample example);

    int updateByExample(@Param("record") TraineeBean record, @Param("example") TraineeBeanExample example);

    int updateByPrimaryKeySelective(TraineeBean record);

    int updateByPrimaryKey(TraineeBean record);
}