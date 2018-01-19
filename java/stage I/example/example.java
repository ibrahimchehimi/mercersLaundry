/*
*<h1>Hello Wolrd</h1>
*<b>Purpose of the Project:</b><br>
*<p>Supply CMD line arguments and change strings into ints</p>
*<p>Working with CMD, file folers, and Atom</p><br>
*<b>How to start the program</b><br>
*<p>Use the Compiler and run the bytcode</p><br>
*<p>In CMD: $javac [ClassName].java;
then $java helloworld 10 20
any numbers will do</p>
*<b>User Instructions:</b><br>
*<p>Familiarize with routines of executing JAVA from CMD</p>

*<br>
*@author Ibrahim Chehimi
*@version v1.0
*@since 2017-11-17
*/

public class example{

  /**<b>Class Description: Required</b><br>
  *<p>Outputs sum of two numbers</p>
  *@param
  *@return
  *@throws
  */

  /**<b>Method Description: addNum adds numbers</b><br>
  *<p>Adds two numbers</p>
  *@param a first args number
  *@param b second args number
  *@return the sum of both numbers
  *@throws
  */

  public int addNum(int a, int b){
    return a+b;
  }

  /**<b>Method Description: Driver</b><br>
  *<p>Collecting two numbers in args</p>
  *@param args[0] first args number
  *@param args[1] second args number
  *@return null
  *@throws
  */

  public static void main (String args[]) throws NumberFormatException {
    try{
    for(int i=0; i<args.length; i++){ //Not needed, used for debugging
      System.out.println("Numbers: ("+args[i]+")");
    }
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    example obj = new example();
    int sum = obj.addNum(a, b);
    System.out.println("sum of "+args[0]+" and "+args[1]+" is: "+sum);
    }
    catch(NumberFormatException nfe){
      //input is not a number, forcefully tell user to a number in args
      System.out.println("Your argument is not a number fam. \nPlease use a number");
      System.exit(1);
    }
  }
}
