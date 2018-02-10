package jdbctemplate.test;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by wqh on 2018/2/10.
 */
public class TestDemo1 {
    //添加  增删改是可以跟下面的类似
    @Test
    public void add() {
        //设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbctemplate");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //创建jdbctemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //使用jdbctemplate的方法
        String sql = "insert into user values (?,?)";
        int rows = jdbcTemplate.update(sql, "mary", "520");
        System.out.println(rows);
    }
    //查询
    @Test
    public void find(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbctemplate");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "select count(*) from user";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        int count = integer;
        System.out.println(count);


    }


}
