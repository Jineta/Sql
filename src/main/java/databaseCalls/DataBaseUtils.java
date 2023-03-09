package databaseCalls;

import java.sql.*;
import lombok.SneakyThrows;


import java.sql.*;

public class DataBaseUtils{
private static Connection connection = null;
@SneakyThrows
    public static ResultSet executeQueryActions(String query) {
        ResultSet results;
        Statement statement = getConnection().prepareStatement(query);
        results = statement.executeQuery(query);
        return results;
    }
@SneakyThrows
    public static Connection getConnection() {
        if (connection == null || connection.isClosed()) openSQLConnection();
        return connection;
    }

    @SneakyThrows
    public static void closeSQLConnection() {
        try {
            if (connection != null) {connection.close();}
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
@SneakyThrows
    private static void openSQLConnection() {
        //Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/PETS","root","Developer1!");
    }
}
