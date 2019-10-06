import java.util.Scanner;

class Bitwise{
  int x;
  
  public Bitwise(){
    x=0;
  }
  
  public void Encender(int position){
    int mask = 1;
    mask = mask << position -1;
    x = x | mask;
  }
  
  public void Apagar(int position){
    int mask = 1;
    mask = mask << position -1;
    mask = ~ mask;
    x = x & mask;
  }
  
  public int GetBit(int position){
    int mask = 1;
    mask = mask << position -1;
    mask = mask & x;
    mask = mask >>> position -1;
    return mask;
  }
  
 // System.out.println("Funciona");
  
   public static void main(String args[]) {
      int a = 60;	/* 60 = 0011 1100 */
      int b = 13;	/* 13 = 0000 1101 */
      int c = 0;

      c = a & b;        /* 12 = 0000 1100 */
      System.out.println("a & b = " + c );

      c = a | b;        /* 61 = 0011 1101 */
      System.out.println("a | b = " + c );

      c = a ^ b;        /* 49 = 0011 0001 */
      System.out.println("a ^ b = " + c );

      c = ~a;           /*-61 = 1100 0011 */
      System.out.println("~a = " + c );

      c = a << 2;       /* 240 = 1111 0000 */
      System.out.println("a << 2 = " + c );

      c = a >> 2;       /* 15 = 1111 */
      System.out.println("a >> 2  = " + c );

      c = a >>> 2;      /* 15 = 0000 1111 */
      System.out.println("a >>> 2 = " + c );
   }
}
