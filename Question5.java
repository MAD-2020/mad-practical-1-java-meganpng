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
    

    for(int i = a; i > 0; i--){
      Scanner mySet = new Scanner(System.in);
      int b = mySet.nextInt();
      data.add(b);
      
    }
    
    int maxcount = -1;
    int maxvalue = -1;
    
    for(int i = 0; i < a; i++){
      int count = 0;
      for(int j = 0; j < a; j++){
        if(data.get(i) == data.get(j)){
          count++;
          
        }
      }

      if(count > maxcount){
        maxvalue = data.get(i);
        maxcount = count;
      }
    }

    System.out.println
    (maxvalue);

  }
}
