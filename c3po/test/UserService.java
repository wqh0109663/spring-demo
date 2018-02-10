package c3po.test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wqh on 2018/2/10.
 */
@Service
public class UserService {
    @Resource(name = "userDao")
    private UserDao userDao;
    @Resource
    private JdbcTemplate jdbcTemplate;

   /* public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public void add() {
        System.out.println("userService....add");
        userDao.add();
        String sql = "insert into user values ( ? , ? )";
        jdbcTemplate.update(sql, "laowang", "999");

    }


}
