package com.database;

import java.sql.*;
import java.io.Serializable;
import com.mysql.jdbc.Driver;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class DBConnection implements Serializable {

    private final String db_url = "jdbc:mysql://localhost:3306/projelerim";
    private final String db_username = "root";
    private final String db_password = "AA12345aa!";

    private Connection connection = null;
    protected PreparedStatement ps = null;

    protected ResultSet rs = null;

    public Connection connect() throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(db_url, db_username, db_password);
        return connection;
    }

    public void disconnect() {
        try {
            connection.close();
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
