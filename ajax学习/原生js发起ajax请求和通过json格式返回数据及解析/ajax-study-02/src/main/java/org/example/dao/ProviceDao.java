package org.example.dao;

import org.example.entity.Provice;

import java.sql.*;

public class ProviceDao {
    //根据id获取完整的provice对象
    public Provice querryProviceNameById(Integer proviceId) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajax?user=root&password=123456&useUnicode=true&characterEncoding=utf8&useSSL=false");
        String sql = "select id, name,jiancheng,shenghui from province where id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, String.valueOf(proviceId));
        ResultSet resultSet = statement.executeQuery();
        String name = null;
        String jiancheng=null;
        String shenghui=null;
        Provice provice=null;

        if (resultSet.next()) {
            provice=new Provice();
            name = resultSet.getString("name");
            jiancheng=resultSet.getString("jiancheng");
            shenghui=resultSet.getString("shenghui");
            provice.setId(proviceId);
            provice.setName(name);
            provice.setJiancheng(jiancheng);
            provice.setShenghui(shenghui);
        }
        return provice;

    }
}
