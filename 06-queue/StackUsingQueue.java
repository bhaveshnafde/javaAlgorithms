import java.util.*;
public class StackUsingQueue{
  public static void enqueue(Queue<Integer> que, int data){
    que.add(data);
    int i = que.size();
    while(--i>0){
      int temp = que.remove();
      que.add(temp);
    }
  }

  public static void main(String[] args) {
    Queue<Integer> que = new ArrayDeque<Integer>();
    que.add(1);
    que.add(2);
    enqueue(que,3);
    enqueue(que,4);
    enqueue(que,5);

    System.out.println(que.remove());
    System.out.println(que.remove());
    System.out.println(que.remove());
    System.out.println(que.remove());
    System.out.println(que.remove());

  }
}
