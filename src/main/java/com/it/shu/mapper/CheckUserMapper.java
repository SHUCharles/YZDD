package com.it.shu.mapper;

import com.it.shu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Mapper
public interface CheckUserMapper {
    @Select("select * from user where username=#{userName} and password=#{password}")
    List<User> checkUser(User user);
}
