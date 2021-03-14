package item1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Item1.getIntegerItem1().item);
        System.out.println(Item1.getStringItem1().item);
        System.out.println(Item1.getChildItem1().item);
        System.out.println(Item1.getParameterItem1("test").item);
        System.out.println(Item1.getParameter2Item1(100).item);
    }
}
