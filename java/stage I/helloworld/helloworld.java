/*
*<h1>Hello Wolrd</h1>
*<b>Purpose of the Project:</b><br>
*<p>Supply CMD line arguments</p>
*<p>Working with CMD, file folers, and Atom</p><br>
*<b>How to start the program</b><br>
*<p>Use the Compiler and run the bytcode</p><br>
*<p>In CMD: $javac [ClassName].java;
then $java helloworld testing abc 123 </p>
*<b>User Instructions:</b><br>
*<p>Familiarize with routines of executing JAVA from CMD</p>

*<br>
*@author Ibrahim Chehimi
*@version v1.0
*@since 2017-11-15
*/

public class helloworld {
/**<b>Class Description: Beginning template</b><br>
*<p>Outputs message</p>
*@param
*@return
*@throws
*/

/**<b>Method Description: Driver</b><br>
*<p>Output messages</p>
*@param args used
*@return void
*@throws
*/

  public static void main (String[] args){
    System.out.println("Printing command-line arguments");
    for(int i=0; i<args.length; i++){
      System.out.println("Args ["+i+"]: "+args[i]);
    }
    System.out.println("Done.");
  }
}

/*
throws ArrayIndexOutOfBoundsException;
{
  try{
    while(args[0]==""){

    }
  }
  catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Try again, type something in this time.");
    System.exit(0);
  }
}
*/
