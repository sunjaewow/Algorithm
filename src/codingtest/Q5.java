package codingtest;
import java.util.Scanner;


public class Q5 {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i < n+1; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i < x + 1; i++) {
            System.out.println("*".repeat(i));
        }
    }

}

