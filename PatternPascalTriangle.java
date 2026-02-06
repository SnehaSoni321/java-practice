public class PatternPascalTriangle {
    public static void main(String args[]) {
        int number=1;
        int n=4;
        int space=n;
        for(int i=0; i<=4; i++) {

            //space
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }
            number=1;
            for(int j=0; j<=i; j++) {
                System.out.print(number+" ");
                number = number*(i-j)/(j+1);
            }
            space--;
            System.out.println();
        }
    }
    
    
}
