package codingtest;

public class Q15 {
    public static String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int a = 0, b = 0;
        for (String str : arr) {
            if (str.equals("+")) {
                continue;
            } else if (str.contains("x")) {
                if (str.length() == 1) {
                    a += 1;
                } else {
                    a += Integer.parseInt(str.replace("x", ""));
                }
            } else {
                b += Integer.parseInt(str);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (a > 0) {
            if (a == 1) {
                stringBuilder.append("x");
            }else
                stringBuilder.append(a).append("x");
        }
        if (b > 0) {
            if (a>0) {
                stringBuilder.append(" + ").append(b);
            } else
                stringBuilder.append(b);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String solution = solution("x + x + x");
        System.out.println("solution = " + solution);

    }
}
