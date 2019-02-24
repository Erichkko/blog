package com.zll.blog.dao;

import com.zll.blog.pojo.SortInfo;
import com.zll.blog.pojo.SortInfoExample;
import java.util.List;

public interface SortInfoMapper {
    int insert(SortInfo record);

    int insertSelective(SortInfo record);

    List<SortInfo> selectByExample(SortInfoExample example);
}