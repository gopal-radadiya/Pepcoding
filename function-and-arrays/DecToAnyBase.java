import java.util.*;

public class DecToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = getValueInBase(n,b);
        System.out.println(ans);
    }
    
    public static int getValueInBase(int n,int b){
        int ans = 0;
        int p = 1;
        while(n>0){
            int rem = n%b;
            n = n/b;
            ans = ans+rem*p;
            p = p*10;
        }
        return ans;
    }
}