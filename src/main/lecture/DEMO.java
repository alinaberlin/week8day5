package week9.day1.lecture;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class DEMO {
    public static void main(String[] args){

        Map<Integer, String> studentMap = createStudentsMap();
        //ex1
        System.out.println(studentMap.get(2));
        //ex2
        studentMap.entrySet().stream().map(entry -> entry.getKey() + ":" + entry.getValue()).forEach(System.out::println);
        //ex3
        Map<String, String> capitalMap = capitalMap();
        capitalMap.entrySet().stream().map(entry -> entry.getKey() + ":" + entry.getValue()).forEach(System.out::println);
        //ex4
        studentMap.remove(1);
        if(studentMap.get(1) ==null){
            System.out.println("Student removed");
        }

        //5

    }


    private static Map<Integer, String> createStudentsMap() {
        Map<Integer,  String> studentMap = new HashMap<>();
        studentMap.put(1, "Alina" );
        studentMap.put(2, "Lina" );
        studentMap.put(3, "Miha");
        return studentMap;
    }
    private static Map<String, String> capitalMap() {
        Map<String,  String> capitalMap = new LinkedHashMap<>();
        capitalMap.put("Germany", "Berlin");
        capitalMap.put("Japan", "Tokio");
        capitalMap.put("France", "Paris");
        return capitalMap;
    }
    private static Map<String, Integer> wordCountMap(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();
        for(String word:words){
            if(wordCountMap.get(word) !=null){
                int count = wordCountMap.get(word);
                count++;
                wordCountMap.put(word, count);
            }
            else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;

    }
   private static HashSet<Integer> store(){
        HashSet<Integer> integerSet = new HashSet<>();
       integerSet.add(5);
       integerSet.add(10);
       integerSet.add(15);
       integerSet.add(20);
   }

}
