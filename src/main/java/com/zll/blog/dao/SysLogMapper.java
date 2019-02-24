package com.zll.blog.dao;

import com.zll.blog.pojo.SysLog;
import com.zll.blog.pojo.SysLogExample;
import java.util.List;

public interface SysLogMapper {
    int insert(SysLog record);

    int insertSelective(SysLog record);

    List<SysLog> selectByExample(SysLogExample example);
}