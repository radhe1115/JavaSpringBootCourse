package com.taskmanager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    /*
    import packages
    load driver
    register driver
    create connection
    create statement
    execute statement
    process results
    close connection
     */
        String url = "jdbc:mysql:localhost:3307:task_manager";
        String user = "root";
        String pass = "Radhe@11";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,pass);
        System.out.println("Connection Established");
    }
}