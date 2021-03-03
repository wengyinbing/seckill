package com.weng.seckill.service;

import com.weng.seckill.common.response.Result;
import com.weng.seckill.model.UmsAdmin;
import org.springframework.security.core.userdetails.UserDetails;

public interface UmsAdminService {

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username,String password);

    /**
     * 刷新token的功能
     * @param oldToken 旧的token
     */
    String refreshToken(String oldToken);
    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 生成验证码
     */
    Result generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    Result verifyAuthCode(String telephone, String authCode);
}
