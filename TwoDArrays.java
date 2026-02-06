import java.util.Scanner;

public class TwoDArrays {

    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        // // array for 2D arrya
        // int[][] numbers = new int[rows][cols];

        // // input (elements ke liye)
        // // row
        // for (int i = 0; i < rows; i++) {
        //     // columns
        //     for (int j = 0; j < cols; j++) {
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

        // // output
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {

        //         System.out.print(numbers[i][j] + " "); // hamne ek ek row per ja ke phir usa row ke ek ek columns ke liye usa
        //                                                // numbers[i][j] (cells) ko print karaya

        //     }
        //     System.out.println();
        // }

     //1. take a matrix as input from the user. search for a given number x and print the indices at which it occurs.

       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();

       int[][] numbers = new int[rows][cols];

       //input
       for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            numbers[i][j] = sc.nextInt();
        }
       }
 
       System.out.println("Enter the search value x: ");
       int x = sc.nextInt();

       //output
       for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            if(numbers[i][j]==x){
                System.out.println("x found at location ("+ i + "," + j + ")");
            }
        }
       }

    }

}
