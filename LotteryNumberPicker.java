package net.javavideotutorials.assignment1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LotteryNumberPicker 
{

  /**
   * This method should pull input from the user in the console.  It should
   * gather 6 Integers from the user and then store these numbers in a Set of
   * Integers that will then be returned by the method.
   * cf
   * Hint: use the following code to get numbers:
   * 
   * Scanner in = new Scanner(System.in);
   * in.nextInt();
   * 
   * @return Set of 6 numbers that were chosen by the user
   * @throws IOException
   */
  public Set<Integer> promptUserForLotteryNumbers () throws IOException
  {
    
    System.out.println("SELECT 6 DIGIT LOTTO NUMBER.");
    
    Set<Integer> userLottoNum = new HashSet<Integer>();
    Scanner in;
    int userInput = 0;
    int i = 0;
    
    for(i = 0; i < 6; i++){
      
      System.out.println("ENTER DIGIT " + i + " AND HIT ENTER");
      
      in = new Scanner(System.in);
      userInput = in.nextInt();
      
      if(userInput > 0 && userInput < 50 && userLottoNum.add(userInput) == true ){
        //System.out.println("success, i = " + i);
      }
      else{
        i--;
        System.out.println("THE DIGIT " + userInput + " is invalid, please select another number.");
        //System.out.println("error, i = " + i);
      }
    }
    
    System.out.println("LOTTO NUMBER ACCEPTED.");
    
    return userLottoNum;
    
  }
}
