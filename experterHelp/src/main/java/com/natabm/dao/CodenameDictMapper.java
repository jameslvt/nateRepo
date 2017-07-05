package com.natabm.dao;

import com.natabm.entity.CodenameDict;

public interface CodenameDictMapper {
    int insert(CodenameDict record);

    int insertSelective(CodenameDict record);
}