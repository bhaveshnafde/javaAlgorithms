public class Factorial{

  public static int factorial(int n, int k){
    if(n == 0)  return k;
    else{
      return(factorial(n-1, k*n));
    }
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(factorial(n, 1));
  }
}
