package algorithm;

import java.util.Scanner;
//버블 정렬 v2
public class BubbleSortV2 {

    private static void swap(int[] x, int idx1, int idx2) {
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
    }

    private static void bubbleSort(int[] x, int size) {
        for (int i = 0; i < size - 1; i++) {
            int count = 0;
            for (int j = size - 1; j > i; i--) {
                if (x[j - 1] > x[j]) {
                    swap(x, j - 1, j);
                    count++;
                }
                if (count == 0) {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("버블 정렬(버전 1)");
        System.out.println("요솟수 : ");
        int size = sc.nextInt();
        int[] x = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("x["+i+"]:");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, size);
        System.out.println("오름차순으로 정렬했습니다.");
        for (int n : x) {
            System.out.println("n = " + n);
        }
    }
}
