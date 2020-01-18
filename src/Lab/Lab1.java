import java.sql.*;

public class Lab1 {
    public  static  void main(String[]args) throws SQLException {
        Connection connect = null;
        Statement s = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connect =  DriverManager.getConnection("jdbc:mysql://localhost:3306/databig"+"?user=root&password=");
            s = connect.createStatement();
            if(connect != null){
                System.out.println("Database connected");
                String sql = "SELECT * FROM customers ";
                ResultSet rec = s.executeQuery(sql);
                while ((rec!= null)&& (rec.next())){
                    System.out.print("ID: "+(rec.getString("ID")));
                    System.out.print("||");
                    System.out.print("Name:"+(rec.getString("Name")));
                    System.out.print("||");
                    System.out.print("Email: "+(rec.getString("Email")));
                    System.out.print("||");
                    System.out.print("Salary"+(rec.getString("Salary")));
                    System.out.println(" ");
                }
            }else{
                System.out.println("Database connect Failed...");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//Close Database
        try {
            if (connect != null){
                connect.close();
            }
        }catch ( SQLException e){
            e.printStackTrace();
        }
    }
}
