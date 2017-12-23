package javaConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 10742 on 2017/12/17.
 */
@Configuration
public class FunctionConfig2 {
    @Bean
    public FunctionService2 fs2(){
        return new FunctionService2();
    }
    @Bean
    public UseFunctionService2 useFunctionService2(){
        UseFunctionService2 useFunctionService2 = new UseFunctionService2();
        useFunctionService2.setFs(fs2());
        return useFunctionService2;
    }
}
