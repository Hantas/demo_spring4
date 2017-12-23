package annotation;

import org.springframework.stereotype.Service;

/**
 * Created by 10742 on 2017/12/19.
 */
@Service
public class DemoService {
    public void output(){
        System.out.println("成功获取Bean");
    }
}
