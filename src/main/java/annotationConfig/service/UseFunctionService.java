package annotationConfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
    @Autowired
    FunctionService fs;

    public String sayHello(){
        return fs.sayHello();
    }
}
