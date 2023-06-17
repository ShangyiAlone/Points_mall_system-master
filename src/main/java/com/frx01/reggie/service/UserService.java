package com.frx01.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frx01.reggie.entity.User;

import java.util.List;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/30  15:10
 */
public interface UserService extends IService<User> {
    List<User> getScore(String phoneNum);
}
