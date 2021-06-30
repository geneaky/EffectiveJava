package item52;

import java.math.BigInteger;
import java.util.*;

public class CollectionClassifier {
    public static String classify(Set<?> s){
        return "집합";
    }

    public static String classify(List<?> lst){
        return "리스트";
    }

    public static String classify(Collection<?> c){
        return "그 외";
    }
//재정의한 메서드는 동적으로 선택되고, 다중정의한 메서드는 정적으로 선택된다.
    //런타임이 아니라 컴파일타임에 메서드가 선택되기 때문에 Collection<?> 메서드가 선택된다.
    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String,String>().values()
        };

        for (Collection<?> collection : collections) {
            System.out.println(classify(collection));
        }
    }
}
