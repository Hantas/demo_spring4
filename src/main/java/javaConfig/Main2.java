package javaConfig;

import annotationConfig.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 10742 on 2017/12/17.
 */
public class Main2 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FunctionConfig2.class);
        UseFunctionService2 service = context.getBean(UseFunctionService2.class);
        System.out.println(service.sayHello());
        context.close();
    }
}
