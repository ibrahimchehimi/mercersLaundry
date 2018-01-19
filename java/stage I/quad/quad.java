public class quad{
  public static void main (String[] args)
  throws ArrayIndexOutOfBoundsException
  {
    try{ //Did someone enter the required arguments
      while(args[0]=="") { //Two Reasons this will return false or error
        //1. Argument entered so args[0] is NOT null, will run rest of code b/c WHILE
        //2. No argument entered and exception thrown
      }
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("You must enter arguments to start this program \nPlease restart the program with arguments. Thank you");
      System.exit(0);

      Scanner inputA = new Scanner (System.in);
      String a = inputA.nextLine();

      Scanner inputB = new Scanner (System.in);
      String b = inputB.nextLine();

      Scanner inputC = new Scanner (System.in);
      String a = inputC.nextLine();

      args[0] = a;
      args[1] = b;
      args[2] = c;
    }
    System.out.println(args[0] + " " + args[1] + " " + args[2]);
  }
}
