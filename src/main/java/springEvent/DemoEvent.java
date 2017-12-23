package springEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * Created by 10742 on 2017/12/18.
 */
public class DemoEvent extends ApplicationEvent {

    public static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
