import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose Operation: ");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("5 : Module");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result = " + (a+b));
            break;
            case 2: System.out.println("Result = " + (a-b));
            break;
            case 3: System.out.println("Result = " + (a*b));
            break;
            case 4: if(b == 0) {
                System.out.println("Invalid Division");
            } else{
                System.out.println("Result = " + (a/b));
            }
            break;
            case 5: if(b == 0) {
                System.out.println("Invalid Division");
            } else{
                System.out.println("Result = " + (a%b));
            }
            break;
        
            default: System.out.println("Invalid Operator");
                break;
        }


    }
    
}
