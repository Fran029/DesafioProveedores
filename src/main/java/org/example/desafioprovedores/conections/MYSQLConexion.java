package org.example.desafioprovedores.conections;


import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
public class MYSQLConexion {
    private static MYSQLConexion instance;
    private  Connection connection;
    private  String jdbcURL = "jdbc:mysql://localhost:3306/proveedores";
    private  String jdbcUserName = "root";
    private  String jdbcPassword = "praxis";

    private MYSQLConexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
        } catch(ClassNotFoundException | SQLException e) {
            throw new SQLException(e);
        }
    }

    public static MYSQLConexion getInstance() throws SQLException {
        if(instance == null) {
            instance = new MYSQLConexion();
        } else if (instance.getConnection().isClosed()) {
            instance = new MYSQLConexion();
        }
        return instance;
    }
}