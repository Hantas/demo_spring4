package aopDemo;

import org.springframework.stereotype.Service;

/**
 * Created by 10742 on 2017/12/17.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
