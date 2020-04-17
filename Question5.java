import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
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
