package item4;

public class Main {
    private Main(){
        throw new AssertionError();
    }
    static void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Main.hello();
    }
}
