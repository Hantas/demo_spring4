package annotationConfig;

import annotationConfig.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 10742 on 2017/12/17.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        UseFunctionService service = context.getBean(UseFunctionService.class);
        System.out.println(service.sayHello());
        context.close();
    }
}
