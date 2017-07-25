package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
 
    private final String DRIVER_MSSQL = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String DATABASE = "DB_LOJA";
    private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=" + DATABASE + ";";
    private final String USER = "sa";
    private final String PASSWORD = "senac";
    
    private Connection connection = null;
    
    public boolean open() {
        try {
            Class.forName(DRIVER_MSSQL);
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return true;
        } catch(ClassNotFoundException | SQLException error) {
            System.out.println("Erro: " + error);
        }
        return false;
    }
    
    public boolean close() {
        try {
            this.connection.close();
            return true;
        } catch (SQLException error) {
            System.out.println("Erro: " + error);
        }
        return false;
    }
    
    public Connection getConnetion() {
        return this.connection;
    }
    
    
}
