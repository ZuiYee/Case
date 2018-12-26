package cn.itcast.service;

//用户管理的业务接口


import cn.itcast.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户信息
     */

    public List<User> findAll();

    User login(User user);

    /**
     * 保存User
     * @param user
     */
    void addUser(User user);

    /**
     * 根据id 删除
     * @param id
     */
    void deleteUser(String id);

    /**
     * 根据id 查询
     * @param id
     * @return
     */
    User findUserById(String id);

    /**
     * 修改信息
     * @param user
     */
    void updateUser(User user);
}
