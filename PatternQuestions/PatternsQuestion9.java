public class PatternsQuestion9 {
    public static void main(String args[]){
        int n = 4;
        int m = 5;

        // 1. pattern solid ractangle n=4, m=5

        // // outer loop
        // for(int i=1; i<=4; i++){
        //     // inner loop
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //2.  pattern Hollow ractangle n=4, m=5

    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=m; j++){
    //             //cells -> (i,j)
    //             if(i==1|| j==1 || i==n || j==m){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }

    //3.  pattern Half pyramid n=4
 
        //1. Half pyramid n=4
        
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //4. invertes Half pyramid n=4  
    
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //5. invertes Half pyramid n=4 (rotated by 180 deg)
          
        // //outer loop (rows ke liye)
        // for(int i=1; i<=n; i++){
        //     //inner loop -> space print
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //inner loop -> star print 
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //6.  Half pyramid with numbers n=5


         int s = 5;
        // for(int i=1; i<=s; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // 7. invertes Half pyramid with numbers

        // for (int i=s; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // or

        // for(int i=1; i<=s; i++){
        //     for(int j=1; j<=s-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //8.  Floyd's triangle (isme numbers ek se increase hote h)

        // int p = 5;
        // int number=1;

        // for(int i=1; i<=p; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(number+" ");
        //         number++;  // number=number+1
        //     }
        //     System.out.println();
        // }

        // 9. 0-1 triangle
        // int q = 5;

        // for(int i=1; i<=q; i++) {
        //     for(int j=1; j<=i; j++) {
        //         int sum = i+j;
        //         if(sum %  2 == 0) { //even
        //             System.out.print("1 ");
        //         } else { //odd
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }


        // 10. solid rhombus

        int r = 5;
        
        // for(int i = 1; i<=r; i++){
        //     for(int j = 1; j<=r-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=r; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // for(int i =1; i<=r; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=4; i++){
            System.out.println("*" + "*" + "*" + "*");
        }

     }
    
}     
