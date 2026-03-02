import java.util.*;
public class Arrays {
    public static void main(String args[]) {
    //    // int [] marks = new int[3];
    //         // [] square brakes ko marks ke right side bhi likhe to koi problem nhi h syntax sahi hoga
    //     int marks [] = new int[3];
    //      marks[0] = 97; // phy
    //      marks[1] = 98; // chem
    //      marks[2] = 95; // eng

    //     //  System.out.println(marks[0]);
    //     //  System.out.println(marks[1]);
    //     //  System.out.println(marks[2]);

    //     for(int i=0; i<3; i++){
    //         System.out.println(marks[i]);
    //     }



    // // user se input le kar ek array bana h

    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();      // usre se input liya size for array

    // int numbers[] = new int[size];  // usre se jo input size liya h usai size ka array bana diya (array index ka size h)

    // //input
    // for(int i=0; i<size; i++){
    //     numbers[i] = sc.nextInt();   // array element usre se lena
    // }

    // // output
    // for(int i = 0; i<size; i++){
    //     System.out.println(numbers[i]);  // array ke element ko display karate h
    // }

    //1. take an array as input from the usre. Search for a given number x and print the index at which it occurs.

      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];

      //input
      for(int i=0; i<size; i++){
        numbers[i] = sc.nextInt();
      }

      int x = sc.nextInt();

      //output
      for(int i=0; i<numbers.length; i++) {  // numbers.length = size
        if(numbers[i] == x){
            System.out.println("x found at index :" + i);
        }
      }
      

    }
    
}
