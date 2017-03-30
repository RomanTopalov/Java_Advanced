package lessom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
public class Main {

	static PreparedStatement preparedStatement;

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "root");
		
		System.out.println("yes");
		
		preparedStatement = (PreparedStatement) connection.prepareStatement("create table if not exists user"
		+"(id int primary key auto_increment ,username varchar(50), "
		+"email varchar(100),password varchar(100))");
		
		preparedStatement.execute();
		
//		preparedStatement = (PreparedStatement) connection.prepareStatement("insert into user"
//				+"(username,email,password) values"
//				+"('koko','koko','koko'),"
//				+"('some','some','some'),"
//				+"('like','like','like'),"
//				+"('run','run','run')");
//				preparedStatement.execute();
//				
//				preparedStatement = (PreparedStatement) connection.prepareStatement("update user set email='email'");
//				preparedStatement.execute();
//				
//		
//				preparedStatement = (PreparedStatement) connection.prepareStatement("delete from user where "
//				+"username like 'koko'");
//		preparedStatement.execute();
		
		
//		ResultSet resultSet = preparedStatement.executeQuery("select username ,email , password from user order by username asc ");/*desk*/
//		while (resultSet.next()){
//			System.out.println(resultSet.getString(1)+" "+resultSet.getString("email")+" "+resultSet.getString(3));
//		}
//		
		
		ResultSet resultSet = preparedStatement.executeQuery("select username from user where username like'r%'");/*desk*/
		while (resultSet.next()){
			System.out.println(resultSet.getString(1));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		System.out.println("yes");
	}
}
