import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int fre = getDigitFrequency(n,d);
        System.out.println(fre);
    }

    public static int getDigitFrequency(int n,int d){
        int cnt = 0;
        while(n>0){
            int rem = n%10;
            if(rem==d)
                cnt++;
            n = n/10;
        }
        return cnt;
    }
}