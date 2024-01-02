package task;

import java.sql.Array;
import java.util.*;

public class task2_Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String foodName = sc.nextLine();


        switch (title) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while (true) {
                    // 한줄씩 저장
                    String input = sc.nextLine();
                    if (Objects.equals(input, "끝")) { // 끝이라고 하면 멈추기
                        break;
                    }
                    strList.add(input);
                }
                System.out.println("[ List 으로 저장된" + foodName + " ]");
                // 한줄씩 출력
                for (int i = 0; i < strList.size(); i++) {
                    System.out.println( (i+1) + ". " + strList.get(i));
                }
                break;
            case "Set":
                Set<String> stringSet = new HashSet<>();
                while (true) {
                    // 한줄씩 저장
                    String input = sc.nextLine();
                    if (Objects.equals(input, "끝")) { // 끝이라고 하면 멈추기
                        break;
                    }
                    stringSet.add(input);
                }
                System.out.println("[ Set 으로 저장된" + foodName + " ]");
                // 한줄씩 출력
                for (int i = 0; i < stringSet.size(); i++) {
                    System.out.println((i+1) + ". " + stringSet.getClass());
                }
                break;

            case "Map":
                Map<Integer, String> stringMap = new HashMap();
                // 한줄씩 저장
                int lineNum = 0;
                while (true) {
                    String input = sc.nextLine();
                    if (Objects.equals(input, "끝")) { // 끝이라고 하면 멈추기
                        break;
                    }
                    stringMap.put(lineNum++, input);
                }
                System.out.println("[ Map 으로 저장된" + foodName + " ]");
                // 한줄씩 출력
                for (int i = 0; i < stringMap.size(); i++) {
                    System.out.println((i+1) + ". " + stringMap.get(i));
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
        }
    }
}
