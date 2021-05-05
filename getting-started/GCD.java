import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcdval = findgcd(a,b);
        int lcmval = (a*b)/gcdval;
        System.out.println(gcdval);
        System.out.println(lcmval);
    }

    public static int findgcd(int a,int b){
        if(b==0)
            return a;
        else
            return findgcd(b,a%b);
    }
}