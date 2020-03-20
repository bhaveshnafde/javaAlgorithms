public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {1,2,6,5,4};
    int temp;
    boolean sorted = false;
    for(int i = 0;i < arr.length - 1;i++){
      for(int j = 0;j < arr.length - 1 - i;j++){
        if(arr[j]>arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
            sorted = false;
        }
      }
      if(sorted)  break;
    }
    for(int i = 0;i < arr.length;i++){
      System.out.print(arr[i]+" ");
    }
	}
}
/*
1 2 4 5 6
*/
