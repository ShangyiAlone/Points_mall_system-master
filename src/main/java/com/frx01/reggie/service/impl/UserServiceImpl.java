package com.frx01.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frx01.reggie.entity.User;
import com.frx01.reggie.mapper.UserMapper;
import com.frx01.reggie.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/30  15:11
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getScore(String phoneNum) {

        return userMapper.getScore(phoneNum);
    }
}
