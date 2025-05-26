package codingtest;

import java.util.Scanner;

//정수를 나선형으로 표현
public class Q8 {
    class Solution {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];
            int num = 1;//시작
            int x = 0;//위치값
            int y = 0;
            int dir = 0;//방향

            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};

            while (num <= n * n) {
                answer[x][y] = num;
                num++;

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];

                }

                x = nx;
                y = ny;
            }
            return answer;
        }
    }
}
