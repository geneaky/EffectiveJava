package item35;

public enum Ensemble2 {
    SOLO(1),DUET(2),TRIO(3),QUARTET(4); //인스턴스 필드에 저장하면 Ensemble1과 같은 오류를 막을 수 있음

    private final int numberOfMusicians;
    Ensemble2(int size) { this.numberOfMusicians = size;}
    public int getNumberOfMusicians() { return numberOfMusicians;}
}
