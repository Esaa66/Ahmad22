package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    public Connection databselink;

    public Connection getconnection(){
        String dbname = "bibliotek";
        String dbuser = "root";
        String dbpassword = "0000";
        String url = "jdbc:mysql://localhost:3306/" +dbname;



        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                databselink = DriverManager.getConnection(url, dbuser, dbpassword);

            }catch(Exception e){
                   e.printStackTrace();
                   e.getCause();
        }

        return databselink;
    }
}
