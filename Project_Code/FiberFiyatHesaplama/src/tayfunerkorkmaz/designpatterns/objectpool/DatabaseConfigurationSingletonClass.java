package tayfunerkorkmaz.designpatterns.objectpool;

import tayfunerkorkmaz.designpatterns.singleton.*;

/**
 *
 * @author tayfunerkorkmaz
 */
public class DatabaseConfigurationSingletonClass {

    private static DatabaseConfigurationSingletonClass dbconfig = null;
    private static Object lock_obj = new Object();

    String driver = "com.mysql.jdbc.Driver";
    private String dsn = "jdbc:mysql://localhost:3306/fiberfiyathesaplama?createDatabaseIfNotExist=true";
    private String usr = "test";
    private String pwd = "test"; 
    
    private DatabaseConfigurationSingletonClass() {
        System.out.println("DBConfig Singleton Pattern Çalıştı!");
    }

    public static DatabaseConfigurationSingletonClass getInstance() {
        
        synchronized(lock_obj){
            if ( dbconfig == null) {

                 dbconfig= new DatabaseConfigurationSingletonClass();
            }
        }
        return  dbconfig;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDsn() {
        return dsn;
    }

    public void setDsn(String dsn) {
        this.dsn = dsn;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
