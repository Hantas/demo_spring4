package taskschedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by 10742 on 2017/12/19.
 */
@Configuration
@ComponentScan("taskschedule")
@EnableScheduling
public class TaskScheduleConfig {
}
