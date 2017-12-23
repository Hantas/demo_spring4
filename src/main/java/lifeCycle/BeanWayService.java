package lifeCycle;

/**
 * Created by 10742 on 2017/12/18.
 */

public class BeanWayService {
    public void init() {
        System.out.println("初始化");
    }

    public BeanWayService() {
        System.out.println("初始化构造函数");
    }

    public void destroy() {
        System.out.println("销毁");
    }
}
