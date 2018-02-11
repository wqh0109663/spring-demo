package tx.anno.test;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by wqh on 2018/2/10.
 */
@Service
@Transactional
public class UserService {
    @Resource(name = "userDao")
    private UserDao userDao;


    public void countTest() {
        userDao.add();
       // int a = 1 / 0 ;
        userDao.less();
    }


}
