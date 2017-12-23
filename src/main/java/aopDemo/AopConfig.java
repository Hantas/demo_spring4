package aopDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by 10742 on 2017/12/17.
 */
@Configuration
@ComponentScan("aopDemo")
@EnableAspectJAutoProxy
public class AopConfig {
}
