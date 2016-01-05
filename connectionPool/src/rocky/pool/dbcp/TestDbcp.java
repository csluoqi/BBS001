package rocky.pool.dbcp;

import java.sql.Connection;
import java.sql.SQLException;


import org.apache.commons.dbcp.BasicDataSource;


public class TestDbcp
{
    
   public static void main(String[] args) throws SQLException
{
       //获得数据源对象
       //dataSource(标准接口) basicDataSource(apache的实现)
       BasicDataSource ds = new BasicDataSource();
       ds.setUrl("jdbc:mysql://localhost:3306/hibernate");
       ds.setDriverClassName("com.mysql.jdbc.Driver");
       ds.setUsername("root");
       ds.setPassword("2011211961");
       
       ds.setMaxActive(3);//最大的活动数
       ds.setMaxIdle(2);//最大保存数
       ds.setMaxWait(5000);//最大等待时间
       Connection conn1 = ds.getConnection();
       System.out.println("conn ->"+conn1);
       Connection conn2 = ds.getConnection();
       System.out.println("conn ->"+conn2);
       Connection conn3 = ds.getConnection();
       System.out.println("conn ->"+conn3);
       
       conn1.close();
       conn2.close();
       conn3.close();
       System.out.println("----------------------");
       Connection conn4 = ds.getConnection();
       System.out.println("conn ->"+conn4);
       Connection conn5 = ds.getConnection();
       System.out.println("conn ->"+conn5);
       Connection conn6 = ds.getConnection();
       System.out.println("conn ->"+conn6);
       Connection conn7 = ds.getConnection();
       System.out.println("conn ->"+conn7);
       conn4.close();
       conn5.close();
       conn6.close();
       conn7.close();
       
}
   
}







