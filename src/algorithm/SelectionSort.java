package algorithm;

import java.util.Scanner;
//단순 선택 정렬. 순서 보장 x 불안정 정렬 같은 값이라도 무조건 바꿔버림.
public class SelectionSort {

    private static void swap(int[] x, int idx1, int idx2) {
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
    }

    private static void selectSort(int[] x, int size) {
        for (int i = 0; i < size - 1; i++) {
            int min = 0;
            for (int j = i + 1; j < size; j++) {
                if (x[j] < x[i]) {
                    min = x[j];
                    swap(x,j,i);
                }
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
        selectSort(x, size);

        for (int num : x) {

            System.out.println(num);
        }
    }

}
