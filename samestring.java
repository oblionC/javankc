import java.util.Scanner;

public class samestring {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.equals(b)) {
            System.out.println("Same strings");
        }
        else {
            System.out.println("Different strings");
        }
    }
}