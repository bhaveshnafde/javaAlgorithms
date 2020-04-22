public class SubsetSumK{

  public static int count(int arr[], int n, int sum){
    if(n == 0){
      if(sum == 0)  return 1;
      else  return 0;
    }else{
      return count(arr, n-1, sum) + count(arr, n-1, sum - arr[n-1]);
    }

  }

  public static void main(String[] args) {
    int arr[] = {10,20,15};
    System.out.println(count(arr,3,25));
  }
}
