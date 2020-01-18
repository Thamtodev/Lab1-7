import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab2 {
    public static void main(String[]args){
        Connection connect = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/databig" + "?user=root&password=");
            s = connect.createStatement();
            if(connect != null){
                System.out.println("Database connected");

            }
            s = connect.createStatement();
            String sql = "INSERT INTO customers" +"(ID,Name,Email,Salary)"+
                    "VALUES('110','Banana','BananaIT@gmail.com','900000')";
            s.execute(sql);
            System.out.println("Record Inserted Successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //Close Database
        try {
            if (connect != null){
                connect.close();
            }
        }catch ( SQLException e){
            e.printStackTrace();
        }
    }
}
