package jdbcconnector;

import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Employee {
	
		public static void main(String[] args) throws ClassNotFoundException {
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Scanner scanner = new Scanner(System.in);

			String url="jdbc:mysql://localhost:3306/jdbc";
			String user="root";
			String pass="Sa123";
			
		Connection connection = DriverManager.getConnection(url,user,pass);
		
		String query = "insert into student(name, percentage, address) values(?, ?, ?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, "john");
		preparedStatement.setDouble(2, 12.21);
		preparedStatement.setString(3, "kochi");
		preparedStatement.setNString(1, "kushi");
		preparedStatement.setDouble(2, 55.21);
		preparedStatement.setString(3, "mysore");
		
		preparedStatement.executeUpdate();
		
//		String query = "SELECT * FROM jdbc.student";
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery(query);
//		
//		while(resultSet.next()) {
//			
//			System.out.println(resultSet.getInt("id") + "====>"
//			+ resultSet.getString("name") + "====>" +resultSet.getDouble("percentage") 
//			+ "====>" +resultSet.getString("address"));
//		}
		
//		System.out.println("Press 1 for insert employee record");
//		System.out.println("Press 2 to select the employee id");
//		System.out.println("Press 3 select all employee details");
//		System.out.println("Press 4 update employee details");
//      System.out.println("Press 5 delete employee details");
		
			
//		String query = "insert into student(name, percentage, address) values(?,?,?)"; 
//		PreparedStatement preparedStatement = connection.prepareStatement(query);
//		
//		System.out.println("Please enter  the name:");
//		preparedStatement.setString(1, scanner.next());
//		
//		System.out.println("Please enter the percentage:");
//		preparedStatement.setDouble(2, scanner.nextDouble());
//		
//		System.out.println("Please enter the address:");
//		preparedStatement.setString(3, scanner.next());
//
//	    int rows = preparedStatement.executeUpdate();
//	    if(rows!=0) {
//	     System.out.println("record inserted successfully !!");
//	    }else {
//	    	System.out.println("Insertion failed");
//	    }
		scanner.close();
		connection.close();

		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	  }
	}
