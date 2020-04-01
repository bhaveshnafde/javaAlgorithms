import java.util.*;
public class SortStackRecursion{

  public void sort(ArrayDeque<Integer> st){
    //System.out.println(st);

    if(st.isEmpty()){
      return;
    }
    int temp = st.pop();
    sort(st);
    insertAtPos(st, temp);
  }

  public void insertAtPos(ArrayDeque<Integer> st, int temp){
    //System.out.println(st);
    if(st.isEmpty() || temp > st.peek()){
      st.push(temp);
      return;
    }
    int tp = st.pop();
    insertAtPos(st, temp);
    st.push(tp);
  }

  public static void main(String[] bhavesh) {
    ArrayDeque<Integer> st = new ArrayDeque<Integer>();
    SortStackRecursion srt = new SortStackRecursion();
    st.push(3);
    st.push(5);
    st.push(1);
    st.push(2);
    st.push(4);
    System.out.println(st);
    srt.sort(st);
    System.out.println(st);
  }
}
