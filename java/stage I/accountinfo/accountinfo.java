/**<h1>Project Title: </h1>
*<b>Purpose of Project:</b><br>
*<p></p>
*<b>How to start the project instructions:</b><br>
*<p></p>
*<b>User Instructions:<b/><br>
*<p></P>
*<br>
*@author Mark Mercer
*@version 1
*@since 2017-11-15
*/

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class accountinfo {
  /**<b>Class Description: Beginning Template</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

   public static void main(String[] args) {
    JFrame frame = new JFrame("Account Info");

    String name = JOptionPane.showInputDialog(frame, "Username:");
    String password = JOptionPane.showInputDialog(frame, "Password:");
    //System.out.println("Passed");

    if(name.equals("mercer") && password.equals("illuminati")){
      System.out.println("Welcome illuminati master, Meercer.");
    } else if(name.equals("ibrahim") && password.equals("osama")){
      System.out.println("Welcome to your cave in pakistan.");
    } else if(name.equals("egal") && password.equals("friedchicken")){
      System.out.println("yo ni[B][B]a");
    }

    else {
      System.out.println("Password does not match username.");
      System.out.println("Username entered: "+name);
      System.out.println("Password entered: "+password);
    }

    //System.out.printf("The user's name is '%s'.\n", name);
    System.exit(0);


     //System.out.println(input);
   }
}
