
package banking_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnect {
    public static Connection ConnectDb() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        // Load MySQL driver
        //Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to database
        connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/bank?useSSL=false&allowPublicKeyRetrieval=true",
            "root",
            "123456"
        );
        return connection;
    }
}

