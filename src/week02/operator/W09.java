package week02.operator;

public class W09 {
    public static void main(String[] args) {
        short x = 10;
        int y = 20;
        int z = x + y;

        long lx= 30L;
        long lz = z + lx;

        float fx = x;
        float fy = y;
        float fz = z;

        System.out.println(lz); // 60
        System.out.println(fx); // 10.0
        System.out.println(fy); // 20.0
        System.out.println(fz); // 30.0
    }
}
