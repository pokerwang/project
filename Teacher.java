package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Teacher {

    Conn con=new Conn();
    public Statement state()throws Exception{
        Connection conn=con.getConnection();
        System.out.println("实例化statement对象");
        Statement stmt=conn.createStatement();
        return stmt;

    }
    public  void add(int id,String name,int age,String gender,String postion)throws Exception{

        //执行修改

        String sql="insert into teacher values('"+id+"','"+name+"','"+age+"','"+gender+"','"+postion+"')";
        int rs=state().executeUpdate(sql);
        state().close();
    }
    public  void delete(String name)throws Exception{

        //执行修改
        String sql="delete from teacher where teacher.name ='"+name+"'";
        int rs=state().executeUpdate(sql);
        state().close();
    }
    public  void update(String name,int id)throws Exception{

        //执行修改
        String sql="update teacher set teacher.name='"+name+"' where id='"+id+"'";
        int rs=state().executeUpdate(sql);
        state().close();
    }
    public  void query()throws Exception{

        //执行修改
        String sql="select * from  teacher";
        int rs=state().executeUpdate(sql);
        state().close();
    }

}
