package test;
import  java.sql.*;
public class Student {

    Conn con=new Conn();
    public Statement state()throws Exception{
        Connection conn=con.getConnection();
        System.out.println("实例化statement对象");
        Statement stmt=conn.createStatement();
        return stmt;

    }

    public  void add(int id,String name,int age,String gender,String clazz)throws Exception{

          //执行修改
            String sql="insert into student values ('"+id+"','"+name+"','"+age+"','"+gender+"','"+clazz+"')";
            int rs=state().executeUpdate(sql);
            state().close();
        }
    public  void delete(String name)throws Exception{

        //执行修改
        String sql="delete from student where student.name ='"+name+"'";
        int rs=state().executeUpdate(sql);
        state().close();
    }
    public  void update(int id,String name)throws Exception{

        //执行修改
        String sql="update student set student.name='"+name+"' where id='"+id+"'";
        int rs=state().executeUpdate(sql);
        state().close();
    }
    public  void query()throws Exception{

        //执行修改
        String sql="select * from  student";
        int rs=state().executeUpdate(sql);
        state().close();
    }




    }










