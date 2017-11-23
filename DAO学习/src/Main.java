import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentDAO dao=new StudentDAOimpl();
        List<Student> list=new ArrayList<Student>();
        Student s1=new Student(1,"abc",10);
        Student s2=new Student(3,"qwe",12);
        list.add(s1);
        list.add(s2);
        Iterator<Student> iter=list.iterator();
        while (iter.hasNext()){
            dao.addStudent(iter.next());
            //Student s=iter.next();
            //System.out.println(s.getAg);
        }
        System.out.println("add successful");
    }
}
