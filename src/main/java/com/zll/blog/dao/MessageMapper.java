package com.zll.blog.dao;

import com.zll.blog.pojo.Message;
import com.zll.blog.pojo.MessageExample;
import java.util.List;

public interface MessageMapper {
    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);
}