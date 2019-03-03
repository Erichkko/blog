package com.zll.blog.controller;


import com.zll.blog.dto.ArticleDto;
import com.zll.blog.pojo.ArticleInfo;
import com.zll.blog.pojo.SortInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "admin")
@Api(tags = "后台管理接口")
public class BackController extends BaseController{

    /*分类*/
    @PostMapping("/category/add")
    @ApiImplicitParam(name = "name", value = "分类信息", required = true)
    @ApiOperation("添加分类")
    public String addCategory(@RequestBody String name) {

        String name1 = "";
        try {
            JSONObject object = new JSONObject(name);
            name1 =  object.getString("name");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        SortInfo sortInfo1 = new SortInfo();
        sortInfo1.setCreate_by(new Date());
        sortInfo1.setModified_by(new Date());
        sortInfo1.setTb_name(name1);
        sortInfo1.setTb_number(1L);
        sortInfo1.setIs_effective(false);
        categoryService.addCategory(sortInfo1);
        return null;
    }
    @ApiOperation("更新分类信息")
    @PostMapping("/category/update")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name11", value = "老名字", required = true, dataType = "String" ,paramType = "form"),
            @ApiImplicitParam(name = "newName", value = "新名字", required = true, dataType = "String",paramType = "form")}
    )

    public String updateCategory(@RequestBody() String json) {

        Integer id =0;
        String newName =null;
        try {
            JSONObject object = new JSONObject(json);
            id =  object.getInt("id");
            newName =  object.getString("name");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        categoryService.updateCategory(id, newName);
        return null;
    }
    @ApiOperation("删除分类")
    @ApiImplicitParam(name = "id", value = "分类信息id", required = true, dataType = "Integer")
    @PostMapping("/category/delete")
    public String deleteCategory(@RequestBody Integer id) {
        categoryService.deleteCategory(id);
        return null;
    }

    @ApiOperation("根据名称查询")
    @GetMapping("/category/search/{name11}")
    public List<SortInfo> searchCategoryByName(@PathVariable String name11) {
        return categoryService.searchCategory(name11);
    }



    /*新增文章*/
    @ApiOperation("新增文章")
    @PostMapping("/article/add")
    @ApiImplicitParam(name = "article" ,value = "文章信息" ,dataType = "ArticleDto")
    public void addArticle(@RequestBody ArticleDto article){
        System.out.println("json == ");
        articleInfoService.addCategory(article);
    }

}
