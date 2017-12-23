package taskschedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 10742 on 2017/12/19.
 */
@Service
public class ScheduleTaskService {
    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void showTime() {
        System.out.println(format.format(new Date()) + " show");
    }

    @Scheduled(cron = "0 22 15 ? * *")
    public void fixTimeExecution(){
        System.out.println(format.format(new Date()) + " fix");
    }
}
