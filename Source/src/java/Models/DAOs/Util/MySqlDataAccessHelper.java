/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Models.DAOs.Util;

import java.sql.*;
import java.util.*;



/**
 *
 * @author tannguyen
 */
public class MySqlDataAccessHelper {
    protected static String connectionString;
     public static Connection getConnection() {
        Connection connect = null;
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            String connectionString="jdbc:mysql://localhost:3306/quanlybanhang";
            Properties pros=new Properties();
            pros.setProperty("characterEncoding", "utf8");
            pros.setProperty("user", "root");
            connect = DriverManager.getConnection(connectionString, pros);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connect;
    }
}
