import java.util.Scanner;

public class EuclidGCD {
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int x = scanner.nextInt();
        System.out.println("정수를 입력하세요");
        int  y= scanner.nextInt();

        System.out.println(gcd(x, y));

    }
}
