package com.pjb.service;

import com.pjb.entity.UserInfo;

/**
 * @author jinbin
 * @date 2017-12-01 21:22
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);
}
