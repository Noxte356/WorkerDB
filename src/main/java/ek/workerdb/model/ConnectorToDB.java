package ek.workerdb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorToDB {
    private String urlJdbc = "jdbc:postgresql://localhost:5432/workerDB";
    private String sqlUserName = "postgres";
    private String sqlPassword = "";

    private Connection connection;


    public ConnectorToDB() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection(urlJdbc, sqlUserName, sqlPassword);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
