package item13;

import java.util.List;

public class Teacher implements Cloneable{
    String name;
    int age;
    List<Student> studentList;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
