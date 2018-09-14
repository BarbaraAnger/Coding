/*
Author: Barbara Anger
2018. Copyright. All Rights reserved.
*/
import java.util.Scanner;

public int exchange(){
    Scanner read = new Scanner(Scanner.read);
    System.out.println("Enter two values:");
    int x = read.nextInt();
    int y = read.nextInt();
    x = x + y;
    y = x - y;
    x = x - y;
    System.out.println("The variables are now:\n");
}
