package com.zll.blog.dao;

import com.zll.blog.pojo.ArticleMessage;
import com.zll.blog.pojo.ArticleMessageExample;
import java.util.List;

public interface ArticleMessageMapper {
    int insert(ArticleMessage record);

    int insertSelective(ArticleMessage record);

    List<ArticleMessage> selectByExample(ArticleMessageExample example);
}