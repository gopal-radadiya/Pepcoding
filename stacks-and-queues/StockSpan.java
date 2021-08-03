import java.io.*;
import java.util.*;

public class StockSpan {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[0] = 1;
        st.push(0); // we will store idx in stack

        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()])
                st.pop();
            if(st.size()==0)
                ans[i] = i+1;
            else
                ans[i] = i-st.peek();
            st.push(i);
        }

        for(int ele : ans)
            System.out.println(ele);
    }
}