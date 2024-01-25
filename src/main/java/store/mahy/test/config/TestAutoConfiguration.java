package store.mahy.test.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import store.mahy.test.properties.TestProperties;
import store.mahy.test.service.impl.TestAServiceImpl;
import store.mahy.test.service.impl.TestBServiceImpl;

/**
 * @Author: itmahy
 * @Email: mahy_yel@163.com
 * @Date: 2024/1/25 14:46:17
 * @Description: 测试自动配置类
 */
@EnableConfigurationProperties(value = TestProperties.class)
@Configuration
public class TestAutoConfiguration {

    /**
     * 测试A
     * @param testProperties s
     * @return s
     */
    @Bean
    public TestAServiceImpl aTest(TestProperties testProperties){
        return new TestAServiceImpl(testProperties);
    }

    /**
     * 测试b
     * @param testProperties s
     * @return s
     */
    @Bean
    public TestBServiceImpl bTest(TestProperties testProperties){
        return new TestBServiceImpl(testProperties);
    }

}
