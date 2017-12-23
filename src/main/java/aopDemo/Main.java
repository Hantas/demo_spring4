package aopDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 10742 on 2017/12/17.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService service1 = context.getBean(DemoAnnotationService.class);
        DemoMethodService service2 = context.getBean(DemoMethodService.class);
        service1.add();
        service2.add();
        context.close();
    }
}
