package fortest;

import annotation.WiselyConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by 10742 on 2017/12/19.
 */
@WiselyConfiguration("fortest")
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("dev");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("prod");
    }
}
