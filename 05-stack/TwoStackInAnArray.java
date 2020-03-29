public class TwoStackInAnArray{
  int size;
  int top1, top2;
  int arr[];

  public TwoStackInAnArray(int n){
    size = n;
    this.arr = new int[size];
    top1 = -1;
    top2 = n;
  }

  public  boolean push1(int data){
    if(top1 < top2 - 1){
      arr[++top1] = data;
      return true;
    }
    System.out.println("Stack1 Overflow");
    return false;
  }

  public  boolean push2(int data){
    if(top1 < top2 - 1){
      arr[--top2] = data;
      return true;
    }
    System.out.println("Stack2 Overflow");
    return false;
  }

  public  int pop1(){
    if(top1 >= 0){
      return arr[top1--];
    }
    System.out.println("Stack1 Underflow");
    return -1;
  }

  public  int pop2(){
    if(top2 < size){
      return arr[top2++];
    }
    System.out.println("Stack2 Underflow");
    return -1;
  }

  public static void main(String bhavesh[]){
    TwoStackInAnArray st = new TwoStackInAnArray(5);
    st.push1(1);
    st.push1(11);
    st.push1(111);
    st.push2(9);
    st.push2(99);

    System.out.println(st.pop1());
    System.out.println(st.pop1());
    System.out.println(st.pop1());
    System.out.println(st.pop2());
    System.out.println(st.pop2());

  }

}
