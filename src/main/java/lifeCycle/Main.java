package lifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 10742 on 2017/12/18.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        context.close();
    }
}
