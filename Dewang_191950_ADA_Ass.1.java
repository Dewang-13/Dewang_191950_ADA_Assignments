import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int a=0;  //1
      int b=1;  //2
      
      for(int i=1;i<=n;i++)  //3 to n
      {
          System.out.println(a);
          int c=a+b;
          a=b;
          b=c;
      }
      
   }
  }