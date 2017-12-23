package taskschedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import taskexecutor.TaskExecutorConfig;

/**
 * Created by 10742 on 2017/12/19.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
    }
}
