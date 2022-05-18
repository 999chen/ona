package com.a506.oa.web;

import com.a506.oa.common.problem;
import com.a506.oa.common.user;

import com.a506.oa.mapper.Searchmapper;
import com.a506.oa.mapper.loginmapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Usercontrol {
    public  static user user=new user();
    @Resource
    loginmapper loginmapper;
    @Resource
    Searchmapper searchmapper;

    @CrossOrigin
    @GetMapping("/login")
    public Object login(String username, String password){
        System.out.println(username+password);
        if (loginmapper.finduser(username)!=null){
            int id= loginmapper.finduser(username);
            System.out.println("查找id成功");
            if (password.equals(loginmapper.getpassword(id))){
                System.out.println("效验密码成功");
                user.setId(id);
                user.setUsername(username);
                user.setResult(true);
                return  user;
            }else {
                System.out.println("密码错误");
            }
        }
        return false;
    }
    @CrossOrigin
    @GetMapping("/search")
    public List<problem> search(@RequestParam("problem") String problem){
        System.out.println(problem);
        List<problem> search=new ArrayList<>();
        int ttl=2;
        String pro;
        List<problem> end=new ArrayList<>();
        for (int i = 1;i<problem.length(); i++) {
            pro=problem.substring(0,i);

            end=searchmapper.searchproblem(pro);
            if (end!=null&&ttl==2){
                ttl--;
            }
            if (ttl==1&&end.isEmpty()==true){
                pro=problem.substring(0,i-1);
                search=searchmapper.searchproblem(pro);
                System.out.println(search);
                return search;

            }
            if (i==problem.length()-1){
                search=end;
                System.out.println(search);
                return search;
            }
//            System.out.println(end+"  "+ttl);
        }
        System.out.println(search);
        return search;
    }

}
