public class Pallindrome{

  public static boolean Pallindrome(String str, int s, int e){
    if(s >= e)  return true;
    if(str.charAt(s) != str.charAt(e))  return false;
    return Pallindrome(str,s+1,e-1);
  }

  public static void main(String[] args) {
    if(Pallindrome("aabca",0,4)){
      System.out.println("Pallindrome");
    }else{
      System.out.println("Not a Pallindrome");
    }
  }
}
