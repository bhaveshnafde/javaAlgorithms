/*
push : add the element to store.
pop : transfer all element except last to transfer queue,
      then dequeue and store the last element. and then
      swap the queues.
*/
import java.util.*;
public class StackUsingQueues{
  Queue<Integer> store = new LinkedList<Integer>();
  Queue<Integer> transfer = new LinkedList<Integer>();

  void push(int data){
    store.add(data);
  }

  int pop(){
    int len = store.size();
    while(--len>0){
      transfer.add(store.remove());
    }
    int temp = store.remove();
    Queue<Integer> x = transfer;
    transfer = store;
    store = x;
    return temp;
  }

  public static void main(String[] bhavesh) {
    StackUsingQueues st = new StackUsingQueues();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());
  }
}
