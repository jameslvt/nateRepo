package com.natabm.dao;

import com.natabm.entity.CalendarInfo;

public interface CalendarInfoMapper {
    int deleteByPrimaryKey(String serialId);

    int insert(CalendarInfo record);

    int insertSelective(CalendarInfo record);

    CalendarInfo selectByPrimaryKey(String serialId);

    int updateByPrimaryKeySelective(CalendarInfo record);

    int updateByPrimaryKey(CalendarInfo record);
}