package test;

import com.sun.management.VMOption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    //jdbc驱动 和数据库url
    static final String JdbcDriver="com.mysql.cj.jdbc.Driver";
    static final String Url="jdbc:mysql://localhost:3306/day?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //数据库的用户名和密码
    static final String User="root";
    static final String Pass="123456";
    static {
        try {
            //打开链接
            Class.forName(JdbcDriver);
        }catch (Exception e){
            e.printStackTrace();

        }

    }
    public static Connection getConnection()throws Exception {
        return DriverManager.getConnection(Url,User,Pass);
    }
    public static Statement state()throws Exception{
        Conn.getConnection();
        //Connection conn=con.getConnection();
        System.out.println("实例化statement对象");
        Statement stmt=Conn.getConnection().createStatement();
        return stmt;

    }



}
