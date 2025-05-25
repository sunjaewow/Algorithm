package codingtest;

import java.util.Arrays;

public class Q7 {
    class Solution1 {
        public int solution(String[] babbling) {
            int answer = 0;
            String aya = "aya";
            String ye = "ye";
            String woo = "woo";
            String ma = "ma";
            for (String str : babbling) {
                if (str.length() == 2) {
                    if (str.equals(ye) || str.equals(ma)) {
                        answer++;
                    }
                } else if (str.length() == 3) {
                    if (str.equals(aya) || str.equals(woo)) {
                        answer++;
                    }
                } else if (str.length() == 4) {
                    if (str.contains(ye) && str.contains(ma)) {
                        answer++;
                    }
                } else if (str.length() == 5) {
                    if ((str.contains(woo) || str.contains(aya)) && (str.contains(ye) || str.contains(ma))) {
                        answer++;
                    }
                } else if (str.length() == 6) {
                    if (str.contains(aya) && str.contains(woo)) {
                        answer++;
                    }
                } else if (str.length() == 7) {
                    if ((str.contains(woo) || str.contains(aya)) && (str.contains(ye) && str.contains(ma))) {
                        answer++;
                    }
                } else if (str.length() == 8) {
                    if ((str.contains(woo) && str.contains(aya)) && (str.contains(ye) || str.contains(ma))) {
                        answer++;
                    }
                } else if (str.length() == 10) {
                    if ((str.contains(woo) && str.contains(aya)) && (str.contains(ye) && str.contains(ma))) {
                        answer++;
                    }
                }
            }
            return answer;
        }
    }

    class Answer {
        public int solution(String[] babbling) {
            int answer = 0;

            for (String str : babbling) {
                str = str.replace("aya", "1");
                str = str.replace("ye", "1");
                str = str.replace("woo", "1");
                str = str.replace("ma", "1");
                str = str.replace("1", "");
                if (str.isEmpty()) {
                    answer++;
                }
            }
            return answer;
        }


    }

}
