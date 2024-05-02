package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String URL_DATABASE = "jdbc:mysql://localhost:3306/mysqltest";
    private final static String LOGIN = "root";
    private final static String PASS = "root";
    private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static Connection getConnection() {
        try{
            Class.forName(DB_DRIVER);
            return DriverManager.getConnection(URL_DATABASE, LOGIN, PASS);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
