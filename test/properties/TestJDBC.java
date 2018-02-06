package test.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by wqh on 2018/2/6.
 */
public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        DataSource pool =(DataSource) applicationContext.getBean("pool");
        Connection connection = null;

        try {
            connection = pool.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            connection.close();
        }

        if (connection!=null) {
            System.out.println(connection);
        }
        else {
            System.out.println("连接为空了");
        }
    }
}
