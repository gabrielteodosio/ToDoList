package br.com.dacoder.database;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection;

    public static Connection getInstance() {
        return connection;
    }

    public static void closeConnection() {
        try {
            if (!connection.isClosed()) {
                connection.close();
            } else {
                System.out.println("Connection is already closed");
            }
        } catch (SQLException e) {
            System.err.println("Error closing database connection, please verify if there is already an instance of a connection");
        }
    }
}
