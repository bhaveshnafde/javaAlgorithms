public class RemainingList
{
    private Node head;
    private int length;

    public RemainingList(){
      this.head = null;
      this.length = 0;
    }

    public void insertAtEnd(int data){
      Node toInsert = new Node(data);
      Node temp = head;
      if(head == null){
        head = toInsert;
      }else{
        while(temp.next != null){
          temp = temp.next;
        }
        temp.next = toInsert;
      }
      length++;
    }

    public void print(){
      Node temp = head;
      while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
      }System.out.println();
    }

    private class Node{
      private int data;
      private Node next;

      public Node(int data){
        this.data = data;
        this.next = null;
      }
    }
    //6 -6 8 4 -12 9 8 -8
    public void remove()
    {
      Node Head = new Node(0);
      Head.next=head;
      Node cur=Head;
      while(cur!=null)
      {
        int sum=0;
        while(head!=null)
        {
          sum+=head.data;
          if(sum==0)
          {
           cur.next=head.next;
          }
          head=head.next;
        }
        cur=cur.next;
        if(cur!=null)
        {
          head=cur.next;
        }
      }
      head = Head.next;
    }

    public static void main(String bhavesh[]){
      RemainingList sll;
      sll = new RemainingList();
      sll.insertAtEnd(6);
      sll.insertAtEnd(-6);
      sll.insertAtEnd(8);
      sll.insertAtEnd(4);
      sll.insertAtEnd(-12);
      sll.insertAtEnd(9);
      sll.insertAtEnd(8);
      sll.insertAtEnd(-8);
      sll.print();
      sll.remove();
      sll.print();
    }

}
