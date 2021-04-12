package item13;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //cloneable 구현 후 복제 객체가 원본 객체와 같지 않음
        PhoneNumber p1 = new PhoneNumber("1234");
        System.out.println("p1.clone()!=p1 = " + (p1.clone()!=p1));

        Stack stack = new Stack();
        System.out.println("stack.clone()!=stack = " + (stack.clone()!=stack));


        Integer[] test = {1,2,3,4};
        HashTable ht = new HashTable(test);
        HashTable tt = (HashTable) ht.clone();
        //깊은 복사가 이루어 지지 않아 내부 참조 주소가 동일하게 나옴
        System.out.println("ht.clone(). == ht.getBuckets() = " + (tt.getBuckets() == ht.getBuckets()));


    }
}
