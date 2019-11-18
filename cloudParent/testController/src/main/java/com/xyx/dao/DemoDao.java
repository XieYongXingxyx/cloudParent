package com.xyx.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xyx
 * @TIME 2019/11/15 17:46
 */
@Mapper
public interface DemoDao  extends BaseMapper {
     List<Integer> findIds();
}
