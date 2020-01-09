package com.xyx.service;

import com.xyx.model.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XYX
 * @since 2019-11-26
 */
public interface UserService extends IService<User> {

    User findUser();

}
