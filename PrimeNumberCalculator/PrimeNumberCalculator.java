import java.util.*;

public class PrimeNumberCalculator{

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an upper limit to print prime integers");
    int x = in.nextInt();
    PrimeNumberCalculator.PrintPrimeNumbers(x);                    
  }
  
  //Check if an integer is indeed a prime number
  public static boolean isPrime(int x)
  {
    if(x <= 0) return false;
    if(x == 1) return false;
    for(int i = 2; i < x; i++){
      if(x % i == 0){
      	return false;
      }
    }
    return true;
  }
  
  //Print all prime numbers up to a given upper limit
  public static void PrintPrimeNumbers(int upperLimit)
  {
    for(int i = 1; i <= upperLimit; i++){
      if(isPrime(i)){
        System.out.print(i + ", ");
      }
  	}
  }
}
