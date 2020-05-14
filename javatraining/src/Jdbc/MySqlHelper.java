package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MySqlHelper {

	public static void main(String[] args) throws Exception {
		//JDBC connections


		// Register Driver
		Scanner scan = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Create connection
		String url ="jdbc:mysql://localhost:3306/student";
		String dbuser ="root";
		String dbpass ="Arun9944541345";
		Connection connection = DriverManager.getConnection(url,dbuser,dbpass);

		//Create Statement
		Statement statement = connection.createStatement();

		//Execute query
		int choice = 0;
		do {
			System.out.println("select ur choice");
			System.out.println("1.Insert");
			System.out.println("2.view students");
			System.out.println("3.Exit");
			choice = scan.nextInt();

			if(choice ==1) {
				System.out.println("enter the name");
				String name = scan.next();
				System.out.println("enter age");
				int age = scan.nextInt();
				System.out.println("enter place");
				String place = scan.next();



				statement.executeUpdate("insert into ragavan values(' "  + name +" ',"+age+ "  ,' "+place+" ')");
			}
			if (choice ==2) {


				ResultSet resultSet = statement.executeQuery("select * from ragavan");


				while(resultSet.next()) {
					System.out.println(resultSet.getString("name"));
					System.out.println(resultSet.getString("age"));
					System.out.println(resultSet.getString("place"));
				}
			}
		}while (choice != 3);
		//close connection
		connection.close();

	}
}





