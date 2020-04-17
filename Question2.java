import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner myheight = new Scanner(System.in);
    System.out.println("Please enter your height(in m): ");
    double height = myheight.nextDouble();

    Scanner myweight = new Scanner(System.in);
    System.out.println("Please enter your weight(in kg): ");
    double weight = myweight.nextDouble();
    double bmi = weight / (height * height);
    System.out.printIn("The height of the user is " + height + "m.");
    System.out.printIn("The weight of the user is " + weight + "kg.");
    System.out.println("The BMI of the user is "+bmi);

  }
}
