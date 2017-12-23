package aopDemo;

import java.lang.annotation.*;

/**
 * Created by 10742 on 2017/12/17.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
