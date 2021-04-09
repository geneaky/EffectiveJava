package item10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //대칭성 위배
        Point p = new Point(1,2);
        ColorPoint cp = new ColorPoint(1,2,Color.RED);

        System.out.println("p.equals(cp)" + p.equals(cp));
        System.out.println("cp.equals(p) = " + cp.equals(p));

        //대칭성은 위배되지 않지만 추이성이 위배 x=y, y=z, x!=z이기 때문
        ColorPoint p1 = new ColorPoint(1,2,Color.RED);
        Point p2 = new Point(1,2);
        ColorPoint p3 = new ColorPoint(1,2,Color.BLUE);

        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p2.equals(p3) = " + p2.equals(p3));
        System.out.println("p1.equals(p3) = " + p1.equals(p3));

        //값 객체 equals 재정의 동치성 비교
        Integer i = 10;
        Integer j = 10;
        System.out.println("i==j = " + (i==j));
        System.out.println("i.equals(j) = " + i.equals(j));

        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        CaseInsensitiveString tis = new CaseInsensitiveString("polish");
        String s = "polish";
        System.out.println("cis.equals(s) = " + cis.equals(s));
        System.out.println("s.equals(cis) = " + s.equals(cis));
        System.out.println("cis.equals(tis) = " + cis.equals(tis));
        // 자바에서 객체 형변환은 상속관계에서만 가능하기 때문에 밑의 타입 캐스팅도 당연히 불가능
        // System.out.println("cis.equals((CaseInsensitiveString)s) = " + cis.equals((CaseInsensitiveString)s));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        System.out.println("list.contains(s) = " + list.contains(s));

    }
}
