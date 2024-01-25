package store.mahy.test.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: itmahy
 * @Email: mahy_yel@163.com
 * @Date: 2024/1/25 14:33:37
 * @Description: 配置类
 */


@ConfigurationProperties(prefix = "mahy.test")
@Data
public class TestProperties {

    /**
     * 测试A
     */
    private Test a = new Test();

    /**
     * 测试B
     */
    private Test b = new Test();


    @Data
    public static class Test{

        /**
         * 名称
         */
        private String name;

        /**
         * 地址
         */
        private String address;

    }



}
