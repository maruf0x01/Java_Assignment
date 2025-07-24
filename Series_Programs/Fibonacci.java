import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c, i;

        if(n >= 1) {
            System.out.println(a);
        }
        if(n >= 2) {
            System.out.println(b);
        }
        for(i = 3; i <= n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
