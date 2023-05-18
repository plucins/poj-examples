package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Jan", 50);
        marks.put("Adam", 10);
        marks.put("Karol", 22);
        marks.put("Ala", 31);
        marks.put("Karolina", 67);

//        System.out.println(marks);

        Map<String, List<Integer>> multiMarks = new HashMap<>();
        multiMarks.put("Jan", new ArrayList<>());
        multiMarks.get("Jan").addAll(Arrays.asList(2,1,2,1));
//        System.out.println(multiMarks);

        for(String s: marks.keySet()){
            System.out.println(s + " -> " + marks.get(s));
        }

        for(Map.Entry<String, Integer> mark: marks.entrySet()){
            mark.getValue();
        }
    }
}
