package c3po.test;

import org.springframework.stereotype.Repository;

/**
 * Created by wqh on 2018/2/10.
 */
@Repository
public class UserDao {
    public void add() {
        System.out.println("userDao..add...");
    }
}
