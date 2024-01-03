package week03.hasExample;

public class Handle {  // class 선언!
    String company; // 핸들 회사
    String type; // 핸들 타입

    public Handle(String company, String type) {   // return 없는 생성자!
        this.company = company;
        this.type = type;
    }

    public void turnHandle(String direction) {   // return 있는 메서드!!
        System.out.println(direction + " 방향으로 핸들을 돌립니다.");
    }
}