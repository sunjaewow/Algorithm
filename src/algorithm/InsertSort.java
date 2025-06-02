package algorithm;

import java.util.Scanner;
//단순 삽입 정렬
//장점: 정렬을 마쳤거나 정렬을 마친 상태에 가까우면 정렬 속도가 매우 빨라짐.
//단점: 삽입할 위치가 멀리 떨어져 있으면 이동해야 하는 횟수가 많아짐.
public class InsertSort {
    private static void insertSort(int[] x, int size) {
        for (int i = 1; i < size; i++) {
            int j;
            int tmp = x[i];
            for (j = i; j > 0 && x[j - 1] > tmp; j--) {
                x[j] = x[j - 1];
            }
            x[j] = tmp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단순 삽입 정렬");
        System.out.println("요솟수 : ");
        int size = sc.nextInt();
        int[] x = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = sc.nextInt();
        }
        insertSort(x, size);

        for (int num : x) {

            System.out.println(num);
        }
    }
}
