package lifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 10742 on 2017/12/18.
 */
@Configuration
@ComponentScan("lifeCycle")
public class PrePostConfig {
    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }
}
