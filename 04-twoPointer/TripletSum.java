// WAP that inputs an array and returns 1 if it has a triplet whose sum is 0 and return 0 if no such triplet is found
import java.util.*;
public class TripletSum{
  public static void main(String bhavesh[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      boolean isTrue = false;
      for(int i = 0; i<n-2; i++){
        if(twoSum(arr, -arr[i], i+1)){
          System.out.println("1");
          isTrue = true;
        }
      }
      if(!isTrue) System.out.println("0");
    }
  }
  static boolean twoSum(int a[], int x, int i){
    int j = a.length-1;
    while(i < j){
      if((a[i]+a[j]) < x) i++;
      else if((a[i]+a[j]) > x) j--;
      else return true;
    }
    return false;
  }
}
