package springEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 10742 on 2017/12/19.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("xiangjianjian");
    }
}
