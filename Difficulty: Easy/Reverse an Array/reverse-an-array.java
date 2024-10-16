//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
        int n = arr.length;
        
        // int a[] = new int[n];
        
        // for(int i=0 ; i<=n ; i++)
        // {
        //     for(int j=0 ; j<0 ; j--)
        //     {
        //         a[j] = arr[i];
        //     }
        // }
        
        // for(int i=0 ; i<n ; i++)
        // {
        //     arr[i] = a[i];
        // }
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0 ; i<n ; i++)
        {
            s.push(arr[i]);
        }
        
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = s.pop();
        }
        
    }
}