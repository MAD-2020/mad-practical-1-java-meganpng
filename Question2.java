import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner myheight = new Scanner(System.in);
    
    double height = myheight.nextDouble();

    Scanner myweight = new Scanner(System.in);
    
    double weight = myweight.nextDouble();
    double bmi = weight / (height * height);
    System.out.printIn(height);
    System.out.printIn(weight);
    System.out.println(bmi);

  }
}
