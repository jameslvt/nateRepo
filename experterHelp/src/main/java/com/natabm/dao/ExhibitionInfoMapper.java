package com.natabm.dao;

import com.natabm.entity.ExhibitionInfo;

public interface ExhibitionInfoMapper {
    int deleteByPrimaryKey(String serialId);

    int insert(ExhibitionInfo record);

    int insertSelective(ExhibitionInfo record);

    ExhibitionInfo selectByPrimaryKey(String serialId);

    int updateByPrimaryKeySelective(ExhibitionInfo record);

    int updateByPrimaryKey(ExhibitionInfo record);
}