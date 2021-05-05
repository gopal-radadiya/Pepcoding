import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        int nc = n;

        while(n>0){
            n = n/10;
            cnt++;
        }

        int xx = (int)Math.pow(10,cnt-1);

        if(k>=0){
            for(int i=0;i<k%cnt;i++){
                int rem = nc%10;
                nc = nc/10;
                nc = rem*xx+nc;
            }
        }
        else{
            k = Math.abs(k);
            for(int i=0;i<k%cnt;i++){
                int temp = nc/xx;
                nc = nc%xx;
                nc = nc*10+temp;
            }
        }
        System.out.println(nc);
    }
}