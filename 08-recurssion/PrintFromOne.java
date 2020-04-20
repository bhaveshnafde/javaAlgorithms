public class PrintFromOne{
  public static void PrintFromOne(int n, int k){
    if(n == 0)  return;
    else{
      System.out.print(n+" ");
      PrintFromOne(n-1, k+1);
    }
  }

  public static void main(String[] args) {
    int n = 5;
    int k = 1;
    PrintFromOne(n, k);
  }
}
