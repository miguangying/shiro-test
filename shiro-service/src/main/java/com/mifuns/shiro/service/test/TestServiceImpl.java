package com.mifuns.shiro.service.test;

import com.mifuns.shiro.facade.test.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by miguangying on 2017/3/1.
 */
@Service("testService")
public class TestServiceImpl implements TestService{
    @Override
    public String insertService() {
        return "OK";
    }
}
