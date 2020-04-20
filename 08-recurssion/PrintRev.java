public class PrintRev{

  public static void printRev(int n){
    if(n == 0)  return;
    else{
      System.out.print(n+" ");
      printRev(n-1);
    }
  }

  public static void main(String[] args) {
    int n = 5;
    printRev(n);
  }
}
