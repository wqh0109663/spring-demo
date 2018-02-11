package tx.test;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wqh on 2018/2/10.
 */
@Service
public class UserService {
    @Resource(name = "userDao")
    private UserDao userDao;


    public void countTest() {
        userDao.add();
       // int a = 1 / 0 ;
        userDao.less();
    }


}
