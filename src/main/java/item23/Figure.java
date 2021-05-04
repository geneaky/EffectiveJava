package item23;

public class Figure {
    //태그 필드
    enum Shape {RECTANGLE, CIRCLE};

    final Shape shape;

    double length;
    double width;

    double radius;
    //생성자마다 사용하는 필드들이 정해져있으므로 사용하지 않은 것 까지 final로 선언 후 초기화 시키면 메모리 낭비
    Figure(double radius){
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    //태그 값에 따라 메서드 동작이 달라짐 -> 추상화를 시켜야됨(복잡한 구현 -> 추상화를 요구하는 상황인지 확인)
    double area(){
        switch(shape){
            case RECTANGLE:
                return length*width;
            case CIRCLE:
                    return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
