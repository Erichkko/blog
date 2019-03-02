package com.zll.blog.controller;


import com.zll.blog.pojo.SortInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class ForeController extends BaseController {
    @ApiOperation("查询分类信息")
    @GetMapping("/category/list")
    public List<SortInfo> searchAllCategory() {

        return  categoryService.searchCategory();
    }
}
