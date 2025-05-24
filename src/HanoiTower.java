import java.util.Scanner;
import java.util.Stack;

class HanoiTower {

    //    static void move(int x, int from, int to, int by) {
//        if (x == 1) {
//            System.out.println("원반[1]을 1기둥에서 " + to + "기둥으로 옮김");
//        } else {
//            move(x - 1, from, by, to);
//            System.out.println("원반[" + x + "]을 " + from + "기둥에서 " + to + "기둥으로 옯김");
//            move(x-1, by, to, from);
//        }
//    }
    static void move(int x, int from, int to, int by) {
        class Frame {
            int n, from, to, by, step;

            Frame(int n, int from, int to, int by, int step) {
                this.n = n;
                this.from = from;
                this.to = to;
                this.by = by;
                this.step = step;
            }
        }
        Stack<Frame> stack = new Stack<>();
        stack.push(new Frame(x, from, to, by, 0));
        while (!stack.isEmpty()) {
            Frame f = stack.pop();

            if (f.n == 1) {
                System.out.println("원반[1]을 1기둥에서 " + f.to + "기둥으로 옮김");
            } else {
                if (f.step == 0) {
                    stack.push(new Frame(f.n, f.from, f.to, f.by, 1));
                    stack.push(new Frame(f.n - 1, f.from, f.by, f.to, 0));
                } else if (f.step == 1) {
                    System.out.println("원반[" + x + "]을 " + from + "기둥에서 " + to + "기둥으로 옯김");
                    stack.push(new Frame(f.n-1, f.by, f.to, f.from, 0));
                }

            }

        }
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("원반 개수를 입력하세요:");
        int x = sc.nextInt();
        move(x, 1, 3, 2);
    }
}