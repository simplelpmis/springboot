package com.bzw.web.backmgmt.mapper;

import com.bzw.web.backmgmt.entity.Signin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SigninMapper {
    int insert(@Param("signin")Signin record);

    Signin getSignByUid(@Param("uid") int uid);
}