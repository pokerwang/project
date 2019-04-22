package day;
import  java.sql.*;
public class Student {
    private  int id;
    private  String name;
    private  int age;
    private String gender;
    private String clazz;


    public  int add(Student s)throws Exception{

        //执行插入
        String sql="insert into student values ('"+s.id+"','"+s.name+"','"+s.age+"','"+s.gender+"','"+s.clazz+"')";
        int rs=Conn.state().executeUpdate(sql);
        Conn.state().close();
        return rs;
    }
    public  int delete(Student s)throws Exception{

        //执行删除
        String sql="delete from student where student.name ='"+s.name+"'";
        int rs=Conn.state().executeUpdate(sql);
        Conn.state().close();
        return rs;
    }
    public  int update(Student s)throws Exception{

        //执行修改
        String sql="update student set student.name='"+s.name+"' where id='"+s.id+"'";
        int rs=Conn.state().executeUpdate(sql);
        Conn.state().close();
        return  rs;
    }
    public Student query()throws Exception{

        //执行查询
        String sql="select * from  student";
        ResultSet rs=Conn.state().executeQuery(sql);
        Student student =new Student();
        while (rs.next()){
            student.id=rs.getInt("id");
            student.age=rs.getInt("age");
            student.gender=rs.getString("gender");
            student.clazz=rs.getString("clazz");
            student.name=rs.getString("name");

        }

        Conn.state().close();
        return student;
    }




}










