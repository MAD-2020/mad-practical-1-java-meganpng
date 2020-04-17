import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
     
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    int a = in.nextInt();
    
    for(int i = a; i > 0; i--){
      for(int j = i; j > 0; j--){
        System.out.print("*");
        
        
      }
      System.out.println();

      
    }

  }
}
