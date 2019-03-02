package com.zll.blog.service;

import com.zll.blog.pojo.SortInfo;

import java.util.List;

public interface CategoryService {
    void addCategory(SortInfo sortInfo);
    void deleteCategory(Integer id);
    void updateCategory(Integer id,String newName);
    List<SortInfo> searchCategory();
    List<SortInfo> searchCategory(String name);
}
