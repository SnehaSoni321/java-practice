import java.util.Scanner;

public class LoopPracties {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 5 to 1 print
        // for (int a = 5; a >= 1; a=a-1) {
        //     System.out.println(a);
        // }

        // int a = 1;
        // while (a<=5) {
        //     System.out.println(a);
        //     a++;
        // }

        // user give no. then print table
        // int n = sc.nextInt();
        // for(int i= 1; i<=10; i++){
        //     System.out.println(n*i);
        // }

        //jab tak  user -1 na likhe, numbers input karte raho

        // int num = 0;
        // while (num != -1) {
            
        //     System.out.println("Enter a number (-1 to stop):");
        //      num = sc.nextInt();
        // }
        // System.out.println("Program stopped");
        
        // count karo kitne positive number user ne enter kiye 

        // int num;
        // int count=0;
        // System.out.println("Enter number (-1 to stop):");
        // num = sc.nextInt();

        // while (num != -1) {

        //     if(num > 0){
        //         count = count+1;
        //     }
        //     num = sc.nextInt();
            
        // }
        // System.out.println("Positive number count:" +count);
        
        // count karo kitne positive number user ne enter kiye with do while loop
        //(isme ye problem h ki -1 dalne per bhi ye chla raha h kuch number dalne per phir se -1 dalne per ye loop ruka)

    //     int num;
    //     int count=0;
    //     System.out.println("Enter number (-1 to stop):");
    //     num = sc.nextInt();
    //     do{
    //         if(num>0){
    //             count=count+1;
    //         }
    //         num = sc.nextInt();
    //     }while(num !=-1);

    //     System.out.println("Positive number count:" +count);

        // even odd pata karo or user se 5 ber input lo

        for(int i = 1; i<=5; i++){
            System.out.println("Enter a number :");
            int num = sc.nextInt();

            if(num%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }

     }



}
