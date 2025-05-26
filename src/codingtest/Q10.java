package codingtest;

//겹치는 선분의 길이
class Q10 {
    public int solution(int[][] lines) {
        int [] A =new int[201];
        for (int[] line : lines) {
            int start = line[0] + 100;
            int finish = line[1] + 100;

            for (int i = start; i < finish; i++) {
                A[i]++;
            }
        }
        int answer = 0;
        for (int i = 0; i < 201; i  ++){
            if (A[i] >= 2) {
                answer++;
            }
        }
        return answer;
    }
}