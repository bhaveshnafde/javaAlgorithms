public class PowerSet{

  public static void set(String str, String curr, int index){
    if(index == str.length()){
      System.out.println(curr);
      return;
    }
    set(str, curr, index +1);
    set(str, curr + str.charAt(index), index +1);
  }

  public static void main(String[] args) {
    String str = "ABC";
    set(str, "", 0);
  }
}
