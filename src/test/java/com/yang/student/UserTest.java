package com.yang.student;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.yang.student.mybatisPlus.mapper.UserMapper;
import com.yang.student.mybatisPlus.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by Miracle Yang～ on 2021/6/21 10:13 上午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void select(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
        //User(id=1, name=大BOSS, age=40, email=boss@baomidou.com, managerId=null, createTime=2021-03-22T09:48)
        //User(id=2, name=李经理, age=40, email=boss@baomidou.com, managerId=1, createTime=2021-01-22T09:48)
        //User(id=3, name=黄主管, age=40, email=boss@baomidou.com, managerId=2, createTime=2021-01-22T09:48)
        //User(id=4, name=吴组长, age=40, email=boss@baomidou.com, managerId=2, createTime=2021-02-22T09:48)
        //User(id=5, name=小菜, age=40, email=boss@baomidou.com, managerId=2, createTime=2021-02-22T09:48)
    }

    /**
     * 当某个表的列特别多，而SELECT的时候只需要选取个别列，查询出的结果也没必要封装成Java实体类对象时
     * （只查部分列时，封装成实体后，实体对象中的很多属性会是null），则可以用selectMaps，获取到指定的列后，
     * 再自行进行处理即可
     */
    @Test
    public void selectPart(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("id","name","email")
                .gt("id","1")
                .like("email","@");
        List<Map<String, Object>> map = userMapper.selectMaps(wrapper);
        map.forEach(System.out::println);
        //{name=大BOSS, id=1, email=boss@baomidou.com}
        //{name=李经理, id=2, email=boss@baomidou.com}
        //{name=黄主管, id=3, email=boss@baomidou.com}
        //{name=吴组长, id=4, email=boss@baomidou.com}
        //{name=小菜, id=5, email=boss@baomidou.com}
    }

    /**
     * 进行数据统计
     */
    @Test
    public void selectCondition(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("manager_id", "avg(age) avg_age", "min(age) min_age", "max(age) max_age")
                .groupBy("manager_id").having("sum(age) < {0}", 500);
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);
        //{max_age=40, avg_age=40.0000, min_age=40}
        //{max_age=40, avg_age=40.0000, manager_id=1, min_age=40}
        //{max_age=40, avg_age=40.0000, manager_id=2, min_age=40}
    }

    @Test
    public void updateWrapper(){
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.set("name","菜经理");
        wrapper.setSql("age=age-"+9);
        wrapper.eq("id",5);
        //int update = userMapper.update(new User(), wrapper);
        //System.out.println(update);
    }

}
