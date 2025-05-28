package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//주사위 게임
public class Q12 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[7];
        int[] arr = new int[]{a, b, c, d};
        List<Integer> list = new ArrayList<>();
        int p = 0, q = 0, r = 0, count = 0;
        for (int num : arr) {
            dice[num]++;
        }
        for (int i=1;i<=6;i++) {
            if (dice[i] == 4) {
                p = i;
            } else if (dice[i] == 3) {
                p = i;
            } else if (dice[i] == 2) {
                if (count == 0) {
                    p = i;
                }
                if (count == 1) {
                    q = i;
                }
                count++;
            } else if (dice[i] == 1) {
                list.add(i);
            }
        }
        if (list.size() == 4) {
            return Collections.min(list);
        } else if (list.size() == 2) {
            return list.stream().reduce(1, (x, y) -> x * y);
        } else if (list.size() == 1) {
            return (10 * p + list.get(0))*(10 * p + list.get(0));
        } else {
            if (q == 0) {
                return 1111 * p;
            } else {
                return (p + q) * Math.abs(p - q);
            }
        }
    }
    class Solution {//정렬한 후 수 계산 지린다
        public int solution(int a, int b, int c, int d) {

            int[] dice = { a, b, c, d };
            Arrays.sort(dice);

            int ans = 0;

            if (dice[0] == dice[3]) {
                ans = 1111 * dice[3];
            } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
                ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
            } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
                ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
            } else if (dice[0] == dice[1]) {
                ans = dice[2] * dice[3];
            } else if (dice[1] == dice[2]) {
                ans = dice[0] * dice[3];
            } else if (dice[2] == dice[3]) {
                ans = dice[0] * dice[1];
            } else {
                ans = dice[0];
            }

            return ans;
        }
    }
}
