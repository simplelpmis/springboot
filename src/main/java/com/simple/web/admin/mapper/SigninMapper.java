package com.simple.web.admin.mapper;

import com.simple.web.admin.entity.Signin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SigninMapper {
    int insert(@Param("signin")Signin record);

    Signin getSignByUid(@Param("uid") int uid);
}