package codingtest;

public class Q4 {
    class Solution {
        public int solution(int price) {
            int sale = 0;
            if (price >= 500000) {
                sale = 20;
            } else if (price >= 300000) {
                sale = 10;
            } else if (price >= 100000) {
                sale = 5;
            }else{

            }
            double answer = price - price * sale * 0.01;
            return (int) answer;
        }
    }

}
