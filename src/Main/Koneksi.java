/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Farras
 */
public class Koneksi {
     private static Connection koneksi;
     public static Connection getKoneksi(){
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/login";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connected Successfully");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println("Error!");
            }
        }
        return koneksi;
     }
}
