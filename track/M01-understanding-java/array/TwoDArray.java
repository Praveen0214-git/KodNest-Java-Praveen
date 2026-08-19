import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a[][] = new int[3][5];
        System.out.print("Enter Array Elements: ");
        for(int i=0; i<=2;i++){
            for(int j=0;j<=4;j++){
                a[i][j] = scn.nextInt();
            }

        }
        System.out.println("Array Elements Are: ");
        for(int i=0; i<=2;i++){
            for(int j=0;j<=4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }

        scn.close();
        }
}
