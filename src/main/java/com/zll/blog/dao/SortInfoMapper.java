package com.zll.blog.dao;

import com.zll.blog.pojo.SortInfo;
import com.zll.blog.pojo.SortInfoExample;
import java.util.List;
import java.util.Map;

public interface SortInfoMapper {
    int insert(SortInfo record);

    int insertSelective(SortInfo record);

    List<SortInfo> selectByExample(SortInfoExample example);

    int updateCategory(Map<String,Object> map);

    int deleteCategory(Integer value);

    List<SortInfo> searchCategory();


    List<SortInfo> searchCategoryByName(String name);
}