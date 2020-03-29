import java.util.*;
public class BalancedParanthesis{

public static void main(String []argh)
{
	Scanner sc = new Scanner(System.in);
  ArrayDeque<Character> st = new ArrayDeque<Character>();
	String input=sc.next();
  char ch[] = input.toCharArray();
  boolean is_balanced = true;

  for(char c : ch){
      if(c == '{' || c == '[' || c == '('){
          st.push(c);
      }else{
          if(st.isEmpty()){
              is_balanced = false;
              break;
          }
          if(c == ')'){
              if(st.peek() == '('){
              st.pop();
          }else{
              is_balanced = false;
              break;
          }
          }else if(c == '}'){
              if(st.peek() == '{'){
              st.pop();
          }else{
              is_balanced = false;
              break;
          }
          }else if(c == ']'){
              if(st.peek() == '['){
              st.pop();
          }else{
              is_balanced = false;
              break;
          }
      }


    }

    }
    if(is_balanced && st.isEmpty()){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
  }
}
