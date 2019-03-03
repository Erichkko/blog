package com.zll.blog.service.imp;

import com.zll.blog.dao.ArticleContentMapper;
import com.zll.blog.dao.ArticleInfoMapper;
import com.zll.blog.dao.SortInfoMapper;
import com.zll.blog.dto.ArticleDto;
import com.zll.blog.pojo.ArticleInfo;
import com.zll.blog.service.ArticleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleInfoServiceImp implements ArticleInfoService {
    @Autowired
    ArticleInfoMapper articleInfoMapper;
    @Override
    public void deleteCategory(Integer id) {

    }

    @Override
    public void addCategory(ArticleDto articleDto) {
        ArticleInfo info = new ArticleInfo();
        articleInfoMapper.insert(info);
    }

    @Override
    public List<ArticleInfo> searchArticleInfo() {
        return articleInfoMapper.searchArticleInfoList();
    }
}
