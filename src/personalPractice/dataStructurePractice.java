package personalPractice;

import java.util.*;

public class dataStructurePractice {
    public static void main(String[] args) {
        // 배열 생성해봐
        int[] arraySample = new int[3];
        int[] array = {0, 1, 2};

        // List 생성해봐
        List<Integer> integerList = new ArrayList<>();
        // 직접 값 대입
        integerList.add(0);
        //List 는 인터페이스, 이거의 구현체가 ArrayList,LinkedList
        // 중복 허용, 순서 있음.


        // ArrayList 생성해봐
        ArrayList<Integer> arrayListSample = new ArrayList<>();
        arrayListSample.add(1);
        // 중복 허용, 순서 있음.

        // Set 생성해봐
        Set<String> setSample = new HashSet<>();
        setSample.add("set 만들어졌어요");
        // 중복 허용X, 순서X

        // Map 생성해봐
        Map<String, Integer> mapSample = new HashMap<>();
        mapSample.put("1번", 50);
        // key는 중복 허용X, 순서X
    }

    // class 만들어봐
    public class Sun {
        // 접근제어자 class 클래스명{
        // 멤버변수
        // 생성자
        // 메서드
//   }
        // 멤버 변수 (필드)
        private String suncolor;

        // 생성자  (class 이름과 동일, return 타입 없음!)
        public Sun(String suncolor){
            this.suncolor = suncolor;
        }

        // 메서드
        public void shine(){
            System.out.println("The sun is shining");
        }
    }

    public class Moon{
        // 필드 영역_ 멤버 변수
        private String moonColor;
        // 생성자 (class 이름과 동일, return 타입 없음)
        public Moon(String moonColor){
            this.moonColor = moonColor;
        }
        // 메서드
        public void moonLight(){
            System.out.println("The Moond is bright");
        }
    }


}
