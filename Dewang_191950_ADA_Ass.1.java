import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      //Fibonnaci Series: 0 1 1 2 3 5 8 13 21...
      int a=0;  //1term
      int b=1;  //2term
      
      for(int i=1;i<=n;i++)  //3 to n
      {
          System.out.println(a);
          int c=a+b;//3rd term
          a=b;//storing value of 2nd term into 1st term
          b=c;//storing value of 3rd term into 2nd term
      }
      
   }
  }
