package item13;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Cloneable{
    String name;
    int age;
    List<Student> studentList= new ArrayList<>();

    public Teacher(){}

    public Teacher(Teacher src){
        this.name = new String(src.name);
        this.age = src.age;
        this.studentList = new ArrayList<>();
        for(Student s: src.studentList){
            this.studentList.add(s);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Teacher teacher = (Teacher)super.clone();
        List<Student> copyList = new ArrayList<>();
        for(Student s : studentList){
            copyList.add(s);
        }
        teacher.studentList = copyList;
        return teacher;
    }
}
