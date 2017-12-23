package beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by 10742 on 2017/12/17.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
