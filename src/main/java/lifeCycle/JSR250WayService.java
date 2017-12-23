package lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by 10742 on 2017/12/18.
 */
public class JSR250WayService {
    @PostConstruct
    public void init() {
        System.out.println("初始化");
    }

    public JSR250WayService() {
        System.out.println("初始化构造函数");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁");
    }
}
