import java.util.Scanner;

public class rollTheDice{
  static Scanner input = new Scanner (System.in);
  public static void main (String [] args){
    int m = input.nextInt();
    int n = input.nextInt();
    
    int counter = 0;
    for (int i = 1; i <= m ; i++){
      for (int a = 1; a <= n; a++){
        if (i + a == 10){
          counter++;
          a = n+1;
        }
      }
    }
      
    if (counter == 1){
      System.out.println ("There is 1 way to get the sum 10.");
    }
    else{
    System.out.println ("There are " + counter + " ways to get the sum 10.");
    }
  }
}
