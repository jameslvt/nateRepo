package com.natabm.dao;

import com.natabm.entity.SaleInfo;

public interface SaleInfoMapper {
    int deleteByPrimaryKey(String serialId);

    int insert(SaleInfo record);

    int insertSelective(SaleInfo record);

    SaleInfo selectByPrimaryKey(String serialId);

    int updateByPrimaryKeySelective(SaleInfo record);

    int updateByPrimaryKey(SaleInfo record);
}