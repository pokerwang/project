package test;
import  java.sql.*;
public class Student {
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
    public  void add()throws Exception{
            Connection conn=Teacher.getConnection();
            System.out.println("实例化statement对象");
            Statement  stmt=conn.createStatement();
          //执行修改
            String sql="insert into student values('10086','小明','18','男','一班')";
            int rs=stmt.executeUpdate(sql);
            conn.close();
        }
    public  void delete()throws Exception{
        Connection conn=Student.getConnection();
        System.out.println("实例化statement对象");
        Statement  stmt=conn.createStatement();
        //执行修改
        String sql="delete from student where student.name ='小明'";
        int rs=stmt.executeUpdate(sql);
        conn.close();
    }
    public  void update()throws Exception{
        Connection conn=Student.getConnection();
        System.out.println("实例化statement对象");
        Statement  stmt=conn.createStatement();
        //执行修改
        String sql="update student set student.name='小静' where id='10086'";
        int rs=stmt.executeUpdate(sql);
        conn.close();
    }
    public  void query()throws Exception{
        Connection conn=Student.getConnection();
        System.out.println("实例化statement对象");
        Statement  stmt=conn.createStatement();
        //执行修改
        String sql="select * from  student";
        int rs=stmt.executeUpdate(sql);
        conn.close();
    }




    }










