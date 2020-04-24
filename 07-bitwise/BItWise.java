// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


 // } Driver Code Ends
//User function Template for Java

class CountBits{

    // Function to count number of set bits
    public static int countSetBits(int N){

        int table[] = new int[256];
        for(int i = 0; i < 256; i++){
            table[i] = (i&1) + table[i/2];
        }

        int res = 0;
        for(int j = 1; j <= N; j++){
          int n=j;
          for(int i = 0; i < 4; i++){
              res += table[n&0xff];
              n = n>>8;
          }
        }
        return res;
    }
}

// { Driver Code Starts.

// Driver code
public class BItWise {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();

		    CountBits obj = new CountBits();

		    System.out.println(obj.countSetBits(n));
		}
	}
}
  // } Driver Code Ends
