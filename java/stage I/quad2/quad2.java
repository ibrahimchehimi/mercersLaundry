import java.util.*;

public class quad2{

  private int divisor(int numA){
    return 2*numA;
  }
  private int discriminate(int numA, int numB, int numC){
    return numB*numB-4*numA*numC;
  }
  private int negativeB(int numB){
    return -1*numB;
  }

  public static void main(String[] args)
  throws NumberFormatException
 {
    System.out.println("QUADRATIC ANALYZER?! JUST FIRE YOUR SYNAPSES");

    Scanner input = new Scanner(System.in);
    System.out.println("Type a quadratic a value");
    String stringA = input.nextLine();
    stringA = stringA.trim();
    int numA = -999999999;

        try{
      numA = Integer.parseInt(stringA);
    }
    catch(NumberFormatException a1){
      System.out.println("SUBTLE ERROR: TYPE A NUMBER");
      stringA = input.nextLine();
      stringA = stringA.trim();
      try{
        numA = Integer.parseInt(stringA);
      }
      catch(NumberFormatException a2){
        System.out.println("THESE ERRORS WILL COST YOU ON THE FINAL" +
                          "please restart the FINAL and try again.");
        System.exit(1);
      }
    }

    System.out.println("Type a quadratic b-value");
    String stringB = input.nextLine();
    stringB = stringB.trim();
    int numB = -999999999;

    try{
      numB = Integer.parseInt(stringB);
    }
    catch(NumberFormatException b1){
      System.out.println("SUBTLE ERROR: TYPE A NUMBER");
      stringB = input.nextLine();
      stringB = stringB.trim();
      try{
        numB = Integer.parseInt(stringB);
      }
      catch(NumberFormatException b2){
        System.out.println("THESE ERRORS WILL COST YOU ON THE FINAL" +
                          "please restart the FINAL and try again.");
        System.exit(1);
      }
    }

    System.out.println("Type a quadratic c-value");
    String stringC = input.nextLine();
    stringC = stringC.trim();
    int numC = -999999999;
    try{
      numC = Integer.parseInt(stringC);
    }
    catch(NumberFormatException c1){
      System.out.println("SUBTLE ERROR: TYPE A NUMBER");
      stringC = input.nextLine();
      stringC = stringC.trim();
      try{
        numC = Integer.parseInt(stringC);
      }
      catch(NumberFormatException c2){
        System.out.println("THESE ERRORS WILL COST YOU ON THE FINAL" +
                          "please restart the FINAL and try again.");
        System.exit(1);
      }
    }

    if(numA == -999999999 | numB == -999999999 | numC == -999999999){
      System.out.println("Check the userinput, " +
                         "numS cant be overwritten.");
      System.exit(0);
    }


    quad2 obj = new quad2();
    int bottom = obj.divisor(numA);
    int dis = obj.discriminate(numA, numB, numC);
    int negB = obj.negativeB(numB);
    double sqroot = Math.sqrt(dis);

    if( Math.abs(bottom) == 0 ){
      System.out.println("\nYOU MADE A SUBTLE ERROR IN: " + numA + "\n" +
                         "A CANNOT BE ZERO");
      System.out.println("ALL AROUND ME ARE QUADRATIC EXPRESSIONS, LINEAR FUNCTIONS.\n" +
                         "LINEAR FUNCTIONS ARE SUBTLE ERRORS.");
      System.exit(0);
    } else{
      System.out.println("\nPARK IT.\n");
    }

    if(dis < 0){
      if(Double.isNaN(sqroot)){
        System.out.println("Get up, go for a walk, come back when you stop making SUBTLE ERRORS: \n" +
                           "Taking the square root of the discriminate \n" +
                           "will result in a complex root.");
        }
      System.out.println("The discriminate equals: " + dis + "\n" +
                         "SUBTLE ERROR.");
      System.exit(1);
    } else if(Math.abs(dis) == 0){
      System.out.println("The discriminate equals: " + dis +
                         "\nThus, one root is estimated.");
    } else{
      System.out.println("The discriminate equals: " + dis +
                         "\nThus, two roots are estimated.");
    }

    if(Math.abs(dis) == 0){
      System.out.println("The single root is equal to: " +
                        (negB + sqroot) / bottom);
    } else if(dis > 0){
      System.out.println("The first root is equal to: " +
                        (negB + sqroot) / bottom);
      System.out.println("The second root is equal to: " +
                        (negB - sqroot) / bottom);
    } else{
      System.out.println("YOU FIRED YOUR SYNAPSES! GOOD JOB\n" +
                         "AYA. STOP FLIRTING WITH THE BOIZZ");
      System.exit(0);
    }

    System.out.println("YOU FIRED YOUR SYNAPSES! GOOD JOB\n" +
                       "AYA. STOP FLIRTING WITH THE BOIZZ");

    }
  }
