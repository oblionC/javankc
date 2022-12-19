import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter value no." + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Inputted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}