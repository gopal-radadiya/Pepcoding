import java.util.*;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n+1)/2;
        int k = 0;

        for(int i=1;i<=n;i++){

            if(i<=m) k++;
            else k--;

            for(int j=1;j<=n;j++){
                if(j==m+1-k || j==m-1+k)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}