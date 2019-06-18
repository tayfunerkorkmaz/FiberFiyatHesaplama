/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.objectpool;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;

/**
 *
 * @author tayfunerkorkmaz
 */
public class ObjectPoolTest {
    
    public static final String CREATE_TEST_TABLE = "CREATE TABLE Musteriler (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, adisoyad VARCHAR(30) NOT NULL, firma VARCHAR(30) NOT NULL, tel VARCHAR(50), email VARCHAR(50))";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        JDBCConnectionPool pool = new JDBCConnectionPool();
        pool = new JDBCConnectionPool();
        // Bağlantıyı Al
        final Connection connection = pool.checkOut();
        System.out.println(connection);
        // Bağlantıyı Kullan
        Statement statement = (Statement) connection.createStatement();
        statement.execute(CREATE_TEST_TABLE);
        // Bağlantıyı havuza geri ver
        pool.checkIn(connection);
    }

}
