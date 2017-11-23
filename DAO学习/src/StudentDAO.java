import java.util.List;

public interface StudentDAO {
    public abstract void addStudent(Student s);
    public abstract void deleteStudent(Student s);
    public abstract List<Student> getAllStudents();
}
