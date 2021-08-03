import java.io.*;
import java.util.*;

public class NextGreaterElementToTheRight {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(st.size()==0)
                ans[i] = -1;
            else if(st.size()>0 && st.peek()>arr[i])
                ans[i] = st.peek();
            else if(st.size()>0 && st.peek()<=arr[i]){
                while(st.size()>0 && st.peek()<=arr[i])
                    st.pop();
                if(st.size()==0)
                    ans[i] = -1;
                else
                    ans[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int ele : ans)
            System.out.println(ele);
    }
}