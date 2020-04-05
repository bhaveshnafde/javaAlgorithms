import java.util.*;
public class QueueReversal{

  static ArrayDeque<Integer> st = new ArrayDeque<Integer>();

  public static void reverse(Queue<Integer> que){
    while(!que.isEmpty()){
      st.push(que.remove());
    }
    while(!st.isEmpty()){
      que.add(st.pop());
    }
  }

  public static void main(String[] bhavesh) {
    Queue<Integer> que = new LinkedList<Integer>();
    que.add(1);
    que.add(2);
    que.add(3);
    que.add(4);
    que.add(5);
    System.out.println(que);
    reverse(que);
    System.out.println(que);
  }
}
