package JavaPreparedStatementWithMySQLPHPMyAdmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaPreparedStatementInsertMySQL {
    public static void main(String[]agrs){
        Connection connect = null;
        PreparedStatement pre = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = (com.mysql.jdbc.Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/databig"
                            + "?user=root&password=");
            String sql = "INSERT INTO customers " +
                    "(ID,Name,Email,Salary)"+
                    "VALUES(?,?,?,?)";
            pre = connect.prepareStatement(sql);
            pre.setString(1,"151");
            pre.setString(2,"tttt");
            pre.setString(3,"tttt@mail.com");
            pre.setString(4,"80001");
            pre.executeUpdate();
            System.out.println("Record Inserted Successfully");



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
