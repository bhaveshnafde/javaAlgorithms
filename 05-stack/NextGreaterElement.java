/*
    problem : we want to find next greater element for each element in the array,
            if not found we mark it as -1.
    solution : we maintain a stack which basically holds the element whose next greater element is not yet found,
            for each element we look in the stak if a the element is NGE of the element in stack,
            if found we pop it from stack and do the same for remaining elements in stack,
            after that we push the NGE into stack. after going through all elements the remains elements's
            NGE will be -1.
*/
import java.util.*;
public class NextGreaterElement{
  public static void main(String[] bhavesh) {
    int arr[] = { 11, 13, 21, 3 };
    ArrayDeque<Integer> st = new ArrayDeque<Integer>();
    st.push(arr[0]);
    for(int i = 1; i < arr.length; i++){
      if(arr[i] > st.peek()){
        while(!(st.isEmpty()) && arr[i] > st.peek()){
          int temp = st.pop();
          System.out.println(temp+" --> "+arr[i]);
        }
        st.push(arr[i]);
      }else{
        st.push(arr[i]);
      }
    }
    while(!(st.isEmpty())){
      System.out.println(st.pop()+" --> -1");
    }
  }
}
