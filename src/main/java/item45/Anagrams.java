package item45;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        File dictionary = new File(args[0]);
        Path dictionarry = Paths.get(args[2]);
        int minGroupSize = Integer.parseInt(args[1]);

        Map<String, Set<String>> groups = new HashMap<>();
        try( Scanner s = new Scanner(dictionary)){
            while(s.hasNext()){
                String word = s.next();

                groups.computeIfAbsent(alphabetsize(word),
                        (unused) -> new TreeSet<>()).add(word);
            }
        }

        for(Set<String> group: groups.values())
            if (group.size() >= minGroupSize)
                System.out.println(group.size() + ": " + group);
        System.out.println("=========test1============");
//////////////////////////////////////////////////////////////////////////////////////////
        try(Stream<String> words = Files.lines(dictionarry)){
            words.collect(
                    groupingBy(word -> word.chars().sorted()
                    .collect(StringBuilder::new,
                            (sb,c) -> sb.append((char) c),
                            StringBuilder::append).toString()))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .map(group -> group.size() + ": " + group)
                    .forEach(System.out::println);
        }
        /////////////////////////////////////////////////////////////////////////////////
        System.out.println("=========test2====best========");
        //스트림 파이프 라인의 가독성을 고려한 변수명
        //세부 구현인 alphabetsize 메서드는 로직 밖으로 빼서 가독성 상승
        try(Stream<String> words = Files.lines(dictionarry)){
            words.collect(groupingBy(word -> alphabetsize(word)))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .forEach(g -> System.out.println(g.size() + ": " + g));
        }
    }

    private static String alphabetsize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}
