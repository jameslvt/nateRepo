package com.natabm.dao;

import com.natabm.entity.FeedbackInfo;

public interface FeedbackInfoMapper {
    int deleteByPrimaryKey(String serialId);

    int insert(FeedbackInfo record);

    int insertSelective(FeedbackInfo record);

    FeedbackInfo selectByPrimaryKey(String serialId);

    int updateByPrimaryKeySelective(FeedbackInfo record);

    int updateByPrimaryKey(FeedbackInfo record);
}