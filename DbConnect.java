/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tosyngy
 */
public class DbConnect {

    public Connection con;
    public ResultSet rs;
    public PreparedStatement ps;
    public Statement st;
    JOptionPane jp;

    public DbConnect() {
        jp = new JOptionPane();
        try {

            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "flight";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            try {
                Class.forName(driver).newInstance();
                con = DriverManager.getConnection(url + dbName, userName, password);
                st = con.createStatement();
                //System.out.println("Connected to the database");
            } catch (Exception e) {
                e.printStackTrace();
                int chk = jp.showConfirmDialog(null, "Connection Off: Click Yes to Reconnect\nIf you are rounning on localhost\nMake sure server has been started", "RE-CONNECT", jp.YES_NO_CANCEL_OPTION);
                if (chk == 0) {
                    new DbConnect();
                } else {
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            //System.out.println("connector Error  " + e);
        }

    }

}
