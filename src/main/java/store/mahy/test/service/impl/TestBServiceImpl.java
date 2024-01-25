package store.mahy.test.service.impl;

import store.mahy.test.properties.TestProperties;
import store.mahy.test.service.TestService;

/**
 * @Author: itmahy
 * @Email: mahy_yel@163.com
 * @Date: 2024/1/25 14:55:53
 * @Description:
 */

public class TestBServiceImpl implements TestService {

    private TestProperties test;
    public TestBServiceImpl(TestProperties test) {
        this.test = test;
    }
    public String test(String desc) {
        System.out.println(test.toString() + "====>>>>B:" + desc);
        return "测试B";
    }
}
