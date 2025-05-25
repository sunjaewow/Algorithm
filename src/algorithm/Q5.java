package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Q5 {

    static void recur(int n) {
        class Frame {
            int n, step;

            Frame(int n, int step) {
                this.n = n;
                this.step = step;
            }
        }
        Stack<Frame> stack = new Stack<>();
        stack.push(new Frame(n, 0));
        while (!stack.isEmpty()) {
            Frame f = stack.pop();
            if (f.n > 0) {
                if (f.step == 0) {
                    stack.push(new Frame(f.n, 1));
                    stack.push(new Frame(f.n - 1, 0));
                } else if (f.step == 1) {
                    stack.push(new Frame(f.n, 2));
                    stack.push(new Frame(f.n - 2, 0));
                } else if (f.step == 2) {
                    System.out.println(f.n);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 :");
        int x = sc.nextInt();
        recur(x);
    }
}