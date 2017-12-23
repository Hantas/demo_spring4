package conditional;

import org.springframework.stereotype.Service;

/**
 * Created by 10742 on 2017/12/19.
 */
public class WindowsListService implements ListService{
    public String showListCmd() {
        return "dir";
    }
}
