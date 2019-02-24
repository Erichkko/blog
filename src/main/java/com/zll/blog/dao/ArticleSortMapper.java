package com.zll.blog.dao;

import com.zll.blog.pojo.ArticleSort;
import com.zll.blog.pojo.ArticleSortExample;
import java.util.List;

public interface ArticleSortMapper {
    int insert(ArticleSort record);

    int insertSelective(ArticleSort record);

    List<ArticleSort> selectByExample(ArticleSortExample example);
}