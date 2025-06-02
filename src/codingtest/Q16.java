package codingtest;

//특이한 정렬
import java.util.Arrays;

public class Q16 {
    public static int[] solution(int[] numlist, int n) {
        Integer[] array = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(array, (a,b)->{
            int num1 = Math.abs(a - n);
            int num2 = Math.abs(b - n);
            if (num1 == num2) {
                return b - a;
            }else
                return num1 - num2;
        });
        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] solution = solution(arr, 4);
        for (int num : solution) {
            System.out.println("num = " + num);
        }

    }

}
