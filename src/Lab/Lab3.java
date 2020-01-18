import java.sql.*;
import java.util.Scanner;

public class Lab3 {
    public  static  void main(String[]args){
        Connection connect = null;
        Statement s = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/databig" + "?user=root&password=");
            s = connect.createStatement();

            String sql = "UPDATE customers " + "SET Salary ='500000'"+
                    " WHERE ID = '101' ";

            System.out.println("Record Update Successfully");
            s.execute(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
