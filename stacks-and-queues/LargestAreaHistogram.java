import java.io.*;
import java.util.*;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        int[] lb = new int[arr.length]; // idx of nse on left side
        st.push(0);
        lb[0] = -1;

        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]<=arr[st.peek()])
                st.pop();
            if(st.size()==0)
                lb[i] = -1;
            else
                lb[i] = st.peek();
            st.push(i);
        }

        // empty the stack
        while(st.size()>0)
            st.pop();

        int[] rb = new int[arr.length]; // idx of nse on right side
        st.push(arr.length-1);
        rb[arr.length-1] = arr.length;

        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]<=arr[st.peek()])
                st.pop();
            if(st.size()==0)
                rb[i] = n;
            else
                rb[i] = st.peek();
            st.push(i);
        }

        int mxarea = 0;
        for(int i=0;i<arr.length;i++){
            int width = rb[i]-lb[i]-1;
            int area = width*arr[i];
            if(area>mxarea)
                mxarea = area;
        }
        System.out.println(mxarea);
    }
}