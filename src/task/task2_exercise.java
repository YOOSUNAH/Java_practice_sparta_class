package task;

import java.util.*;

public class task2_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        switch (type) {
            case "O형":
                ArrayList<String> strList = new ArrayList<>();
                while (true) {
                    String input = sc.nextLine();
                    if (Objects.equals(input, "끝")) {
                        break;
                    }
                    strList.add(input);
                }
                for (int i = 0; i < strList.size(); i++) {
                    System.out.print(strList.get(i));
                }
                break;

            case "A형":
                ArrayList aList = new ArrayList<>();
                while (true) {
                    String input = sc.nextLine();
                    if (Objects.equals(input, "지우기")) {
                        aList.clear();
                    } else if (Objects.equals(input, "끝")) {
                        break;
                    } else {
                        aList.add(input);
                    }
                }
                for (int i = 0; i < aList.size(); i++) {
                    System.out.println(aList.get(i));
                }

                break;

            case "B형":
                Set<String> setTest = new HashSet<>();
                while (true) {
                    String input = sc.nextLine();
                    if (Objects.equals(input, "끝")) {
                        break;
                    }
                    setTest.add(input);
                }

                // Set에 저장된 요소들을 출력
                for (String element : setTest) {
                    System.out.println(element);  // set은 순서 보장이 안돼
                    if (setTest.contains("사랑")) {
                       System.out.println("나도 사랑해");
                    }
                }
                break;

            case "AB형":
                Map<Integer, String> intMap = new HashMap<>();
                String mapMember = sc.nextLine();
                Integer Num = 1;
                for (int i = 0; i < intMap.size(); i++) {
                    intMap.put(Num++, mapMember);
                }
                break;

            default:
                System.out.println("다른 혈액형으로 입력해주세요");
        }
    }
}

