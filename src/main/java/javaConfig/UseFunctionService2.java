package javaConfig;
/**
 * Created by 10742 on 2017/12/17.
 */
public class UseFunctionService2 {

    FunctionService2 fs;

    public void setFs(FunctionService2 fs){
        this.fs = fs;
    }

    public String sayHello(){
        return fs.sayHello();
    }
}
