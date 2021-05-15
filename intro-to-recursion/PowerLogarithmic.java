import java.io.*;
import java.util.*;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }

    public static int power(int a,int b){
        if(b==0) return 1;
        int temp = power(a,b/2);
        if(b%2==0)
            return temp*temp;
        else
            return temp*a*temp;
    }
}