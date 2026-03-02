import java.util.Scanner;
public class AddTwoNumber {

    //2. Make a function to add 2 number and return the sum 

    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("Sum of 2 number is: "+ sum);
        
    }
}