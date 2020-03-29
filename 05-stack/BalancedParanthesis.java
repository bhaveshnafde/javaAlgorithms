import java.util.*;
public class BalancedParanthesis{
  public static void main(String bhavesh[]) throws Exception{
    ArrayDeque<Character> st = new ArrayDeque<Character>();
    String strr = "{}(";
    char ch[] = strr.toCharArray();
    boolean is_balanced = true;
    for(char c : ch){
      if(c == '{' || c == '[' || c == '('){
        st.push(c);
        continue;
      }
      if(c == ')' && st.peek() == '('){
        st.pop();
      }
      else if(c == '}' && st.peek() == '{'){
        st.pop();
      }
      else if(c == ']' && st.peek() == '['){
        st.pop();
      }else{
        is_balanced = false;
        break;
      }
    }
    if(is_balanced){
      System.out.println("balanced");
    }else{
      System.out.print("unbalanced");
    }
  }
}
