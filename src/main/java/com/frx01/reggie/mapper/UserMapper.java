package com.frx01.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frx01.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/30  15:10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("update user set scores=scores-#{score} where  id=#{userId};")
    List<User> sub_score(@Param("score") int score,@Param("userId") Long userId);

    @Select("update user set money=money-#{money} where  id=#{userId};")
    List<User> sub_money(@Param("money") int money,@Param("userId") Long userId);

    @Select("update user set scores=scores + #{amount} where  id=#{type};")
    List<User> add(@Param("type") Long type,@Param("amount") BigDecimal amount);

    @Select("select * from user where  phone=#{phoneNum};")
    List<User> getScore(@Param("phoneNum") String phoneNum);
}
