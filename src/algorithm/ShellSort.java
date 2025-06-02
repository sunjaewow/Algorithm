package algorithm;

import java.util.Scanner;

public class ShellSort {
    private static void shellSort(int[] x, int size) {
        for (int h = size / 2; h > 0; h /= 2) {
            for (int i = h; i < size; i++) {
                int j;
                int tmp = x[i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단순 선택 정렬");
        System.out.println("요솟수 : ");
        int size = sc.nextInt();
        int[] x = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = sc.nextInt();
        }
        shellSort(x, size);

        for (int num : x) {

            System.out.println(num);
        }
    }
}
