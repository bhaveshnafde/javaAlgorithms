public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {1,3,2,4,5};

    int temp,min_idx;

    for(int i = 0; i < arr.length - 1; i++){
      min_idx = i;
      for(int j = i; j < arr.length; j++){
        if(arr[j]<arr[min_idx]){
          min_idx = j;
        }
      }
      temp = arr[i];
      arr[i] = arr[min_idx];
      arr[min_idx] = temp;

    }
    for(int i = 0;i < arr.length;i++){
      System.out.print(arr[i]+" ");
    }
	}
}
/*
1 2 4 5 6
*/
