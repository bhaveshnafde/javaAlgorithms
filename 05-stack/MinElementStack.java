// int this optimized algo we return the min element of stack in o(1) time
import java.util.*;
public class MinElementStack{
  ArrayDeque<Integer> st;
  ArrayDeque<Integer> min;

  public MinElementStack(){
    this.st = new ArrayDeque<Integer>();
    this.min = new ArrayDeque<Integer>();
  }

  public void push(int ele){
    if(st.isEmpty() || ele <= min.peek()){
      min.push(ele);
      st.push(ele);
    }else{
      st.push(ele);
    }
  }
  public int pop(){
    if(st.isEmpty()){
      System.out.println("stack underflow");
      return 0;
    }
    int pop = st.pop();
    if(pop == min.peek()){
      min.pop();
    }
    return pop;
  }
  public int min(){
    return min.peek();
  }
  public static void main(String bhavesh[]){
    MinElementStack stk = new MinElementStack();
    stk.push(2);
    stk.push(6);
    stk.push(4);
    stk.push(1);
    stk.push(5);
    stk.push(1);
    stk.pop();
    stk.pop();
    System.out.println(stk.st);
    System.out.println(stk.min);
    System.out.println(stk.min());
  }
}
