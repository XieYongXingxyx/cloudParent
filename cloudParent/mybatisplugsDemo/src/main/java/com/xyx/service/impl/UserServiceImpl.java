package com.xyx.service.impl;

import com.xyx.model.User;
import com.xyx.mapper.UserDao;
import com.xyx.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XYX
 * @since 2019-11-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    @Autowired
    private UserDao userDao;

    public User findUser() {
        return userDao.findUser();
    }
}
