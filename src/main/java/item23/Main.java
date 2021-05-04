package item23;

public class Main {
    public static void main(String[] args) {

        // 내부에 태그가 달린 클래스로 장황하고 , 오류나기 쉽고 비효율적이다.
        Figure figure = new Figure(1.2,2.3);

        //공통 메서드 및 추상화 메서드를 포함하는 추상클래스를 루트클래스로 확장하는 구체 클래스
        Circle circle = new Circle(2.3);
    }
}
