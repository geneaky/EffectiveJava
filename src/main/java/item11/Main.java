package item11;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Phone,String> hm1 = new HashMap();
        Phone p1 = new Phone("ju");
        Phone p2 = new Phone("ju");
        hm1.put(p1,"changrune");
        System.out.println("hm1.get(p1) = " + hm1.get(p1));
        System.out.println("hm1.get(p2) = " + hm1.get(p2));
        //객체 논리 값이 같지만 물리값은 동치가 아님 실질적 동치여야함
        
        Phone2 p3 = new Phone2("ju");
        Phone2 p4 = new Phone2("ju");
        HashMap<Phone2,String> hm2 = new HashMap<>();
        hm2.put(p3,"kang");
        System.out.println("hm2.get(p3) = " + hm2.get(p3));
        System.out.println("hm2.get(p4) = " + hm2.get(p4));
        // 단점: 해쉬 버킷에 다 때려 박음 결국 링크드리스트의 길이 만큼 시간복잡도가 생김

        //싱글톤의 경우 해쉬가 한 종류 밖에 없는데 해쉬 계산 비용이 큰 상황에서 캐싱하지 않으면 메모리 낭비가됨
        //객체가 키로 사용되는 경우라면 hash를 재정의
        //hash 연산시 필드 개수만큼 연산수가 증가되는데 hash 재정의시 성능올린답시고 핵심 필드를 생략하면 안된다.
        //hash 품질이 나빠짐은 -> 해쉬 충돌 가능성 증가 -> 컬렉션 객체 성능 저하 -> 시스템 성능 저하

    }
}
