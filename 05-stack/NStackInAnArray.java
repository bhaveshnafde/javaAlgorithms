  public class NStackInAnArray{
  int arr[];
  int top[];
  int next[];
  int free;

  public NStackInAnArray(int n, int k){
    arr = new int[n];
    top = new int[k];
    next = new int[n];
    free = 0;
    for(int i = 0; i < k; i++){
      top[i] = -1;
    }
    for(int i = 0; i < n-1; i++){
      next[i] = i+1;
    }
    next[n-1] = -1;
  }

  public void push(int st, int data){
    int i = free;
    free = next[i];
    next[i] = top[st];

    top[st] = i;
    arr[i] = data;
  }

  public void pop(int st){
      int i = top[st];
      top[st] = next[i];
      next[i] = free;
      free = i;
      System.out.println(arr[i]+" is popped from stack "+st);
  }

  public void print(){
    System.out.println(free);
    for(int i = 0; i < top.length; i++){
      System.out.print(top[i]+" ");
    }
    System.out.println();
    for(int i = 0; i < next.length; i++){
      System.out.print(next[i]+":"+i+" ");
    }
    System.out.println();
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]+":"+i+" ");
    }
  }

  public static void main(String bhavesh[]){
    NStackInAnArray st = new NStackInAnArray(15,3);
    st.push(0,99);
    st.push(0,88);
    st.push(2,9999);
    st.push(0,77);
    st.push(1,888);
    st.push(2,7777);
    st.push(1,999);
    st.push(1,555);
    st.push(1,222);
    st.push(2,1111);
    st.push(2,4444);
    st.print();

    st.pop(1);
st.print();
    // st.pop(0);
    // st.pop(0);
    // st.pop(2);
    // st.pop(2);
    //
    // st.pop(2);
    // st.pop(2);
    // st.pop(1);
    // st.pop(1);
    // st.pop(1);
    // st.pop(1);
    //
    // st.push(2,3333);
    // st.push(0,33);
    // st.push(1,111);
    // st.push(2,2222);
    // st.push(1,333);
    // st.print();
    // st.pop(2);
    // st.pop(2);
    // st.pop(1);
    // st.pop(1);
    // st.pop(0);
  }

}
