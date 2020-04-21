package sample;
import java.sql.*;
public class ConnectToDB {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "";

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            String sql = "select * from mydb.contacts";
            Statement myStmt = myConn.createStatement();
            ResultSet rs = myStmt.executeQuery(sql);
            while(rs.next()) {
                System.out.println("first: " + rs.getInt(1));
                System.out.println("second: " + rs.getString(2));
                System.out.println("second: " + rs.getString(3));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}



