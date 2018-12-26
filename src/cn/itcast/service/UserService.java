package cn.itcast.service;

//用户管理的业务接口


import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

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

    /**
     * 批量删除
     * @param ids
     */
    void delSelectedUser(String[] ids);

    /**
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition
     * @return
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
