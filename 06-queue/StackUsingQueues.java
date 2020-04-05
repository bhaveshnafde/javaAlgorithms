import java.util.*;
public class StackUsingQueues{
  static Queue<Integer> q2 = new LinkedList<Integer>();
  static Queue<Integer> q1 = new LinkedList<Integer>();

  public static void enqueue(int data){
    q2.add(data);
    int i = q1.size();
    while(!q1.isEmpty()){
      q2.add(q1.remove());
    }
    Queue<Integer> temp = q1;
    q1 = q2;
    q2 = temp;
  }

  public static void main(String[] bhavesh) {
    q1.add(1);
    q1.add(2);
    q1.add(3);
    enqueue(4);
    System.out.println(q1.remove());
    System.out.println(q1.remove());
    System.out.println(q1.remove());
    System.out.println(q1.remove());
  }
}
