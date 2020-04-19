public class PowerSet{

  public static void powerSet(String str){
    int n = str.length();
    int counter = (int)Math.pow(2,n);
    for(int j = 0; j < counter; j++){
      for(int i = 0; i < n; i++){
        if((j & (1 << i)) != 0){
          System.out.print(str.charAt(i));
        }
      }System.out.println();
    }
  }

  public static void main(String[] args) {
    String str = "abc";
    powerSet(str);
  }
}
