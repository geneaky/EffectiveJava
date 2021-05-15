package item34;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        int i = (Test1.ORANGE_PIN - Test1.APPLE_PIN) / Test1.ORANGE;
        boolean i1 = Test1.APPLE_PIN == Test1.ORANGE; //객체를 동등 비교했는데 컴파일 경고가 뜨지 않음 -> 타입 안전성을 보장하지 못함
        System.out.println(i);
        System.out.println(i1);

        Apple apple = Apple.FUJI;
        Apple apple1 = Apple.FUJI;
        System.out.println("(apple==apple1 = " + (apple==apple1));
        System.out.println(apple); // 열거타입은 출력하기에 적합한 문자열을 내어줌


        //열거타입을 활용한 연산 -> 해당 열거타입에서 특정 상수가 삭제되도 컴파일 타임에 오류를 잡을 수 있음
        double mass = 70 / Planet.EARTH.getSurfaceGravity();
        for(Planet p: Planet.values()){
            System.out.println("p + \" \" + p.surfaceWeight(mass) = " + p + " " + p.surfaceWeight(mass));
        }

        //열거타입 상수에 따른 메서드 동작 분기 가능
        for(Operation op: Operation.values()){
            System.out.println("op = " + op + " " + op.apply(2,4));
        }

        //필요한 원소가 컴파일 타임에 다 알 수 있는 상수 집합이라면 항상 열거 타입을 사용하는 것이 옳다
    }
}
