package com.zll.blog.service;

import com.zll.blog.pojo.SortInfo;

public interface CategoryService {
    void addCategory(SortInfo sortInfo);
    void updateCategory(String name,String newName);
}
