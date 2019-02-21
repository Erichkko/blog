package com.zll.blog.test.service.imp;

import com.zll.blog.test.pojo.User;
import com.zll.blog.test.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {
    @Override
    public void login(User user) {
        System.out.print("用户 登录测试");
    }
}
