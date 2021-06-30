package item52;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//set의 remove 시그니쳐는 object
//list의 remove 시그니쳐는 int
//list의 remove 메서드가 다중정의되어 있어 혼란이 생김
public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i = -3;i<3; i++){
            set.add(i);
            list.add(i);
        }

        for(int i =0;i<3;i++){
            set.remove(i);
            list.remove(i);
            //list.remove((Integer)i);
        }
        System.out.println(set + " " + list);
    }
}
