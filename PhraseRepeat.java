import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class PhraseRepeat{
  public static void main(String[] args){
    Console myConsole=System.console();
    List<Object> numbersAndStrings = new ArrayList<Object>();

    System.out.println("Enter a Number");
    int userIntOne = Integer.parseInt(myConsole.readLine());
    numbersAndStrings.add(userIntOne);

    System.out.println("Enter another number");
    int userIntTwo = Integer.parseInt(myConsole.readLine());
    numbersAndStrings.add(userIntTwo);

    System.out.println("Enter a string");
    String userStringOne = myConsole.readLine();
    numbersAndStrings.add(userStringOne);

    System.out.println("Enter another string");
    String userStringTwo = myConsole.readLine();
    numbersAndStrings.add(userStringTwo);

    for (int i = 0; i < 4; i++) {
      System.out.println(numbersAndStrings.get(i));
    }
  }
}
