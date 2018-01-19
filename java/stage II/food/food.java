/**<h1>Project Title: Groceries</h1>
*<b>Purpose of Project:</b><br>
*<p>Class Design</p>
*<b>How to start the project instructions:</b><br>
*<p>In CMD</p>
*<b>User Instructions:<b/><br>
*<p>Does not use args[]</P>
*<br>
*@author Mark Mercer
*@version 1
*@since 2017-12-08
*/

import java.util.Scanner; //Must import this
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

  public int stringDecInt(String userInput){
    String foodString = "";
    String food2String = "";
    Double foodDouble = 0.0;
    Integer foodInt = 0;
    try {
      foodDouble = Double.parseDouble(userInput);
      foodDouble = 0.0;
    }
    catch(NumberFormatException ne3){
      System.out.println("User didn't enter a proper value for apples.");
      food2String = JOptionPane.showInputDialog("Request amount of apples to purchase.\nExample: \'1\'");
      try {
        foodDouble = Double.parseDouble(food2String);
        foodDouble = 0.0;
        foodString = food2String;
      }
      catch(NumberFormatException ne4){
        System.out.println("User didn't enter a proper value for apples twice.");
        JOptionPane.showMessageDialog(null, "User failed to enter a whole number value\nfor amount of apples to purchase.\nPlease restart the program.", "User Input Error", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
      }
    }
    if(foodDouble == 0.0){ //
      try {
        System.out.println("Prompt user to enter a value for apples again.");
        foodInt = Integer.parseInt(foodString);
        System.out.println("Second attempt at entering a whole number successful.");
        foodDouble = 0.0;
      }
      catch(NumberFormatException ne5){
        System.out.println("User didn't enter a proper value for apples twice.");
        JOptionPane.showMessageDialog(null, "User failed to enter a whole number value\nfor amount of apples to purchase.\nPlease restart the program.", "User Input Error", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
      }
    }
    try {
      System.out.println("User entered a double or integer for the number of apples.");
      foodInt = Integer.parseInt(foodString);
      System.out.println("User entered an int for the number of apples");
    }
    catch(NumberFormatException ne6){
      System.out.println("User entered a decimal value. Enter an int");
      food2String = JOptionPane.showInputDialog("Error: User entered a decimal value.\nPlease enter a whole number value.\nExample: \'1\'");
      foodString = food2String;
      try {
        System.out.println("User's second attempt at entering int");
        foodInt = Integer.parseInt(foodString);
        foodDouble = 0.0;
      }
      catch(NumberFormatException ne7){
        System.out.println("User failed to enter a whole number value twice.");
        JOptionPane.showMessageDialog(null, "User failed to enter a whole number value.\nPlease restart the program.", "User Input Error", JOptionPane.ERROR_MESSAGE);

        System.exit(0);
      }
    }
  return foodInt;
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

     String userMoneyString = JOptionPane.showInputDialog("Enter amount of money to spend\nExample: \'19.95\'$");
     Double userMoneyDouble = 0.00;

     try {
         userMoneyDouble = Double.parseDouble(userMoneyString);
     }
     catch(NumberFormatException ne1){
         System.out.println("User didn't enter a proper value.");
         String userMoney2String = JOptionPane.showInputDialog("Please enter a decimal value for\namount of money to spend.\nExample: \'19.95\'$");
         try {
           userMoneyDouble = Double.parseDouble(userMoney2String);
         }
         catch(NumberFormatException ne2){
           System.out.println("User didn't enter a proper value twice.");
           JOptionPane.showMessageDialog(null, "User failed to enter a decimal value\nPlease restart the program", "User Input Error", JOptionPane.ERROR_MESSAGE);
           System.exit(0);
         }
       }

       double moneyTotal = userMoneyDouble;
       if(userMoneyDouble == Math.abs(0.0)){
         System.out.println("User didn't enter a proper value twice.");
         JOptionPane.showMessageDialog(null, "User failed to enter a decimal value\nPlease restart the program", "User Input Error", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
       } else {
         System.out.println("User entered: " + moneyTotal);
         JOptionPane.showMessageDialog(null, "Amount entered: " + obj.printMoney(moneyTotal), "User Input Confirmation", JOptionPane.INFORMATION_MESSAGE);
       }

  System.out.println("User enters a number of objects.");
  String userString = JOptionPane.showInputDialog("Please enter how many whole objects you would like.");
  String foodString = "";
  Integer foodInt = 0;
  Double foodDouble = 0.0;

  foodString = obj.stringDecInt(userString);
/*
  try {
    foodDouble = Double.parseDouble(userString);
    foodDouble = 0.0;
  }
  catch(NumberFormatException ne3){
    System.out.println("User has failed first attempt entering an integer for objects.");
    foodString = JOptionPane.showInputDialog("Please enter how many apples you would like.\nExample: \'1\' ");
    try {
      foodDouble = Double.parseDouble(foodString);
      foodDouble = 0.0;
      userString = foodString;
    }
    catch(NumberFormatException ne4){
      System.out.println("User has failed the 2nd attempt.");
      JOptionPane.showMessageDialog(null, "Please restart the program and enter a whole number.\nEexample \'1\'", "User Input Error", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }
  */
  if(foodDouble == 0){
    try {
      System.out.println("Second attempt might be successful");
      foodInt = Integer.parseInt(userString);
      System.out.println("Second attempt successful " +
            "and variables reassigned.");
      foodDouble = 0.0;
    }
    catch(NumberFormatException ne5){
      System.out.println("User didn't enter a proper value for apples twice.");
      JOptionPane.showMessageDialog(null, "User failed to enter a whole number value\nfor amount of apples to purchase.\nPlease restart the program.", "User Input Error", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }
  try {
    System.out.println("User entered a double or integer for the number of apples.");
    foodInt = Integer.parseInt(userString);
    System.out.println("User entered an int for the number of apples");
  }
  catch(NumberFormatException ne6){
    System.out.println("User entered a decimal value, not an int.");
    foodString = JOptionPane.showInputDialog("It seems like you " +
           "have entered a decimal.\nPlease enter a whole number of " +
           "objects.\nFor example: \' 3 \' ");
    userString = foodString;
    try {
      System.out.println("User's second attempt at entering int");
      foodInt = Integer.parseInt(userString);
      foodDouble = 0.0;
    }
    catch(NumberFormatException ne7){
      System.out.println("User failed second attempt, exit program.");
      JOptionPane.showMessageDialog(null, "Please restart the the program and \nenter a whole number of objects.", "User Input Error", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }

  System.out.println("End of try catch for objects");
  System.out.println(foodInt);
  System.out.println(foodDouble);
  System.out.println(userString);
  System.out.println(foodString);

  }
}
