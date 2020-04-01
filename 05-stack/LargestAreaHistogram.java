import java.util.*;
public class LargestAreaHistogram{


  public int largestAreaHistogram(int hist[]){
    int tp;
    int i = 0;
    int area;
    int max_area = 0;
    int n = hist.length;
    ArrayDeque<Integer> st = new ArrayDeque<Integer>();

    while(i < n){
      if(st.isEmpty() || hist[i] >= hist[st.peek()]){
        st.push(i++);
      }else{
        tp = st.pop();
        if(st.isEmpty()){
          area = hist[tp] * i;
        }else{
          area = hist[tp] * (i-st.peek()-1);
        }
        max_area = Math.max(area, max_area);
      }
    }
    while(!st.isEmpty()){
      tp = st.pop();
      if(st.isEmpty()){
        area = hist[tp] * i;
      }else{
        area = hist[tp] * (i-st.peek()-1);
      }
      max_area = Math.max(area, max_area);
    }
    return max_area;
  }

  public static void main(String[] args) {
    int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
    LargestAreaHistogram lah = new LargestAreaHistogram();
    System.out.println(lah.largestAreaHistogram(hist));
  }
}
