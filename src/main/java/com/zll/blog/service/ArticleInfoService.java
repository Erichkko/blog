package com.zll.blog.service;

import com.zll.blog.dto.ArticleDto;
import com.zll.blog.pojo.ArticleInfo;
import com.zll.blog.pojo.SortInfo;

import java.util.List;

public interface ArticleInfoService {

    void deleteCategory(Integer id);

    void addCategory(ArticleDto articleDto);

    List<ArticleInfo> searchArticleInfo();
}
