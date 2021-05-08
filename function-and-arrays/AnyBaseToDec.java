import java.util.*;

public class AnyBaseToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = getValueIndecimal(n,b);
        System.out.println(ans);
    }

    public static int getValueIndecimal(int n,int b){
        int sum = 0;
        int p = 1;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum += rem*p;
            p = p*b;
        }
        return sum;
    }
}