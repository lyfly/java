import java.sql.*;

public class DBHelp {

    public static Connection getConn() {
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","123123");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeALL(ResultSet rs, PreparedStatement ps,Connection conn){
        try {
            ps.close();
            conn.close();
            if(rs!=null){
                rs.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
