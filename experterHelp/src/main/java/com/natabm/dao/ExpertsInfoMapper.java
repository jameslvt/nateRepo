package com.natabm.dao;

import com.natabm.entity.ExpertsInfo;

public interface ExpertsInfoMapper {
    int deleteByPrimaryKey(String serialId);

    int insert(ExpertsInfo record);

    int insertSelective(ExpertsInfo record);

    ExpertsInfo selectByPrimaryKey(String serialId);

    int updateByPrimaryKeySelective(ExpertsInfo record);

    int updateByPrimaryKey(ExpertsInfo record);
}