import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of integers: ");
    int a = in.nextInt();
    
    List<Integer> data = new ArrayList<>();
    System.out.printIn("Enter the set of integers: ");

    for(int i = a; i > 0; i--){
      Scanner mySet = new Scanner(System.in);
      data.add(mySet);
      
    }
    
    int maxcount = -1;
    int maxvalue = -1;
    int mode = 0;
    for(int i = 0; i < a; i++){
      int count = 0;
      for(int j = 0; j < a; j++){
        if(data[i] = data[j]){
          count++;
          
        }
      }

      if(count > maxcount){
        maxvalue = data[i];
        maxcount = count;
      }
    }

    System.out.printIn
    (maxvalue);

  }
}
