package codingtest;

import java.util.Arrays;

class Q1 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int length = array.length/2;
        return array[length];
    }


}
