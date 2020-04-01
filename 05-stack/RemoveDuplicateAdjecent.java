import java.util.*;
class RemoveDuplicateAdjecent{

  public static void remove(ArrayList<Character> ll){
    System.out.println(ll);
    if(ll.isEmpty() || ll.size() == 1){
      return;
    }
    if(ll.get(0) == ll.get(1)){
      ll.remove(i);
      remove(ll);
    }
      remove(ll.sublist(1));

  }

  public static void main(String[] args) {
    String ss = "mississippi";
    char s[] = ss.toCharArray();
    remove(s);
    for (char c : s) {
      System.out.println(c);
    }
  }
}
