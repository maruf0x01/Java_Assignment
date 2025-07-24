import java.util.Scanner;

public class GoldBatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        if(sum % 5 == 0) {
            System.out.println("Gold Batch Number");
        } else {
            System.out.println("Not Gold Batch Number");
        }
    }
}
