package com.zll.blog.service.imp;

import com.zll.blog.dao.SortInfoMapper;
import com.zll.blog.pojo.SortInfo;
import com.zll.blog.pojo.SortInfoExample;
import com.zll.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private SortInfoMapper sortInfoMapper;

    @Override
    public void addCategory(SortInfo sortInfo) {
        sortInfoMapper.insert(sortInfo);
    }

    @Override
    public void updateCategory(String name,String newName) {
        Map<String,Object> map  = new HashMap<>();
        map.put("name",name);
        map.put("newName",newName);
       int n =  sortInfoMapper.updateCategory(map);
       System.out.println("n === "+n);
    }
}
