package com.bzw.web.backmgmt.mapper;

import com.bzw.web.backmgmt.entity.Jfuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Jfuser1Mapper {

    int insert(@Param("jfuser") Jfuser record);
    int getLastInsertId();
}