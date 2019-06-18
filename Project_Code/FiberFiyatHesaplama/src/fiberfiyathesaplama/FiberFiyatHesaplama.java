/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiberfiyathesaplama;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.Scanner;
import tayfunerkorkmaz.designpatterns.abstractfactory.AbstractFactory;
import tayfunerkorkmaz.designpatterns.abstractfactory.FactoryProducer;
import tayfunerkorkmaz.designpatterns.abstractfactory.OM3Fiber;
import tayfunerkorkmaz.designpatterns.abstractfactory.SMFiber;
import tayfunerkorkmaz.designpatterns.factory.Kablo;
import tayfunerkorkmaz.designpatterns.factory.PCFactory;
import tayfunerkorkmaz.designpatterns.factory.PTFactory;
import tayfunerkorkmaz.designpatterns.factory.UrunFactory;
import tayfunerkorkmaz.designpatterns.objectpool.JDBCConnectionPool;
import static tayfunerkorkmaz.designpatterns.objectpool.ObjectPoolTest.CREATE_TEST_TABLE;

/**
 *
 * @author tayfunerkorkmaz
 */
public class FiberFiyatHesaplama {

    /**
     * @param args the command line arguments
     */
     public static final String CREATE_TEST_TABLE = "CREATE TABLE IF NOT EXISTS Musteriler (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, adisoyad VARCHAR(30) NOT NULL, firma VARCHAR(30) NOT NULL, tel VARCHAR(50), email VARCHAR(50))";

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
        
        MainPanel mn = new MainPanel();
        mn.setVisible(true);


    }

}
