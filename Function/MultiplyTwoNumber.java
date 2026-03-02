import java.util.Scanner;
public class MultiplyTwoNumber {

    //3. Make a function to multiply 2 number and return the product

    public static int calculateProduct(int a, int b){
        return a*b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         
        System.out.println("Product of 2 number is: "+ calculateProduct(a, b));
    }
    
}