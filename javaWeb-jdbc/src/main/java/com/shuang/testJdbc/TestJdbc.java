package com.shuang.testJdbc;

import java.sql.*;

public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //配置信息
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "123456";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String sql = "select * from users";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("username="+resultSet.getObject("username"));
            System.out.println("password="+resultSet.getObject("password"));
            System.out.println("email="+resultSet.getObject("email"));
            System.out.println("birthday="+resultSet.getObject("birthday"));
        }

        resultSet.close();
        statement.close();
        connection.close();




    }
}
