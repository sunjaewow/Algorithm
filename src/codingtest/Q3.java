package codingtest;


public class Q3 {
    class Solution {
        public int[] solution(int n) {
            int length = 0;
            if (n % 2 != 0) {
                length = n / 2 + 1;
            } else {
                length = n / 2;
            }
            int[] answer = new int[length];


            for (int i = 0; i < length; i++) {
                answer[i] = i * 2 + 1;
            }

            return answer;
        }
    }

}
