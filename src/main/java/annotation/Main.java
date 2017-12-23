package annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 10742 on 2017/12/19.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService service = context.getBean(DemoService.class);
        service.output();
        context.close();
    }
}
