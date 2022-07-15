public class SumOfOdd {
    public static int SumofOdd(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {

                continue;

            } else {
                sum += i;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(SumofOdd(n));
    }

}
