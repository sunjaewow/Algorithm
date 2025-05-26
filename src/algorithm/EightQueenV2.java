package algorithm;

public class EightQueenV2 {

    static boolean[] flagA = new boolean[8];

    static boolean[] flagB = new boolean[15];

    static boolean[] flagC = new boolean[15];


        static int[] pos = new int[8];

        static int count = 0;

        public static void print() {
            for (int i = 0; i < 8; i++) {
                System.out.printf("%2d",pos[i]);
            }
            System.out.println();
        }


        public static void set(int i) {
            for (int j = 0; j < 8; j++) {
                if (flagA[j] == false &&
                flagB[i+j]==false&&
                flagC[i-j+7]==false) {
                    pos[i] = j;
                        if (i == 7) {
                            print();
                            count++;
                        } else {
                            flagA[j] = flagB[i+j]=flagC[i-j+7]=true;
                            set(i + 1);
                            flagA[j] = flagB[i+j]=flagC[i-j+7]=false;
                        }
                    }
                }
            }


        public static void main(String[] args) {
            set(0);
            System.out.println(count);
        }


}
