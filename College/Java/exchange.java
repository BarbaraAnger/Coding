/****************************
Copyright © 2018 Barbara Anger. All rights reserved.
e-mail: barbaraanger@hotmail.com
****************************/
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
