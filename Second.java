package com.example.jdbc;
import java.sql.*;
import java.util.*;


public class Second {
	

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		int id;
		String name;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Percentage");
		per=sc.nextFloat();
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connection Sucessfully");
		Connection con=DriverManager.getConnection("");
		// TODO Auto-generated method stub

	}

}
