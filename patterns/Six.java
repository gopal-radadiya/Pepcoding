import java.util.*;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n+1)/2;
        int k = 0;

        for(int i=1;i<=n;i++){

            if(i<=m) k++;
            else k--;

            for(int j=1;j<=n+2;j++){
                if(j>=m+2-k && j<=m+k)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }
}