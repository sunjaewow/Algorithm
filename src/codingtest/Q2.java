package codingtest;

public class Q2 {
    class Solution {
        public int solution(String my_string, String is_suffix) {
            int length = is_suffix.length();
            int length1 = my_string.length();
            if (length >= length1) {
                return my_string.equals(is_suffix) ? 1 : 0;
            }
            return my_string.substring(length1 - length, length1).equals(is_suffix) ? 1 : 0;
        }
    }

    class Answer {
        public int solution(String my_string, String is_suffix) {
            return my_string.endsWith(is_suffix) ? 1 : 0;
        }
    }
}
