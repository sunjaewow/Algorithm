package codingtest;
//연속된 수의 합
public class Q14 {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];
            int i = total - A(num);
            int i1 = i / num;
            for (int a = 0; a < num; a++) {
                answer[a] = i1++;
            }
            return answer;
        }

    private int A(int num) {
        return num * (num - 1) / 2;
    }

}
