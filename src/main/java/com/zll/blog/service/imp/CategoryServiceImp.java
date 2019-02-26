package com.zll.blog.service.imp;

import com.zll.blog.dao.SortInfoMapper;
import com.zll.blog.pojo.SortInfo;
import com.zll.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private SortInfoMapper sortInfoMapper;

    @Override
    public void addCategory(SortInfo sortInfo) {
        sortInfoMapper.insertSelective(sortInfo);
    }
}
