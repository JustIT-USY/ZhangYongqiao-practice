package jdbc;

import java.sql.*;

public class _0JdbcTest {
	public static void main(String[] args) {
		Statement st=null;
		ResultSet rs=null;
		Connection conn=null;
		//jdbc:mysql://localhost:3306/sample_db
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());//注册驱动
			//建立链接 参数1：协议+访问的数据库 2：用户名 3.密码
			 conn=DriverManager.getConnection("jdbc:mysql://localhost/new_schema","root",""); //建立连接
			//使用数据库一定会用到Statement
			 st= conn.createStatement();
			//查询结果
			String sql = "select * from student";
			 rs= st.executeQuery(sql);
			while(rs.next()) {
			int id=rs.getInt("id");
			int age = rs.getInt("age");
			String name = rs.getString("name");
			
			System.out.println("id:"+id+"  age:"+age+"  name:"+name);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(st!=null) {
					st.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(st!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
