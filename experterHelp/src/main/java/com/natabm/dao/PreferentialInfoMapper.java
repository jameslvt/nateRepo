package com.natabm.dao;

import com.natabm.entity.PreferentialInfo;

public interface PreferentialInfoMapper {
    int deleteByPrimaryKey(String serialId);

    int insert(PreferentialInfo record);

    int insertSelective(PreferentialInfo record);

    PreferentialInfo selectByPrimaryKey(String serialId);

    int updateByPrimaryKeySelective(PreferentialInfo record);

    int updateByPrimaryKey(PreferentialInfo record);
}