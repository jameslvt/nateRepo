package com.natabm.dao;

import com.natabm.entity.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}