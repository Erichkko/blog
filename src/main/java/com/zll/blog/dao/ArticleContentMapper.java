package com.zll.blog.dao;

import com.zll.blog.pojo.ArticleContent;
import com.zll.blog.pojo.ArticleContentExample;
import java.util.List;

public interface ArticleContentMapper {
    int insert(ArticleContent record);

    int insertSelective(ArticleContent record);

    List<ArticleContent> selectByExampleWithBLOBs(ArticleContentExample example);

    List<ArticleContent> selectByExample(ArticleContentExample example);
}