import java.util.*;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nc = n;
        int cnt = 0;

        while(n>0){
            n = n/10;
            cnt++;
        }

        int div = (int)Math.pow(10,cnt-1);

        while(div>0){
            int temp = nc/div;
            nc = nc%div;
            div = div/10;
            System.out.println(temp);
        }
    }
}