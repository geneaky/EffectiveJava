package item3;

public class Factory {
    private static final Factory INSTANCE = new Factory();
    private Factory(){}
    public static Factory getInstance(){return INSTANCE;}

    public void hello(){
        System.out.println("hello");
    }
}
