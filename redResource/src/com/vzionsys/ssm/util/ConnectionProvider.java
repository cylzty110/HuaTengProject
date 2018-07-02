package com.vzionsys.ssm.util;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
  
public class ConnectionProvider {  
    private static String driverClassName ="com.mysql.jdbc.Driver";  
    private static String username="root";  
    private static String password="1234";  
    private static String url="jdbc:mysql://121.199.1.200/vzion";  
      
    static{  
        try {  
            Class.forName(driverClassName);  
        } catch (ClassNotFoundException e) {  
            throw new RuntimeException(e);  
        }  
    }  
      
    public static Connection getConnection(){  
        try {  
            return DriverManager.getConnection(url, username, password);  
        } catch (SQLException e) {  
            throw new RuntimeException(e);  
        }  
    }  
}  