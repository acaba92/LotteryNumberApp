package net.javavideotutorials.assignment1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumberGenerator 
{

  /**
   * This method should return a Set of 6 different
   * integers.  
   * 
   * Hint: use the 'Random' class located here: java.util.Random
   *       to generate random numbers
   * @return
   */
  public Set<Integer> generateLotteryNumbers ()
  {
    
    System.out.println("GENERATING LOTTO NUMBERS...");
    
    Random rNumber = new Random();
    Set<Integer> lNumber = new HashSet<Integer>();
    
    for(int i = 0; i < 6; i++)
    {
      if(lNumber.add(rNumber.nextInt(48) + 1))
        {
        System.out.println("i = " + i);
          // continue to run
        }
      else
        {
        System.out.println("i = " + i + " error, decrement i by one");
          i--;
        System.out.println("i = " + i);
        }
    }
    
    System.out.println("LOTTO NUMBER GENERATED...");
    
    return lNumber;
    
  }
}
