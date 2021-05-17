package item35;

public enum Ensemble1 {
    TTTT,SOLO,DUET,TRIO,QUARTET;

    public int numberOfMusicians() { return ordinal() + 1;}
    //위 방식 처럼 ordinal메서드를 사용하는 것은 좋지 않다 해당 코드를 사용하는 클라이언트에서 위 코드의 순서가 달라지면 index값이 달라져서 오류가 발생함
}
