package codingtest;
//분수의 덧셈 (유클리드)
class Q11 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int lcd = lcd(denom1, denom2);

        int a = numer1 * (lcd / denom1);
        int b = numer2 * (lcd / denom2);
        int sum = a + b;

        int gcd = gcd(sum, lcd);
        answer[0] = sum / gcd;
        answer[1] = lcd / gcd;

        return answer;


    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    private int lcd(int x, int y) {
        return x * y / gcd(x, y);
    }
}