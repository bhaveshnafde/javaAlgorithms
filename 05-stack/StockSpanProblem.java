import java.util.*;
public class StockSpanProblem{
  public static void main(String[] bhavesh) {
    ArrayDeque<Integer> st = new ArrayDeque<Integer>();
    int price[] = { 10, 4, 5, 90, 120, 80 };
    int span[] = new int[price.length];
    for(int i = 0; i < price.length; i++){
      if(i == 0){
        st.push(price[i]);
        span[i] = 1;
      }else{
        if(st.peek() < price[i]){
          while(!(st.isEmpty()) && st.peek() < price[i]){
            st.pop();
          }
          span[i] = i - st.size() + 1;
          st.push(price[i]);
        }else{
          span[i] = 1;
          st.push(price[i]);
        }
      }
    }
    for(int i : span){
      System.out.print(i+ " ");
    }
  }
}
