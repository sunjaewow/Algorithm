package algorithm;

public class EightQueen {

    static boolean[] flag = new boolean[8];
    static int[] pos = new int[8];

    static int count = 0;

    public static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d",pos[i]);
        }
        System.out.println();
    }

    public static boolean isCheck(int row) {
        for (int i = 0; i < row; i++) {
            if (Math.abs(i - row) == Math.abs(pos[i] - pos[row])) {
                return false;
            }
        }
        return true;
    }

    public static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag[j] == false) {
                pos[i] = j;
                if (isCheck(i)) {
                    if (i == 7) {
                        print();
                        count++;
                    } else {
                        flag[j] = true;
                        set(i + 1);
                        flag[j] = false;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
        System.out.println(count);
    }
}
