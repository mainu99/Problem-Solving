//Link: 509. Fibonacci Number
//O(N)
public class FibonacciNumber {

    public static int fib(int n) {

        if(n <= 1) return n;
        int x = 0;
        int y = 1;
        for(int i = 2; i <= n; i++) {
            int temp = y;
            y = x + y;
            x = temp;
        }
        return y;
    }

    static void main(String[] args) {
        int res = fib(6);
        System.out.println(res);
    }
}
