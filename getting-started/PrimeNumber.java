import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            boolean isprime = true;
            for(int j=2;j<=Math.sqrt(n);j++){
                if(n%j==0){
                    isprime = false;
                    break;
                }
            }

            if(isprime==true)
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
    }
}