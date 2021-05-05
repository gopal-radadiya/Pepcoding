import java.util.*;

public class PrintAllPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i=low;i<=high;i++){
            boolean isprime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }

            if(isprime==true)
                System.out.println(i);
        }
    }
}