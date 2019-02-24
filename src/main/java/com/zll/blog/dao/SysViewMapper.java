package com.zll.blog.dao;

import com.zll.blog.pojo.SysView;
import com.zll.blog.pojo.SysViewExample;
import java.util.List;

public interface SysViewMapper {
    int insert(SysView record);

    int insertSelective(SysView record);

    List<SysView> selectByExample(SysViewExample example);
}