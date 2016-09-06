import java.io.Console;

public class PracticeTracker{
  public static void main(String[] args){
    Console myConsole=System.console();

    System.out.println("Enter the number of hours you spent coding yesterday");
    int codeYesterday = Integer.parseInt(myConsole.readLine());


    System.out.println("Enter how many hours you coded the day before yesterday");
    int codeDayBefore = Integer.parseInt(myConsole.readLine());

    System.out.println("Enter how many hours you've coded so far today");
    int codeDayToday = Integer.parseInt(myConsole.readLine());

    Integer totalCodeTime=codeYesterday+codeDayBefore+codeDayToday;

    if(totalCodeTime > 12) {
      System.out.println("Great Job!");
    }else if (totalCodeTime > 6){
      System.out.println("Try Harder!");
    }else {
    System.out.println("You're really falling behind!");
    }
  }
}
