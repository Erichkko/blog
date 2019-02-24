package com.zll.blog.dao;

import com.zll.blog.pojo.ArticleInfo;
import com.zll.blog.pojo.ArticleInfoExample;
import java.util.List;

public interface ArticleInfoMapper {
    int insert(ArticleInfo record);

    int insertSelective(ArticleInfo record);

    List<ArticleInfo> selectByExample(ArticleInfoExample example);
}