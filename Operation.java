package day;

import  java.sql.*;

public class Operation {
    Student student=new Student();
    Teacher teacher=new Teacher();
    public  int adds(Student s)throws Exception{

        //执行插入
        String sql="insert into student values ('"+s.id+"','"+s.name+"','"+s.age+"','"+s.gender+"','"+s.clazz+"')";
        int rs=Conn.state().executeUpdate(sql);
        Conn.getConnection().close();
        return rs;
    }
    public  int deletes(Student s)throws Exception{

        //执行删除
        String sql="delete from student where student.name ='"+s.name+"'";
        int rs=Conn.state().executeUpdate(sql);
        Conn.getConnection().close();
        return rs;
    }
    public  int updates(Student s)throws Exception{

        //执行修改
        String sql="update student set student.name='"+s.name+"' where id='"+s.id+"'";
        int rs=Conn.state().executeUpdate(sql);
        Conn.getConnection().close();
        return  rs;
    }
    public Student querys()throws Exception{
        //执行查询
        String sql="select * from  student";
        ResultSet rs=Conn.state().executeQuery(sql);
        while (rs.next()){
            student.id=rs.getInt("id");
            student.age=rs.getInt("age");
            student.gender=rs.getString("gender");
            student.clazz=rs.getString("clazz");
            student.name=rs.getString("name");

        }

        Conn.getConnection().close();
        return student;
    }
    public  int addt(Teacher t)throws Exception{

        //执行插入

        String sql="insert into teacher values('"+t.id+"','"+t.name+"','"+t.age+"','"+t.gender+"','"+t.postion+"')";
        int rs=Conn.state().executeUpdate(sql);
        Conn.getConnection().close();
        return rs;
    }
    public  int deletet(Teacher t)throws Exception{

        //执行删除
        String sql="delete from teacher where teacher.name ='"+t.name+"'";
        int rs=Conn.state().executeUpdate(sql);
        Conn.getConnection().close();
        return rs;
    }
    public  int updatet(Teacher t)throws Exception{

        //执行修改
        String sql="update teacher set teacher.name='"+t.name+"' where id='"+t.id+"'";
        int rs=Conn.state().executeUpdate(sql);
        Conn.getConnection().close();
        return rs;
    }
    public  Teacher queryt()throws Exception{

        //执行查询
        String sql="select * from  teacher";
        ResultSet rs=Conn.state().executeQuery(sql);
        while (rs.next()){
            teacher.id=rs.getInt("id");
            teacher.age=rs.getInt("age");
            teacher.gender=rs.getString("gender");
            teacher.postion=rs.getString("postion");
            teacher.name=rs.getString("name");

        }
        Conn.getConnection().close();
        return teacher;
    }

}







