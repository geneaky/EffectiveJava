package item49;

import java.math.BigInteger;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String s = "hi";
        Object test = Objects.requireNonNull(s,"hi");

        long a[] = new long[]{1,2,3,4};

        sort(a,-1,-1);
    }

    private static void sort(long a[],int offset,int length){
        //내가 만든 private 함수가 유효한 값만 넘겨받고 동작하도록 assert 단언문을 사용하여 유효성을 검증할 수 있다.
        //assert 동작을 바라면 실행시 -ea 옵션을 추가해 주어야함
        assert offset >= 0 && offset <= a.length;
        assert a != null;
        assert length >= 0 && length <= a.length - offset;

        for (long l : a) {
            System.out.println("l = " + l);
        };
    }
}
