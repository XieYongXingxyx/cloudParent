package com.xyx.mapper;

import com.xyx.model.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author XYX
 * @since 2019-11-26
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    @Select("select * from user where id=3")
    User findUser();
}
