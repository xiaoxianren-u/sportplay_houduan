package com.deyunjiaoyu.sportplay.controller;


import com.deyunjiaoyu.sportplay.bean.User;
import com.deyunjiaoyu.sportplay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Email: 1793925141@qq.com
 * @Author: yangzhan
 * @Tiem: 2021/3/5 12:51 星期五
 * @Software: IntelliJ IDEA
 * @File : LoginController.JAVA
 */

@RestController
public class LoginController {

    @Autowired
    UserDao userDao;

//    @Autowired
//    public void setUserDao (UserDao userDao) {
//        this.userDao = userDao;
//    }

    @RequestMapping("/login")

    public User login(@RequestBody User user) {
        String flag = "error";
        User us = userDao.getUserByMassage(user.getUsername(), user.getPassword());
        System.out.println("user:" + us);
        System.out.println("user:" + user);
        if (us != null) {
            if (us.getUsername().equals(user.getUsername()) && us.getPassword().equals(user.getPassword())) {
                return us;
            } else {
                return null;
            }
        } else if ("".equals(us)) {
            return null;
        }
////         /**
//         * 现无法使用 不懂为什么
//         */
//        HashMap<String, Object> res = new HashMap<>();
//
//        if (us!=null) {
//            flag = "ok";
//        }
//        res.put("flag",flag);
//        res.put("user",user);
//        String res_json = JSON.toJSONString(res);
//        System.out.println(res_json);
//        return res_json;
        return null;
    }

}
