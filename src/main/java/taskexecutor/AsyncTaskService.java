package taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by 10742 on 2017/12/19.
 */
@Service
public class AsyncTaskService {

    private static int count = 0;

    @Async
    public void executorAsyncTaskAdd(){
        System.out.println("异步任务: " + ++count);
    }
    @Async
    public void executorAsyncTaskReduce(){
        System.out.println("异步任务: " + --count);
    }
}
