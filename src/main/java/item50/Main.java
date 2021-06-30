package item50;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();//Date는 가변임 불변인 LocalDateTime을 사용하고 Date는 더 이상 사용해서는 안됨
        //하지만 예전에 작성된 코드들은 이미 많이 Date를 사용하고 있이 때문에 방어적 복사본을 통해 인스턴스 내부를 보호해야함
        Period p = new Period(start,end);
        System.out.println(p.end());
        end.setYear(78);
        p.end().setTime(78); // 방어적 복사가 아직 부족하다 더 추가해야한다.
        System.out.println(p.end());
    }
}
