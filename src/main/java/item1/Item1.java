package item1;

public class Item1 {

    String item;

    public static Item1 getIntegerItem1(){
        Item1 item1 = new Item1();
        item1.item = "Integer";
        return item1;
    }

    public static Item1 getStringItem1(){
        Item1 item1 = new Item1();
        item1.item = "String";
        return item1;
    }

    public static Item1 getChildItem1(){
        ChildItem item1 = new ChildItem();
        item1.item = "하위 클래스의 인스턴스도 반환 가능 :"+item1.name;
        return item1;
    }

    public static Item1 getParameterItem1(String item){
        Item1 item1 = new Item1();
        item1.item = item;
        return item1;
    }

    public static Item1 getParameter2Item1(Integer test){
        ChildItem item1 = new ChildItem();
        item1.number = test;
        item1.item = "자식 클래스의 시그니처에 초기화: "+item1.number;
        return item1;
    }
}
