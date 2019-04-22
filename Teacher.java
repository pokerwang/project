package day;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Teacher {
    private  int id;
    private  String name;
    private  int age;
    private String gender;
    private String postion;


    public  int add(Teacher t)throws Exception{

        //执行插入

        String sql="insert into teacher values('"+t.id+"','"+t.name+"','"+t.age+"','"+t.gender+"','"+t.postion+"')";
        int rs=Conn.state().executeUpdate(sql);
        Conn.state().close();
        return rs;
    }
    public  int delete(Teacher t)throws Exception{

        //执行删除
        String sql="delete from teacher where teacher.name ='"+t.name+"'";
        int rs=Conn.state().executeUpdate(sql);
        Conn.state().close();
        return rs;
    }
    public  int update(Teacher t)throws Exception{

        //执行修改
        String sql="update teacher set teacher.name='"+t.name+"' where id='"+t.id+"'";
        int rs=Conn.state().executeUpdate(sql);
        Conn.state().close();
        return rs;
    }
    public  Teacher query()throws Exception{

        //执行查询
        String sql="select * from  teacher";
        ResultSet rs=Conn.state().executeQuery(sql);
        Teacher teacher =new Teacher();
        while (rs.next()){
            teacher.id=rs.getInt("id");
            teacher.age=rs.getInt("age");
            teacher.gender=rs.getString("gender");
            teacher.postion=rs.getString("postion");
            teacher.name=rs.getString("name");

        }
        Conn.state().close();
        return teacher;
    }

}