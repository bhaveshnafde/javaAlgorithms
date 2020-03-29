import java.util.*;
public class PostfixEvaluation{
  public static int postfixEvaluation(String ss){
    ArrayDeque<Integer> st = new ArrayDeque<Integer>();
    for(int i = 0; i < ss.length(); i++){
      char ch = ss.charAt(i);
      if(Character.isDigit(ch)){
        st.push(ch - '0');
      }else{
        int b = st.pop();
        int a = st.pop();
        if(ch == '+')
          st.push(a+b);
        if(ch == '-')
          st.push(a-b);
        if(ch == '*')
          st.push(a*b);
        if(ch == '/')
          st.push(a/b);
      }
      System.out.println(st);
    }
    if(st.size() == 1){
      return st.pop();
    }else{
      return 0;
    }
  }
  public static void main(String bhavesh[]){
    String ss = "231*+9-";
    System.out.println(postfixEvaluation(ss));
  }
}
