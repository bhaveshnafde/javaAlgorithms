import java.util.*;
public class StackUsingQueue{


  public void push(ArrayDeque<Integer> que, int ele){
    if(que.isEmpty()){
      return;
    }
    int temp = que.pop();
    push(que, temp);
    insertAtBottom(que, temp);
  }

  public void insertAtBottom(ArrayDeque<Integer> que, int ele){
    System.out.println(que);
    if(que.isEmpty()){
      que.push(ele);
      return;
    }
    int temp = que.pop();
    insertAtBottom(que, ele);
    que.push(temp);
  }

  public static void main(String[] args) {
    StackUsingQueue st = new StackUsingQueue();
    ArrayDeque<Integer> que = new ArrayDeque<Integer>();
    ArrayDeque<Integer> q1 = new ArrayDeque<Integer>();
    q1.addLast(3);
    q1.addLast(1);
    q1.addLast(4);
    q1.addLast(2);
    q1.addLast(5);

    st.push(que,3);
    st.push(que,1);
    st.push(que,4);
    st.push(que,2);
    st.push(que,5);
    System.out.println(q1);
    System.out.println(que);
  }
}
