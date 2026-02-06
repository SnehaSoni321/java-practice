import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class Functions {

            // function ye h 
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
          // main function ye h
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name);  // call kiya function ko
    // }
    

    //2. Make a function to add 2 number and return the sum 

    // public static int calculateSum(int a, int b){
    //     int sum = a+b;
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = calculateSum(a,b);
    //     System.out.println("Sum of 2 number is: "+ sum);
        
    // }

    //3. Make a function to multiply 2 number and return the product

    // public static int calculateProduct(int a, int b){
    //     return a*b;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
         
    //     System.out.println("Product of 2 number is: "+ calculateProduct(a, b));
    // }

    //4.  find the factorial of a number 

    // public static void printFactorial(int n){
    //     // Loop
    //     if(n<0){
    //         System.out.println("Invalid Number");
    //         return;
    //     }
    //     int factorial = 1;

    //     for(int i=n; i>=1; i--){
    //         factorial = factorial*i;
    //     }
    //     System.out.println(factorial);
    //     return;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     printFactorial(n);

    // }

    // Homework Problems

//     //1. make a function to check if a number is prime or not.

//     public static boolean isPrime(int n){
//       if(n <= 1){
//             return false;
//       }

//       for(int i = 2; i < n; i++) {
//             if(n % i == 0) {
//                   return false;
//             }
//       }
//       return true;
//     }

//       public static void main(String args[]){
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter a number: ");
//             int num = sc.nextInt();

//             boolean result = isPrime(num);
//             if(result){
//                   System.out.println("Prime number");
//             } else {
//                   System.out.println("Not a prime number");
//             }
//       }

      // //2. make a function to check if a given number n is even or not

      // public static boolean isEven(int n){   // n = function ka local variable
             
      //       if(n%2==0){
      //             return true;   // even
      //       } else {
      //             return false;  // odd
      //       }
      // }
      // public static void main(String args[]){
      //       Scanner sc = new Scanner(System.in);
      //       int num = sc.nextInt();                // num = usre seliya gaya number jo function ko bheja jata h

      //       boolean result = isEven(num);          // result = function ka answer true/false mei store karta h

      //       if(result){
      //             System.out.println("Number is Even");
      //       }else{
      //             System.out.println("Number is Odd");
      //       }
      // }

      // 3. make a function to print the table of a given number n

      public static void printTable(int n){
            if(n<=0){
                  return;
            }
            for(int i = 1; i<11; i++){
                  System.out.println(n + " * " + i + " = " + n*i);
            }
      }

      public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

           printTable(num);

      }


}
