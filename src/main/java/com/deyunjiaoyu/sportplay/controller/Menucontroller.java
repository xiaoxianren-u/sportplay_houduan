package com.deyunjiaoyu.sportplay.controller;

import com.deyunjiaoyu.sportplay.bean.MainMenu;
import com.deyunjiaoyu.sportplay.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @Email: 1793925141@qq.com
 * @Author: yangzhan
 * @Tiem: 2021/3/6 13:38 星期六
 * @Software: IntelliJ IDEA
 * @File : Menycontroller.JAVA
 */
@RestController
public class Menucontroller {

    @Autowired
    MenuDao menuDao;

    @RequestMapping("/menus")
    public List<MainMenu> getAllMenus(){
        List<MainMenu> menus = menuDao.getMenus();
        if(menus!=null){
            System.out.println("启动成功！！");
//            System.out.println(menus);
            return menus;
        }else {
            System.out.println("1231");
            return null;
        }

    }
}