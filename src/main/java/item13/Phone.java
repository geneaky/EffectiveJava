package item13;

public class Phone implements Cloneable {
    int age;
    String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
