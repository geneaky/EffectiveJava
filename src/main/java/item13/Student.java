package item13;

public class Student implements Cloneable{
    String name;
    int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
