```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
注册mysql驱动
创建连接对象
创建操作命令对象
执行sql
处理结果集
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //1、创建数据库连接
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=123456&useUnicode=true&characterEncoding=utf8&useSSL=false");
        //2、创建操作命令对象
        Statement statement = connection.createStatement();
        //3、执行sql
        ResultSet resultSet = statement.executeQuery("select name,sex,depart,salagry from emp");
        //4、处理结果集（List<Map<String,字段类型>>）
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String sex = resultSet.getString("sex");
            String depart = resultSet.getString("depart");
            Integer salagry = resultSet.getInt("salagry");
            System.out.printf("姓名：%s   性别：%s   部门：%s   工资：%d  ", name, sex, depart, salagry);
        }


    }
}

```

