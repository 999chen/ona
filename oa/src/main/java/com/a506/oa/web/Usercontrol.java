package com.a506.oa.web;

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
    @GetMapping("/login")
    public Object login(int id, String password){
        if (loginmapper.finduser(id)!=null){
            System.out.println("查找id成功");
            System.out.println(password);
            System.out.println(loginmapper.getpassword(id));
            if (password.equals(loginmapper.getpassword(id))){
                System.out.println("效验密码成功");
                user.setId(id);
                user.setUsername(loginmapper.getusername(id));
                user.setResult(true);
                return  user;
            }
        }
        return false;
    }
    @CrossOrigin
    @GetMapping("/search")
    public List<String> search(@RequestParam("problem") String problem){
        System.out.println(problem);
        List<String> search=new ArrayList<>();
        int ttl=2;
        String pro;
        List<String> end=new ArrayList<>();
        for (int i = 1;i<problem.length(); i++) {
            pro=problem.substring(0,i);

            end=searchmapper.searchproblem(pro);
            if (end!=null&&ttl==2){
                ttl--;
            }
            if (ttl==1&&end.isEmpty()==true){
                pro=problem.substring(0,i-1);
                search=searchmapper.searchproblem(pro);
                return search;

            }
            if (i==problem.length()-1){
                search=end;
                return search;
            }
//            System.out.println(end+"  "+ttl);
        }
        return search;
    }

}
