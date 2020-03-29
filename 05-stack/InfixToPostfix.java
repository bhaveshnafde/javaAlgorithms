import java.util.*;
public class InfixToPostfix{

  public static int precedence(char c){
    switch(c){
      case '+' :
      case '-' :
        return 1;
      case '*' :
      case '/' :
        return 2;
      case '^' :
        return 3;
    }
    return -1;
  }

  public static String infixToPostfix(String exp){
    ArrayDeque<Character> st = new ArrayDeque<Character>();
    String result = "";
    for(int i = 0; i<exp.length(); i++){
      char c = exp.charAt(i);
      if(Character.isLetterOrDigit(c)){
        result+=c;
      }else{
        if(st.isEmpty()){
          st.push(c);
        }else if(c == '('){
          st.push(c);
        }else if(c == ')'){
          while(!st.isEmpty() && st.peek() != '('){
            result+=st.pop();
          }
          if (!st.isEmpty() && st.peek() != '('){
            return "Invalid Expression";
          }else{
            st.pop();
          }
        }else{
          while(!st.isEmpty() && precedence(st.peek()) >= precedence(c)){
            if(st.peek() == '(')
              return "Invalid Expression";
            result+=st.pop();
          }
          st.push(c);
        }
      }
    }
    while(!st.isEmpty()){
      if(st.peek() == '('){
        return "Invalid Expression";
      }
      result += st.pop();
    }
    return result;
  }

  public static void main(String bhavesh[]){
    String exp = "a+b*(c^d-e)^(f+g*h)-i";
    System.out.println(infixToPostfix(exp));
  }
}
