package com.tns.dayfifteen.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ResultSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//step1:Load or register driver
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is Loaded successfully");
			
			//step2:create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dypatil","root", "root");
			
			//step3:create a statement
			Statement stmt=con.createStatement();
			System.out.println("Statement created successfully");
			
			java.sql.ResultSet rs=stmt.executeQuery("select *from student");
			
			//step4:write a query
			//String q="create table student(stdid int,name varchar(20),subject varchar(20),duration double)";
			//boolean s=stmt.execute(rs);
			System.out.println("stdid\t name\t subject\t duration");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
