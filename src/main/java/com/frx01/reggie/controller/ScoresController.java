package com.frx01.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.frx01.reggie.common.R;
import com.frx01.reggie.entity.User;
import com.frx01.reggie.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/score")
public class ScoresController {
    @Autowired
    private UserService userService;

//    积分排行榜接口
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize){
        //分页构造器对象
        Page<User> pageInfo = new Page<>(page, pageSize);
        //构造条件查询对象
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.orderByDesc(User::getScores);

        userService.page(pageInfo,queryWrapper);
        return R.success(pageInfo);
    }

//  根据电话号获得用户的积分数据
    @GetMapping("/userScore")
    public R<List<User>> getUserScore(String phoneNumber){
        System.out.println(phoneNumber);
        List<User> score =  userService.getScore(phoneNumber);
        return R.success(score);
    }
}
