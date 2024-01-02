package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자 char (1byte), 문자열String
        // String = char[]

        // 기본형 변수 vs 참조형 변수
        // 1.기본형 변수는 '소문자로 시작함' 반면 '대문자로 시작함'
        //  - wrapper class에서 기본형 변수르 감싸줄 때(boxing), int -> Integer
        // 2.r기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 지정함( = 주소형 변수)

        // cha< String 이 (훨씬 더 자주 쓰인다)
        // Stirng 이 가지고 있는 기능이 너무 많아서
        // Wrapper class와도 상당히 비슷함. -> 기본형 변수가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 Wrapper을 감쌈으로쎠, 추가기능을 더함

        // String 기능 활용 예시
        String str = "ABCD";

        // (1) Length;
        int strLength = str.length();
        System.out.println(strLength);

        // (2) charAt(int inxdex)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // (3) substirng(int fornIndex, int toIndex)
        String strSub = str.substring(0, 3); // 3번째 전까지
        System.out.println(strSub); // ABC 까지 출력

        // (4) equals(String str)
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual); // true

        // (5) toCharArray() : String -> chgr[]
        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray); // ABCD

        // (6) 반대로 char[] -> String -> char
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString); //ABC

    }
}
