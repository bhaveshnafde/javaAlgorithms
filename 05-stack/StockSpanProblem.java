import java.util.*;
public class StockSpanProblem{
  static int[] stockSpan(int price[], int n, ArrayDeque<Integer> st){
    int span[] = new int[n];
    span[0] = 1;
    st.push(0);
    for (int i = 1; i < n; i++) {
      while(!st.isEmpty() && price[i] >= price[st.peek()]){
        st.pop();
      }
      if(st.isEmpty()){
        span[i] = i+1;
      }
      else{
        span[i] = i - st.peek();
      }
      st.push(i);
      System.out.print("\n"+st);
    }

    return span;
  }

  public static void main(String bhavesh[]){
    int price[] = { 10, 4, 5, 90, 120, 80 };
    ArrayDeque<Integer> st = new ArrayDeque<Integer>();
    for(int n : price){
      System.out.print(n+" ");
    }
    int span[] = stockSpan(price, price.length, st);
    System.out.println();
    for(int n : span){
      System.out.print(n+" ");
    }
  }
}
