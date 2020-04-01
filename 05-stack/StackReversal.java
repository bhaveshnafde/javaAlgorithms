import java.util.ArrayDeque;
public class StackReversal{

    public static void reverseStack(ArrayDeque<Integer> st){
      if(st.isEmpty()){
        return ;
      }
      int data = st.pop();
      reverseStack(st);
      insertAtBottom(st, data);
    }

    public static void insertAtBottom(ArrayDeque<Integer> st, int data){
      if(st.isEmpty()){
        st.push(data);
        return ;
      }
      int temp = st.pop();
      insertAtBottom(st, data);
      st.push(temp);
    }

    public static void main(String[] args) {
      ArrayDeque<Integer> st = new ArrayDeque<Integer>();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      System.out.println(st);
      reverseStack(st);
      System.out.println(st);
    }
}
