package com.zll.blog.controller;


import com.zll.blog.service.ArticleInfoService;
import com.zll.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


public class BaseController {
    @Autowired
    CategoryService categoryService;


    @Autowired
    ArticleInfoService articleInfoService;

}
