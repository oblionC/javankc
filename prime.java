public class prime {
    public static void main(String args[]) {
        int upto = 1000;
        
        if(upto >= 2)
            System.out.println(2);
        for(int i = 3; i < upto; i += 2) {
            int isPrime = 1;
            for(int j = 3; j < i / 2; j++) {
                if(i % j == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if(isPrime == 1) 
                System.out.println(i);
        }
    }
}