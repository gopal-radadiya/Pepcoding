import java.util.*;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>=j)
                    System.out.print(val++ + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}