package com.zll.blog.controller;


import com.zll.blog.pojo.SortInfo;
import com.zll.blog.service.CategoryService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "admin/")
public class BackController {
    @Autowired
    private CategoryService categoryService;

    /*分类*/
    @PostMapping("category")
    @ApiImplicitParam(name = "name",value = "分类信息",required = true,dataType = "String")
    @ApiOperation("添加分类")
    public String addCategory(@RequestBody String name){

        SortInfo sortInfo1 = new SortInfo();
        sortInfo1.setCreate_by(new Date());
        sortInfo1.setModified_by(new Date());
        sortInfo1.setName(name);
        sortInfo1.setNumber(1L);
        categoryService.addCategory(sortInfo1);
        return null;
    }
}
