package com.example.pharmacyapp.Controllers;

import java.sql.*;
public class database {

    public static Connection connectDB(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/(The Database name)", "The database Username", "The database Password");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
