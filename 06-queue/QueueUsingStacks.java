import java.util.*;
public class QueueUsingStacks{

  private ArrayDeque<Integer> s1 ;
  private ArrayDeque<Integer> s2 ;

  public QueueUsingStacks(){
    s1 = new ArrayDeque<Integer>();
    s2 = new ArrayDeque<Integer>();
  }

  public void enqueue(int data){
    s1.push(data);
  }

  public int dequeue(){
    if(s1.isEmpty() && s2.isEmpty()){
      System.out.println("stack underflow");
      return 0;
    }
    if(s2.isEmpty()){
      while(!s1.isEmpty()){
        s2.push(s1.pop());
      }
    }
    return s2.pop();
  }

  public static void main(String[] args) {
    QueueUsingStacks que = new QueueUsingStacks();
    que.enqueue(1);
    que.enqueue(2);
    que.enqueue(3);
    System.out.println(que.dequeue());
    que.enqueue(4);
    que.enqueue(5);
    System.out.println(que.dequeue());
    System.out.println(que.dequeue());
    System.out.println(que.dequeue());
    System.out.println(que.dequeue());
  }

}
