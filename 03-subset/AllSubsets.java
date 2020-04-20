class A{
  static void printAllSubsets(int arr[],int n){
    for(int i = 0; i < (1<<n); i++){
      System.out.print("{ ");
      for(int j = 0; j < n; j++){
        if((i & (1<<j)) > 0){
          System.out.print(arr[j]+" ");
        }
      }
      System.out.println("}");
    }
  }
  public static void main(String args[]){
    int arr[] = {2,5,6};
    int n = arr.length;
    printAllSubsets(arr,n);
  }
}
