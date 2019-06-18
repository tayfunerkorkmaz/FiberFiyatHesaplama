/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.objectpool;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tayfunerkorkmaz
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {

    private DatabaseConfigurationSingletonClass cfg;
    
    public JDBCConnectionPool() {
        super();
        cfg = DatabaseConfigurationSingletonClass.getInstance();
        try {
            Class.forName(cfg.getDriver()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Connection create() {
        try {
            return (Connection) (DriverManager.getConnection(cfg.getDsn(), cfg.getUsr(), cfg.getPwd()));
        } catch (SQLException e) {
            e.printStackTrace();
            return (null);
        }
    }

    @Override
    public void expire(Connection o) {
        try {
            ((Connection) o).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean validate(Connection o) {
        try {
            return (!((Connection) o).isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    
}
