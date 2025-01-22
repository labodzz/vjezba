import java.util.ArrayList;
import java.util.List;

public class StudentModel{
    List<Student> students=new ArrayList<Student>();

    void addStudent(Student s){
        students.add(s);
    }
    public List<Student> getStudents(){
        return students;
    }
    Student getStudentById(int id){
        for(Student s:students){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }
}

