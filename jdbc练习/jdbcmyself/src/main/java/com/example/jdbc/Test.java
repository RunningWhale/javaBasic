package com.example.jdbc;

import java.sql.*;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userTest?user=root&password=123456&useUnicode=true&characterEncoding=utf8&useSSL=false");
        Statement statement = connection.createStatement();
        int id = 999;
        String name = "袁绍";
        String sql = "update userinfo set name = ' " + name + "' where (id =" + id + ")";
        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }

    public static void main5(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userTest?user=root&password=123456&useUnicode=true&characterEncoding=utf8&useSSL=false");
        Statement statement = connection.createStatement();
        int id = 999;
        String name = "曹操";
        String sql = "insert into userinfo values(" + id + "," + "'" + name + "'" + ")";
//        String sql = "insert into userinfo values(" + id + "," + "\"" + name + "\"" + ")";
        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }


    public static void main4(String[] args) throws SQLException, ClassNotFoundException {
        //1、加载jdbc驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2、创建数据库连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userTest?user=root&password=123456&useUnicode=true&characterEncoding=utf8&useSSL=false");
        //3、写sql语句
        String sql = "delete from userinfo where id=?";
        //4、获得statement对象
        PreparedStatement statement = connection.prepareStatement(sql);
        //5、执行sql语句
        int id = 99;
        statement.setInt(1, id);
        statement.executeUpdate();
        //6、关闭连接
        statement.close();
        connection.close();
    }

    public static void main3(String[] args) throws SQLException, ClassNotFoundException {
        //1、加载jdbc驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2、创建数据库连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userTest?user=root&password=123456&useUnicode=true&characterEncoding=utf8&useSSL=false");
        //3、写sql语句
        String sql = "update userinfo set name=? where id=?";
        //4、获得statement对象
        PreparedStatement statement = connection.prepareStatement(sql);
        //5、执行sql语句
        int id = 99;
        String name = "嬴政";//这两个数据可以从提交到后台的请求中拿到，并添加到数据库中
        statement.setString(1, name);
        statement.setInt(2, id);
        statement.executeUpdate();
        //6、关闭连接
        statement.close();
        connection.close();
    }


    public static void main2(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载jdbc驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2、创建数据库连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userTest?user=root&password=123456&useUnicode=true&characterEncoding=utf8&useSSL=false");
        //3、写sql语句
        String sql = "insert into userinfo values (?,?)";
        //4、获得statement对象
        PreparedStatement statement = connection.prepareStatement(sql);
        //5、执行sql语句
        statement.setInt(1, 99);
        statement.setString(2, "秦始皇");
        statement.executeUpdate();
        //6、关闭连接
        statement.close();
        connection.close();
    }


    public static void main1(String[] args) throws Exception {
        //1、加载jdbc驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2、创建数据库连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userTest?user=root&password=123456&useUnicode=true&characterEncoding=utf8&useSSL=false");
        //3、创建操作命令对象
        Statement statement = connection.createStatement();
        //4、执行sql语句
        String sql = "select id,name from userinfo";
        ResultSet resultSet = statement.executeQuery(sql);
        //5、处理结果集
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id + "    " + name);
        }
        //6、释放资源
        resultSet.close();
        connection.close();
    }
}
