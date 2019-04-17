package cn.itcast.angular.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试控制器
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2018-07-11<p>
 */
@RestController
public class TestController {

    /** 处理get请求与post请求 */
    @RequestMapping("/find")
    public Map<String,String> find(@RequestParam Long id){
        System.out.println("id = " + id);
        Map<String,String> user = new HashMap<>();
        user.put("id","1");
        user.put("name","马蒂");
        return user;
    }

    /**  处理post请求 */
    @PostMapping("/user")
    public Map<String,String> user(@RequestBody Map<String,String> map){
        System.out.println("name = " + map.get("name"));
        Map<String,String> data = new HashMap<>();
        data.put("msg",map.get("name") + ",你好");
        return data;
    }
}