import java.util.*;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = getDifference(n1,n2,b);
        System.out.println(ans);
    }

    public static int getDifference(int n1,int n2,int b){
        int sum = 0;
        int rem = 0;
        int p = 1;
        int c = 0;
        while(n2>0 || c>0){
            int rem1 = n1%10;
            n1 = n1/10;
            int rem2 = n2%10;
            n2 = n2/10;
            if(rem2+c>=rem1){
                rem = (rem2+c-rem1)%b;
                c = 0;
            }
            else{
                rem = (rem2+c+b-rem1)%b;
                c = -1;
            }
            sum += rem*p;
            p = p*10;
        }
        return sum;
    }
}