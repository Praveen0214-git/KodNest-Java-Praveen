package Userinput;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
      java.util.Scanner scn = new Scanner(System.in);
    System.out.print("Enter a byte Value: ");
    byte a = scn.nextByte();
    System.out.println("Byte value is:"+a);

    System.out.print("Enter a short Value: ");
    short b = scn.nextShort();
    System.out.println("short value is:"+b);

    System.out.print("Enter a int Value: ");
    int c = scn.nextInt();
    System.out.println("int value is:"+c);

    System.out.print("Enter a long Value: ");
    long d = scn.nextLong();
    System.out.println("long value is:"+d);

    System.out.print("Enter a float Value: ");
    float e = scn.nextFloat();
    System.out.println("float value is:"+e);

    System.out.print("Enter a double Value: ");
    double f = scn.nextDouble();
    System.out.println("double value is:"+f);

    System.out.print("Enter a boolean Value: ");
    boolean g = scn.nextBoolean();
    System.out.println("boolean value is:"+g);

    System.out.println("Enter your Name: ");
    String m = scn.next();
    System.out.println(" Your Name is: "+m);

      scn.nextLine();
     System.out.print("Enter your Name: ");
     String s = scn.nextLine();
     System.out.println("Your Name is: "+s);

      scn.close();
   }
}
