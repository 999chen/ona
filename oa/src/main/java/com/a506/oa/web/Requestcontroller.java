package com.a506.oa.web;

import com.a506.oa.common.user;
import com.a506.oa.mapper.Searchmapper;
import com.a506.oa.mapper.loginmapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
//
//@Controller
public class Requestcontroller {
//    public  static user user=new user();
//    @Resource
//    loginmapper loginmapper;
//    @Resource
//    Searchmapper searchmapper;
//
//    @CrossOrigin
//    @GetMapping("/login")
//    public Object login(String username, String password){
//        System.out.println(username+password);
//        if (loginmapper.finduser(username)!=null){
//            int id= loginmapper.finduser(username);
//            System.out.println("查找id成功");
//            if (password.equals(loginmapper.getpassword(id))){
//                System.out.println("效验密码成功");
//                user.setId(id);
//                user.setUsername(username);
//                user.setResult(true);
//                return  user;
//            }else {
//                System.out.println("密码错误");
//            }
//        }
//        return false;
//    }

}
