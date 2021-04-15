package jm.task.core.jdbc.util;

import com.mysql.jdbc.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД


    public static Connection getConnection() throws SQLException {

        String hostName = "localhost";
        String dbName = "astrio";
        String userName = "root";
        String password = "Umulbion@2236";

        return getConnection(hostName, dbName, userName, password);
    }

    public static Connection getConnection(String hostName, String dbName, String userName, String password) throws SQLException {

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        return (Connection) DriverManager.getConnection(connectionURL, userName, password);
    }

}


