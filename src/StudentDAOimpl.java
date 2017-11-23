import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDAOimpl implements StudentDAO {
    Connection db=null;
    ResultSet rs=null;
    PreparedStatement pstm=null;
    @Override
    public void addStudent(Student s){
      String sql="insert into students values(?,?,?)";
      db=DBHelp.getConn();
        try {
            pstm=db.prepareStatement(sql);
            pstm.setInt(1,s.getId());
            pstm.setString(2,s.getName());
            pstm.setInt(3,s.getAge());
            pstm.executeUpdate();
            DBHelp.closeALL(rs,pstm,db);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(Student s) {

    }

    @Override
    public List<Student> getAllStudents() {
        String sql="select * from students";
        db=DBHelp.getConn();
        try {
            pstm=db.prepareStatement(sql);
            rs=pstm.executeQuery();
            int id=rs.getInt("id");
            String
        } catch (SQLException e) {
            e.printStackTrace(); //
        }
        return null;
    }
}
