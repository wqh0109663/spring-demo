package jdbctemplate.test;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by wqh on 2018/2/10.
 */
public class TestJdbcTemplateFind {
    //查询一个值
    @Test
    public void find(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbctemplate");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "select password from user where username = ?";
        String rose = jdbcTemplate.queryForObject(sql, String.class, "rose");
        System.out.println(rose);
    }
    //查询一个对象
    @Test
    public void findObject(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbctemplate");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "select * from user where username = ?";
        User rose = jdbcTemplate.queryForObject(sql, new MyRowMapper(), "rose");
        System.out.println(rose.getPassword()+"--"+rose.getUsername());

    }

    //查询一个集合
    @Test
    public void findList(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbctemplate");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "select * from user ";
        List<User> userList = jdbcTemplate.query(sql, new MyRowMapper());
        for (User user : userList){
            System.out.println(user.getPassword()+"--"+user.getUsername());
        }

    }




class MyRowMapper implements RowMapper<User>{

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        String username = rs.getString("username");
        String password = rs.getString("password");
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        return user;
    }
}



}
