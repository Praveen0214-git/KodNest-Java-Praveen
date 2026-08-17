import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter array:");
         for(int i=0; i<=a.length-1; i++){
            a[i] = scn.nextInt();
         }

         System.out.println("Array Values Are: ");
        for(int i =0; i<=a.length-1; i++){
            System.out.println(a[i]);
        }
        scn.close();
        }
}
