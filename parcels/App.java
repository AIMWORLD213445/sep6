import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App{
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("Enter the height of your parcel (in inches).");
    int userParcelHeight = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter the width of your parcel (in inches).");
    int userParcelWidth = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter the length of your parcel (in inches).");
    int userParcelLength = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter the weight of your parcel (in pounds).");
    int userParcelWeight = Integer.parseInt(myConsole.readLine());
    System.out.println("How far are you shipping your parcel (in miles)?");
    int userParcelDistance = Integer.parseInt(myConsole.readLine());
    System.out.println("How would you like to ship your parcel? Enter either 'standard', 'expedited', or 'overnight'.");
    String userParcelDelivery = myConsole.readLine();

    Parcel userParcel = new Parcel(userParcelHeight, userParcelWidth, userParcelLength, userParcelWeight, userParcelDelivery, userParcelDistance);
    userParcel.calcVolume();
    userParcel.costToShip();
    System.out.println("Your shipping cost is: $" + userParcel.mPrice);
  }
}
