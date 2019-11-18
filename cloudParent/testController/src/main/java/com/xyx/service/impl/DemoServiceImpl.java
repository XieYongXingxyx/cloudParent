package com.xyx.service.impl;

import com.xyx.dao.DemoDao;
import com.xyx.service.demoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xyx
 * @TIME 2019/11/15 17:46
 */
@Service
public class DemoServiceImpl implements demoService {

    @Autowired
    private DemoDao demoDao;
    /**
     * 查询所有id
     */
    public List<Integer> findIds() {
        return demoDao.findIds();
    }
}
