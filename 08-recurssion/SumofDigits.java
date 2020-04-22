public class SumofDigits{

  public static int sum(int num){
    if(num < 10)  return num;
    else{
      return sum(num/10) + (num%10);
    }
  }

  public static void main(String[] args) {
    System.out.println(sum(9978));
  }
}
