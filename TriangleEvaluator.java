import java.io.Console;

public class TriangleEvaluator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Let's determine what type of triangle you have.");
    System.out.println("Enter side one for your triangle.");
    int sideOne = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter side two for your triangle.");
    int sideTwo = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter side three for your triangle.");
    int sideThree = Integer.parseInt(myConsole.readLine());

    Triangle userTriangle = new Triangle(sideOne, sideTwo, sideThree);

    if (userTriangle.mSideOne > userTriangle.mSideTwo + userTriangle.mSideThree ||  userTriangle.mSideTwo > userTriangle.mSideOne + userTriangle.mSideThree || userTriangle.mSideThree > userTriangle.mSideTwo + userTriangle.mSideOne) {
      System.out.println("This isn't a triangle!");
    } else if(userTriangle.mSideOne == userTriangle.mSideTwo && userTriangle.mSideTwo == userTriangle.mSideThree) {
      System.out.println("This is an equilateral triangle");
    } else if (userTriangle.mSideOne == userTriangle.mSideTwo || userTriangle.mSideTwo == userTriangle.mSideThree || userTriangle.mSideOne == userTriangle.mSideThree) {
      System.out.println("This is an isosceles triangle");
    } else {
      System.out.println("This is a scalene triangle");
    }
  }
}
