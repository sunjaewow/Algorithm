package codingtest;

//안전지대
public class Q13 {
        public  static int solution(int[][] board) {
            int answer = 0;
            int length = board.length;
            int[][] newBoard = new int[length + 2][length + 2];
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (board[i][j] == 1) {
                        for (int a = i; a <= i + 2; a++) {
                            for (int b = j; b <= j + 2; b++) {
                                newBoard[a][b]++;
                            }
                        }
                    }
                }
            }
            for (int i = 1; i < length+1; i++) {
                for (int j = 1; j < length+1; j++) {
                    if (newBoard[i][j] !=0) {
                        answer++;
                    }
                }
            }
            return answer;
        }

    public static void main(String[] args) {
        int[][] board = new int[1][0];
        int answer = solution(board);
        System.out.println("answer = " + answer);
    }

}
