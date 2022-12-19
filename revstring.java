import java.util.Scanner;

public class revstring {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = a.length();
        char[] b = new char[n];
        for(int i = 0; i < n; i++){
            b[i] = a.charAt(n - 1 - i);
        }
        String c = new String(b);
        System.out.println(c);
    }
}
