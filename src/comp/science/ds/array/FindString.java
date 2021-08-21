package comp.science.ds.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindString {

    private static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        Map<String,Integer> hm = new HashMap<>();
        for(String s:strings){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(String querie:queries){
            list.add(hm.get(querie)==null?0:hm.get(querie));
        }
        return list;
    }


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        strings.add("def");
        strings.add("de");
        strings.add("fgh");

        queries.add("de");
        queries.add("lmn");
        queries.add("fgh");

        List<Integer> list = matchingStrings(strings,queries);

        list.stream().forEach(System.out::println);
    }
}
