import java.util.Scanner;

public class GameInput {

   public static String readConsole() {
      Scanner console = new Scanner(System.in);

      // TODO verify the user input
      String input = console.next();

      // TODO return an acceptable value
      return input;
   }

   public static String readSingleConsole() {
      return "" + new Scanner(System.in).nextInt();
   }

   public static void main(String[] args) {

      System.out.print("Please input: ");
      String x = readConsole();

      System.out.println("The input you put in was: " + x);

      System.out.print("Please input: ");
      x = readSingleConsole();
      System.out.println("readSingleConsole input: " + x);

   }

}
