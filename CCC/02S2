import java.util.Scanner;

public class fractionAction {
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    
    if (num1 % num2 == 0){
      System.out.println (num1/num2);
    }
    else{
      int gcd = getGcd(num1,num2);
      if (num1 > num2){
        System.out.print (num1/num2);
        System.out.print (" " + (num1-((num1/num2)*num2))/gcd + "/" + num2/gcd);
      }
      else{
       System.out.print (num1/gcd + "/" + num2/gcd); 
    }
    }
  }
    
    public static int getGcd(int b, int d){
    int gcd = 1;

    if(b>d)
    {
        for(int i = d; i >=1; i--)
        {
            if(b%i==0 && d%i ==0)
            {
                return i;
            }
        }
    }
    else
    {
        for(int j = b; j >=1; j--)
        {
            if(b%j==0 && d% j==0)
            {
                return j;
            }
        }
    }   
    return gcd;

}
}
