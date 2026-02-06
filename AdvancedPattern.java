public class AdvancedPattern {
    public static void main(String args[]){
        int n =5;

        // // 1. Butterfly pattern

        // //Upper half
        //   for(int i=1; i<=n; i++){
        //     //1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     // spaces
        //     int space = 2*(n-i);
        //     for(int j=1; j<=space; j++){
        //         System.out.print(" ");
        //     }

        //     // 2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //   }

        // //lower half

        // for(int i=n; i>=1; i--){

        //     //1st part
        //       for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //       }
        //       // spaces
        //       int space =2*(n-i);
        //       for( int j=1; j<=space; j++){
        //         System.out.print(" ");
        //       }

        //       //2nd part 
        //       for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //       }
        //       System.out.println();
        // }

        // // 2. solid rhombus

        // for(int i=1; i<=n; i++){
        //   //spaces
        //   for(int j=1; j<=n-i; j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=5; j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }

        // // 3. number pyramid

        // for(int i=1; i<=n; i++) {
        //   // spaces
        //   for(int j=1; j<=n-i; j++) {
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=i; j++) {
        //     System.out.print(i+" ");
        //   }
        //   System.out.println();
        // }

        // // 4. Palindromic pattern  ex=121.BOB

        // for(int i=1; i<=n; i++) {
        //   // spaces
        //   for(int j=1; j<=n-i; j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=i; j>=1; j--){
        //     System.out.print(j);
        //   }
        //   for(int j=2; j<=i; j++) {
        //     System.out.print(j);
        //   }
        //   System.out.println();
        // }

        // 5. Diamond pattern

        //upper half
        int s = 4;
        for(int i = 1; i<=s; i++) {
          //spaces
          for(int j = 1; j<= s-i; j++) {
            System.out.print(" ");
          }
          //stars
          for(int j = 1; j<= 2*i-1; j++) {
            System.out.print("*");
          }
          System.out.println();
        }

        //lower half
        for(int i = s; i>=1; i--) {
          // spaces
            for(int j = 1; j<= s-i; j++) {
              System.out.print(" ");
            }
            //stars
            for(int j = 1; j<= 2*i-1; j++) {
              System.out.print("*");
            }
            System.out.println();
          }




    }
    
}
