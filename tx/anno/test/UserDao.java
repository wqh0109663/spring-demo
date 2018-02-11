package tx.anno.test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by wqh on 2018/2/10.
 *  做对数据库操作的方法，不写业务操作
 */
@Repository
public class UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    public void add() {
        String sql = "UPDATE count SET  money  = money + ? where name = ?";
        jdbcTemplate.update(sql, 1000, "老王");
    }
    public void less() {
        String sql = "UPDATE count SET  money  = money - ? where name = ?";
        jdbcTemplate.update(sql, 1000, "老吴");
    }

}
