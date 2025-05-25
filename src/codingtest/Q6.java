package codingtest;

public class Q6 {
    class Solution {
        public int solution(int hp) {
            int answer = 0;
            answer = answer + hp / 5;
            int x = hp % 5;
            if (x == 4||x==2) {
                answer += 2;
            } else if (x == 3||x==1) {
                answer += 1;
            }
            return answer;
        }
    }

    class Answer {
        public int solution(int hp) {
            return hp / 5 + (hp % 5 / 3) + (hp % 5 % 3);
        }
    }

}
