package item18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("aa","bb","cc"));
        System.out.println("s.addCount = " + s.addCount);

        ///////////////////////////////////////compare up and down

        Set<String> set = new HashSet<>();
        InstrumentedHashSet2<String> s2 = new InstrumentedHashSet2<String>(set);
        s2.add("hi");
        ArrayList<String> test = new ArrayList<>();
        test.add("hi2");
        test.add("hi3");
        s2.addAll(test);
        System.out.println("s2 = " + s2.getAddCount());
    }
}
