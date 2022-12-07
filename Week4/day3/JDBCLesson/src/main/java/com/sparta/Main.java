package com.sparta;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            props.load(new FileReader("./dbconnect.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (            //Create Connection
                 Connection conn = DriverManager.getConnection(
                         props.getProperty("mysql.url"),
                         props.getProperty("mysql.username"), props.getProperty("mysql.password")
                );
                 //Create statement to execute sql query
                 Statement statement = conn.createStatement();
                 //Execute query which is returned as ResultSet
                 ResultSet rs = statement.executeQuery(
                         "SELECT * FROM actor"
                 );
             ){

            //Cursor is initially positioned before first row of data
            while (rs.next()) {
                //Should return the first record with first name and last name
                System.out.println(rs.getString(2) + " " +
                        rs.getString("last_name"));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}