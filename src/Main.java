//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bufferedReader.readLine());
//        long[] M = new long[N];
//
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        for (int i = 0; i < N; i++) {
//            M[i] = Long.parseLong(stringTokenizer.nextToken());
//        }
//        Arrays.sort(M);
//        int count=0;
//
//        for (int i = 2; i < N; i++) {
//            int a = 0;
//            int b = i - 1;
//
//            while (a < b) {
//
//                if (M[a] + M[b] ==M[i]) {
//                    if (M[a]!=M[b]) {
//                        count++;
//                    }
//                    break;
//                } else if (M[a] + M[b] < M[i]) {
//                    a++;
//                } else {
//                    b--;
//                }
//            }
//        }
//        System.out.println(count);
//        bufferedReader.close();
//    }
//}