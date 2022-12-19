import java.util.Scanner;

public class sumofdig {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n % 10);
        int sum = 0;
        for(; n != 0; n = n / 10) {
            sum += n % 10;
        }
        System.out.println(sum);
    }
}
