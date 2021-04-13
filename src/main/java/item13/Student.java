package item13;

public class Student implements Cloneable{
    String name;
    int age;

    public Student(){}

    public Student (Student src){
        this.name = new String(src.name);
        this.age = src.age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
