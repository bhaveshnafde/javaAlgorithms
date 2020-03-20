public class Sieve{
  public static void main(String args[]){
    int n = 30;
    boolean ar[] = new boolean[n+1];

    for(int i = 0; i <= n; i++){
      ar[i] = true;
    }

    for(int i = 2; i <= n; i++){
      if(ar[i]==true){
        for(int j = i*i; j <= n; j += i){
          if(j % i == 0){
            ar[j] = false;
          }
        }
      }
    }

    for(int i = 2; i<n; i++){
      if(ar[i] == true){
        System.out.print((i)+" ");
      }
    }
  }
}
