package com.zll.blog.service.imp;

import com.zll.blog.dao.SortInfoMapper;
import com.zll.blog.pojo.SortInfo;
import com.zll.blog.pojo.SortInfoExample;
import com.zll.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
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
    public void deleteCategory(Integer id) {
        sortInfoMapper.deleteCategory(id);
    }

    @Override
    public void updateCategory(Integer name,String newName) {
        Map<String,Object> map  = new HashMap<>();
        map.put("id",name);
        map.put("newName",newName);
       int n =  sortInfoMapper.updateCategory(map);
       System.out.println("n === "+n);
    }

    @Override
    public List<SortInfo> searchCategory() {
        List<SortInfo> sortInfos = sortInfoMapper.searchCategory();
        System.out.println("size == "+sortInfos.size());
        return sortInfos;
    }

    @Override
    public List<SortInfo> searchCategory(String name) {
        return sortInfoMapper.searchCategoryByName(name);
    }
}
