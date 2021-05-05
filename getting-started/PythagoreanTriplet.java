import java.util.*;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean ans = false;

        if(a>b){
            if(a>c)
                ans = (b*b+c*c==a*a);
            else
                ans = (a*a+b*b==c*c);
        }
        else{
            if(b>c)
                ans = (a*a+c*c==b*b);
            else
                ans = (a*a+b*b==c*c);
        }
        System.out.println(ans);
    }
}