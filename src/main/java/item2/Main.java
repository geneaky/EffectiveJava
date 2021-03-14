package item2;

public class Main {
    public static void main(String[] args) {

        Item2 item2 = new Item2.Builder(240,8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        item2.getAll();
    }

}
