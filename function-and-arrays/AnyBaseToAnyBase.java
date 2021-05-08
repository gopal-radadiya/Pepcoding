import java.util.*;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sb = sc.nextInt(); // source base
        int db = sc.nextInt(); // destination base
        int temp = getValueIndecimal(n,sb);
        int ans = getValueInBase(temp,db);
        System.out.println(ans);
    }

    public static int getValueIndecimal(int n,int sb){
        int sum = 0;
        int p = 1;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum += rem*p;
            p = p*sb;
        }
        return sum;
    }

    public static int getValueInBase(int n,int db){
        int sum = 0;
        int p = 1;
        while(n>0){
            int rem = n%db;
            n = n/db;
            sum += rem*p;
            p = p*10;
        }
        return sum;
    }
}