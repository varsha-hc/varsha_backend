package jdbcconnector;
import java.sql.PreparedStatement;

import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



import java.sql.Statement;public class Jdbc {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Scanner scanner = new Scanner(System.in);
			
		

			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";

            Connection connection =DriverManager.getConnection(url, user, pass);
//            String query = "slect * from employee";
//            Statement statement =connection.createStatement();
//            ResultSet resultset = statement.executeQuery(query);
            

            String query = "insert into student(name, percentage, address) values(?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			System.out.println("Please enter  the name:");
			preparedStatement.setString(1, scanner.next());

			System.out.println("Please enter the percentage:");
			preparedStatement.setDouble(2, scanner.nextDouble());

			System.out.println("Please enter the address:");
			preparedStatement.setString(3, scanner.next());

			int rows = preparedStatement.executeUpdate();
			if (rows != 0) {
				System.out.println("record inserted successfully !!");
			} else {
				System.out.println("Insertion failed");
			}
			scanner.close();
			connection.close();

//	Statement statement = connection.createStatement();
//	int excecuteUpdate = statement.executeUpdate(query);
//	int executeUpdate = statement.executeUpdate(query);
//	System.out.println(executeUpdate);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
