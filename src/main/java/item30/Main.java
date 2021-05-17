package item30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(5,6,7,8));
        Set<String> s3 = new HashSet<>(Arrays.asList("hi","bye"));
        Set<String> s4 = new HashSet<>(Arrays.asList("yes","no"));

        //메서드 형변환시의 에러나 예외를 따로 처리해주거나 형변환 해주는 것보다 제네릭 메서드로 만드는것이 더 효율 적

        System.out.println(union(s1,s2));
        System.out.println(union2(s1,s2));
        System.out.println(union(s1,s3));
//        System.out.println(union2(s1,s3));

    }

    public static Set union(Set s1, Set s2){
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    public static <E> Set<E> union2(Set<E> s1,Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
