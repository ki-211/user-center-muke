package org.yupi.usercenter.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.yupi.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
* @author ZKT
* {@code @description} 针对表【user(用户)】的数据库操作Service
* {@code @createDate} 2025-01-19 17:15:39
 */

public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账号
     * @param userPassword  用户密码
     * @param checkPassword 检验密码
     * @return  新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账号
     * @param userPassword 用户密码
     * @param request
     * @return 用户脱敏信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param user 用户
     * @return 返回脱敏的用户信息
     */
    User getSafetyUser(User user);

    /**
     * 注销用户
     *
     * @param request web的seesion
     * @return 返回一个int表示正确注销
     */
    int userLogout(HttpServletRequest request);

}
