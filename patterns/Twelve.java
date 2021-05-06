import java.util.*;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>=j){
                    System.out.print(a + "\t");
                    int c = a+b;
                    a = b;
                    b = c;
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}