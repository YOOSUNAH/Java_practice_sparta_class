package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6_Map {
    public static void main(String[] args) {
        // Map : key -value pair -> 중요!!
        // Key라는 값으로 unique하게 보장이 돼야함!
        // Map -> HashMap, TreeMap으로 응용!

        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 key 생략
        intMap.put("삼", 16); // 중복 key 생략  -> value는 가장 마지막에 저장된걸로 변경되어 있음.
        intMap.put("사", 11); // value는 중복되도 괜찮음

        // Key 값 전체 출력 (향상된 for문)
        for (String key: intMap.keySet()) {
            System.out.println(key);
        }
        // value 값 전체 출력 (향상된 for문)
        for (Integer value: intMap.values()) {
            System.out.println(value);
        }
        System.out.println(intMap.get("삼"));


    }
}
