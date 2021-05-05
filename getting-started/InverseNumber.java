import java.util.*;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 1;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            sum += idx*(int)Math.pow(10,rem-1);
            n = n/10;
            idx++;
        }
        System.out.println(sum);
    }
}