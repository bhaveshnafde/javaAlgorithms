// WAP that inputs an array and returns the no. of pairs whose sum is x.
import java.util.*;
public class PairSumX{
  public static void main(String bhavesh[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int x = sc.nextInt();
      int a[] = new int[n];
      for(int i = 0; i<n; i++){
        a[i] = sc.nextInt();
      }
      Arrays.sort(a);
      int no_pairs = 0, i = 0, j = a.length - 1;
      while(i<j){
        if(a[i] + a[j] < x) i++;
        else if(a[i] + a[j] > x) j--;
        else{
          no_pairs++;
          i++;
        }
      }
      System.out.println(no_pairs);
    }
  }

}
