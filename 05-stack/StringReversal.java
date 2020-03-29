import java.util.*;
public class StringReversal{
  public static void main(String bhavesh[]){
    String s = "abcdef";
    ArrayDeque<Character> adq = new ArrayDeque<Character>();
    for(int i = 0; i < s.length(); i++){
      adq.push(s.charAt(i));
    }
    String rev = "";
    for(int i = 0; i < s.length(); i++){
      rev += adq.pop();
    }
    System.out.println(rev);;
  }
}
