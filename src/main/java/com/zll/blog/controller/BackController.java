package com.zll.blog.controller;


import com.zll.blog.pojo.SortInfo;
import com.zll.blog.service.CategoryService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "admin/")
public class BackController {
    @Autowired
    private CategoryService categoryService;

    /*分类*/
    @PostMapping("category")
    @ApiImplicitParam(name = "name", value = "分类信息", required = true, dataType = "String")
    @ApiOperation("添加分类")
    public String addCategory(@RequestBody String name) {

        SortInfo sortInfo1 = new SortInfo();
        sortInfo1.setCreate_by(new Date());
        sortInfo1.setModified_by(new Date());
        sortInfo1.setTb_name(name);
        sortInfo1.setTb_number(1L);
        categoryService.addCategory(sortInfo1);
        return null;
    }

    @PostMapping("/updateCategory")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name11", value = "老名字", required = true, dataType = "String" ,paramType = "form"),
            @ApiImplicitParam(name = "newName", value = "新名字", required = true, dataType = "String",paramType = "form")}
    )

    @ApiOperation("更新分类信息")
    public String updateCategory(@RequestParam("name11") String name, @RequestParam("newName") String newName) {
        categoryService.updateCategory(name, newName);
        return null;
    }
}
