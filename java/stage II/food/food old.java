/**<h1>Project Title: Groceries</h1>
*<b>Purpose of Project:</b><br>
*<p>Class Design</p>
*<b>How to start the project instructions:</b><br>
*<p>In CMD</p>
*<b>User Instructions:<b/><br>
*<p>Does not use args[]</P>
*<br>
*@author Ibrahim Chehimi
*@version 1
*@since 2017-12-08
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class food {
  /**<b>Class Description: Driver Class</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  public String printMoney(double money){
	 String pM = String.format("$%.2f", money);
	 System.out.println(pM);
   return pM;
  }

  public int StringDecInt(String userNum1){
    String apples2 = "";
    Double apples_double = 0.0;
    Integer apples_int = 0;

    try{
      apples_double = Double.parseDouble(userNum1);
      apples_double = 0.0;
    }
    catch(NumberFormatException ne3){
    System.out.println("User has failed first attempt entering" +
    "an integer for apples.");
    apples2 = JOptionPane.showInputDialog("Enter a number in numeric form.");
    }




    try{
      apples_double = Double.parseDouble(apples2);
      apples_double = 0.0;
      apples1 = apples2;
    }
    catch(NumberFormatException ne4){
      System.out.println("User has failed the second attempt.");
      JOptionPane.showMessageDialog(null, "You've failed to enter a number. Restart the program.", "User input error", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }



    if(apples_double == 0.0){
      try{
         System.out.println("Second attempt granted.");
         apples_int = Integer.parseInt(userNum1);
         //apples1 = apples2;
         System.out.println("Second attempt successful."+
         "and variables reassigned.");
         apples_double = 0.0;
      }
      catch(NumberFormatException ne5){
         System.out.println("User failed second attempt for an integer value for apples.");
         JOptionPane.showMessageDialog(null, "Failure to enter a whole number. Restart the program.", "User input error", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
      }




      try{
        System.out.println("User entered a double or integer for the number of apples.");
        apples_int = Integer.parseInt(apples1);
        System.out.println("User entered an integer for number of apples.");
      }


      catch(NumberFormatException ne6){
        System.out.println("User entered a decimal value, not an integer.");
        apples2 = JOptionPane.showInputDialog("Error: User entered a decimal.\n Please enter a whole number.");
        apples1 = apples2;
        try{
          System.out.println("User's second attempt at entering an integer.");
          apples_int = Integer.parseInt(apples2);
          apples_double = 0.0;
        }
        catch(NumberFormatException ne7){
          System.out.println("User is stupid.");
          JOptionPane.showMessageDialog(null, "User failed to input a whole number.\n Restart the program.", "User input error", JOptionPane.ERROR_MESSAGE);
          System.exit(0);
        }
      }
    }
  }












  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

   public static void main(String[] args)
   throws NumberFormatException
   {
     food obj = new food();

     String moneyYouHave_string1 = JOptionPane.showInputDialog ("Tell me how much " +
            "money you have.\n Please enter only dollars and cents, \n" +
            "For Example: \'\'14.50\'\'");
     Double moneyYouHave_double = 0.00;

     try{
       moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
     }
     catch (NumberFormatException ne1) {
       System.out.println ("Please enter a dollars and cents value\n" +
                           "For example: \'14.50\'");
       String moneyYouHave_string2 = JOptionPane.showInputDialog ("Please " +
               "enter a dollars and cents value\n" +
               "For example: \'\'14.50\'\'");
       try {
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println ("User failed a second attempt for " +
                            "the total money to spend");
        JOptionPane.showMessageDialog (null, "Please restard the program", "Second attempt failed.", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
       }
     }

     double totalMoneyIn = moneyYouHave_double;

     if(moneyYouHave_double == Math.abs(0.0)){
       JOptionPane.showMessageDialog(null, "Please restart the program", "Invalid statement", JOptionPane.ERROR_MESSAGE);
       System.out.println("USer failed to enter a total amount "+
                          "of money speant.");
       System.exit(0);
     } else {
       System.out.println("USer entered: " + totalMoneyIn);
       JOptionPane.showMessageDialog(null, "You've entered: "+ obj.printMoney(totalMoneyIn), "Money Entered", JOptionPane.INFORMATION_MESSAGE);
     }

     System.out.println("User enters a number of apples");
     String apples1 = JOptionPane.showInputDialog("Fill the box with however many apples as you wish."); //decimal, integer, string, 0
     Double apples_double = 0.0;
     //String apples1 = "";
     String apples2 = "";
     Integer apples_int = 0;
     try{
       apples_double = Double.parseDouble(apples1);
       apples_double = 0.0;
     }
     catch(NumberFormatException ne3){
     System.out.println("User has failed first attempt entering" +
     "an integer for apples.");
     String apples2 = JOptionPane.showInputDialog("Enter a number in numeric form.");
     }

     try{
       apples_double = Double.parseDouble(apples2);
       apples_double = 0.0;
       apples1 = apples2;
     }
     catch(NumberFormatException ne3){
       System.out.println("User has failed the second attempt.");
       JOptionPane.showMessageDialog(null, "You've failed to enter a number. Restart the program.", "User input error", JOptionPane.ERROR_MESSAGE);
       System.exit(0);
     }

     if(apples_double == 0.0){
       try{
          System.out.println("Second attempt granted.");
          apples_int = Integer.parseInt(apples2);
          apples1 = apples2;
          System.out.println("Second attempt successful."+
          "and variables reassigned.");
          apples_double = 0.0;
       }
       catch(NumberFormatException ne5){
          System.out.println("User failed second attempt for an integer value for apples.");
          JOptionPane.showMessageDialog(null, "Failure to enter a whole number. Restart the program.", "User input error", JOptionPane.ERROR_MESSAGE);
          System.exit(0);
       }
       try{
         System.out.println("User entered a double or integer for the number of apples.");
         apples_int = Integer.parseInt(apples1);
         System.out.println("User entered an integer for number of apples.");
       }
       catch(NumberFormatException ne6){
         System.out.println("User entered a decimal value, not an integer.");
         apples2 = JOptionPane.showInputDialog("Error: User entered a decimal.\n Please enter a whole number.");
         try{
           System.out.println("User's second attempt at entering an integer.");
           apples_int = Integer.parseInt(apples2);
           apples_double = 0.0;
         }
         catch(NumberFormatException ne7){
           System.out.println("User is stupid.");
           JOptionPane.showMessageDialog(null, "User failed to input a whole number.\n Restart the program.", "User input error", JOptionPane.ERROR_MESSAGE);
           System.exit(0);
         }
       }
       System.out.println("This is the end of the try & catch for Apples.");
       System.out.println(apples_int);
       System.out.println(apples_double);
       System.out.println(apples1);
       System.out.println(apples2);
     }
   }
 }
