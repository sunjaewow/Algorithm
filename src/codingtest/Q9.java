package codingtest;

public class Q9 {
    class Solution {
        public int solution(int[][] dots) {
            if (A(dots[0], dots[1], dots[2], dots[3])) return 1;
            if (A(dots[0], dots[2], dots[1], dots[3])) return 1;
            if (A(dots[0], dots[3], dots[1], dots[2])) return 1;

            return 0;
        }

        public boolean A(int[] a, int[] b, int[] c, int[] d) {
            int dy1 = b[1] - a[1];
            int dx1 = b[0] - a[0];
            int dy2 = d[1] - c[1];
            int dx2 = d[0] - c[0];

            return dy1 * dx2 == dy2 * dx1;
        }
    }

}