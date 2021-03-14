package item3;

public class Item3 {
    public static final Item3 INSTANCE = new Item3();
    private Item3(){}

    public void hello(){
        System.out.println("hello");
    }
}
