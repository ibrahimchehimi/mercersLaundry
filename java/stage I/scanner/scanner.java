import java.util.Scanner;

public class scanner{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String statement = input.nextLine();

    System.out.println("Type something in");
    System.out.println(statement);
  }
}
