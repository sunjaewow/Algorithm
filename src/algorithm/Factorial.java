package algorithm;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        int answer = 1;
        for (int i = 0; i < n; i++) {
            if (n == 0) {
                break;
            }
            answer *= n;
            n--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}
