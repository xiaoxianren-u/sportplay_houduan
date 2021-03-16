package com.deyunjiaoyu.sportplay.dao;

import com.deyunjiaoyu.sportplay.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Email: 1793925141@qq.com
 * @Author: yangzhan
 * @Tiem: 2021/3/5 12:59 星期五
 * @Software: IntelliJ IDEA
 * @File : UserDao.JAVA
 */
@Repository
public interface UserDao {
    /**
     *were
     * @param username
     * @param password
     * @return
     */
    public User getUserByMassage(@Param("username") String username,@Param("password") String password);
    public List<User> getAllUser(@Param("username") String username,@Param("pageStart") int pageStart,@Param("pageSize") int pageSize);
    //获取所有用户的个数
    public int getUserCounts(@Param("username") String username);
    //state状态操作
    public int updateState( @Param("id") Integer id,@Param("state") Boolean state);
    //添加用户
    public int addUser(User user);
    //删除操作
    public int deleteUserById(int id);
    //修改
    public User getUpdaraUser(int id);

    public int editUser(User user);
}
