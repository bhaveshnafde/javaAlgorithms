public class RodCut{

  public static int rodCut(int n, int a, int b, int c){
    if(n == 0){
      return 0;
    }
    if(n < 0){
      return -1;
    }
    int res = Math.max(Math.max(rodCut(n-a,a,b,c), rodCut(n-b,a,b,c)), rodCut(n-c,a,b,c));
    if(res == -1){
      return -1;
    }
    return res+1;
  }

  public static void main(String[] args) {
      int n,a,b,c;
      n = 23;
      a = 11;
      b = 9;
      c = 12;
      System.out.println(rodCut(n,a,b,c));
  }
}
