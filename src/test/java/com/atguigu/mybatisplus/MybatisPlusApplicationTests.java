package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserService userService;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    void test01(){
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }

    @Test
    void test02(){
        List<User> users = userMapper.selUsersByName("jack");
        users.forEach(System.out::println);
    }
    @Test
    void test03(){
        List<User> users = userService.selUsersByName("jack");
        users.forEach(System.out::println);
    }
    @Test
    void test04(){
        int i = userMapper.deleteById(1);
    }
    @Test
    void test05(){
        Page<User> userPage = new Page<>(1, 3);
        userMapper.selectPageVo(userPage,20);
        List<User> records = userPage.getRecords();
        records.forEach(System.out::println);
    }
    @Test
    void test06(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","n");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
        System.out.println("搞定了！");
        System.out.println("搞定了123！");
        System.out.println("搞定了123456！");
        System.out.println("master！");
        System.out.println("hot-fix！");
        System.out.println("push test！");
        System.out.println("push test！");
    }
}
