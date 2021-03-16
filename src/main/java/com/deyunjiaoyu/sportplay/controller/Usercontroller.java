package com.deyunjiaoyu.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.deyunjiaoyu.sportplay.bean.QueryInfo;
import com.deyunjiaoyu.sportplay.bean.User;
import com.deyunjiaoyu.sportplay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @Email: 1793925141@qq.com
 * @Author: yangzhan
 * @Tiem: 2021/3/6 17:21 星期六
 * @Software: IntelliJ IDEA
 * @File : Usercontroller.JAVA
 */
@RestController
public class Usercontroller {
    @Autowired
    private UserDao userDao;
    //查询用户
    @RequestMapping("/alluser")
    public String getUserList(QueryInfo queryInfo){
        //获取最大数和当前编号
        int numbers = userDao.getUserCounts("%"+queryInfo.getQuery()+"%");
        int pageStart = (queryInfo.getPageNum() -1) * queryInfo.getPageSize();
        List<User> users = userDao.getAllUser("%"+queryInfo.getQuery()+"%",pageStart,queryInfo.getPageSize());
        HashMap<String, Object> res = new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",users);
        System.out.println(users);
        String result = JSON.toJSONString(res);
        return result;
    }
//    状态更改
    @RequestMapping("/userstate")
    public String updateUserState (@RequestParam("id") Integer id, @RequestParam("state") Boolean state){
        int i = userDao.updateState(id,state);
        return i>0 ? "success":"error";
    }
//    添加用户
    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        user.setRole("普通用户");
        user.setState(false);
        int i = userDao.addUser(user);
        return i > 0 ? "success":"error";
    }
//    删除用户
    @RequestMapping("/deleteUser")
    public String deleteUser(int id){
        int i = userDao.deleteUserById(id);
        return i > 0 ? "success":"error";
    }
//    修改信息
//    1.获取用户id
    @RequestMapping("/getUpdate")
    public String getUpdateUserById(int id) {
        User user = userDao.getUpdaraUser(id);
        return JSON.toJSONString(user);
    }
//    2.修改用户信息
    @RequestMapping("/editUser")
    public String editUser(@RequestBody User user) {
        int i = userDao.editUser(user);
        return i > 0 ? "success":"error";
    }
}
