package com.a506.oa.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface loginmapper {
    @Select("Select id from user where username=#{username}")
    public Integer finduser(String username);
    @Select("select password from user where id=#{id}")
    public String getpassword(int id);
    @Select("Select username from user where id=#{id}")
    public String getusername(int id);
}
