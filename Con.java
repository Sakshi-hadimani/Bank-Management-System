
package bank.management.system;
import java.sql.*;

public class Con {
    public Statement statement;


    public Con(){
        Connection connection;
        //Statement statement;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","root@2003");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
