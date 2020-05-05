class Test{

  static int bsearch(int arr[], int l, int h, int x){
    if(l>h)
      return -1;
    int mid = l + (h-l)/2;
    if(arr[mid] == x)
      return mid;
    if(arr[mid]>x)
      return bsearch(arr,l,mid-1,x);
    else
      return bsearch(arr,mid+1,h,x);
  }

  public static void main(String[] args) {
    int arr[] = {1,5,7,9,11,50};
    System.out.println(bsearch(arr,0,arr.length,50));
  }
}
