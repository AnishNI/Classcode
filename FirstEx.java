package com.example.jdbc;

import java.sql.*;
import java.util.Scanner;

public class FirstEx {

    public static void main(String[] args) {
        int id;
        String name;
        float per;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rollno:");
        id = sc.nextInt();
        System.out.println("Name:");
        name = sc.next();
        System.out.println("Per");
        per = sc.nextFloat();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver reg successfully");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3325/dummy", "root", "");
            System.out.println("Connection successfully");

            Statement st = con.createStatement();
            String sql = "INSERT INTO student VALUES (" + id + ", '" + name + "', " + per + ")";
            int i = st.executeUpdate(sql);

            if (i > 0) {
                System.out.println("Save successfully");
            } else {
                System.out.println("Save unsuccessfully");
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}