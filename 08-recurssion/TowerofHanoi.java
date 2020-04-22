public class TowerofHanoi{

  public static void shiftFromAtoCusingB(int n, char a, char b, char c){
    if(n==1){
      System.out.println("1 moves from "+a+" to "+c);
      return;
    }

    shiftFromAtoCusingB(n-1, a, c, b);
    System.out.println(n+" moves from "+a+" to "+c);
    shiftFromAtoCusingB(n-1, b, a, c);
  }

  public static void main(String[] args) {
    shiftFromAtoCusingB(3, 'a', 'b', 'c');
  }
}

/*
0
00
000

00
000      0


000  00  0

     0
000  00

     0
     00 000

(n-1)A to B using C

0    00 000

(1)A to C
        00
0       000

       0
       00
       000
*/
