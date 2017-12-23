package annotationConfig.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("annotationConfig.service")
public class FunctionConfig {
}