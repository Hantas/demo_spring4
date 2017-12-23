package profileDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by 10742 on 2017/12/18.
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    DemoBean devDemoBean(){
        return new DemoBean("dev");
    }

    @Bean
    @Profile("prod")
    DemoBean prodDemoBean(){
        return new DemoBean("prod");
    }
}
