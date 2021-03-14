package item3;

public class Main {
    public static void main(String[] args) {
        Item3 item3 = Item3.INSTANCE;
        item3.hello();

        Factory.getInstance().hello();

        Single single = Single.INSTANCE;
        single.hello();
    }
}
