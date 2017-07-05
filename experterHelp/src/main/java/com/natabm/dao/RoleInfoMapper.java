package com.natabm.dao;

import com.natabm.entity.RoleInfo;

public interface RoleInfoMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    RoleInfo selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);
}