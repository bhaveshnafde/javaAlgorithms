public class SumofDigits{

  public static int sum(int num, int sum){
    if(num == 0)  return sum;
    else{
      return sum(num/10, sum+num%10);
    }
  }

  public static void main(String[] args) {
    System.out.println(sum(9978, 0));
  }
}
