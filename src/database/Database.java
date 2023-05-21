/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Database {
    private static Connection connection;
    public static Connection koneksiKeDatabase(){
        try{
            if(connection == null){
                String url = "jdbc:mysql://localhost:3306/shoes_store";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = DriverManager.getConnection(url, username, password);
            }
            return connection;
        }catch(SQLException error){
            System.out.println("Terjadi error: " + error);
            return connection;
        }
    }
}
