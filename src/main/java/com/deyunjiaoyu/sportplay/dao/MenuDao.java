package com.deyunjiaoyu.sportplay.dao;

import com.deyunjiaoyu.sportplay.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Email: 1793925141@qq.com
 * @Author: yangzhan
 * @Tiem: 2021/3/6 12:58 星期六
 * @Software: IntelliJ IDEA
 * @File : MenuDao.JAVA
 */
@Repository
public interface MenuDao {
    public List<MainMenu> getMenus();
}
