package jdbctemplate.test;

import org.junit.Test;

import java.sql.*;

/**
 * Created by wqh on 2018/2/10.
 */
public class TestJdbcDemo {
    @Test
    public void jdbc() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jdbctemplate", "root", "root");
            //        String sql = "insert into user values ( ?,? )";
            String sql = "SELECT  * FROM  user";
            preparedStatement = connection.prepareStatement(sql);
       /* preparedStatement.setString(1, "rose");
        preparedStatement.setString(2, 112);*/
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String username = resultSet.getString(1);
                String password = resultSet.getString("password");
                System.out.println(username + "---" + password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            resultSet.close();
            preparedStatement.close();
            connection.close();
        }

    }


}
