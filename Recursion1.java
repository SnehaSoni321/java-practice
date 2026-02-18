public class Recursion1 {
    //1. print number from 5 to 1
    // public static void printNumb(int n) {
    //     if(n == 0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n-1);

    // }
    // public static void main(String args[]) {
    //     int n = 5;
    //     printNumb(n);
    // }

    //2. print number from 1 to 5
    //  public static void printNumb(int n) {
    //     if(n == 6) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n+1);

    // }
    // public static void main(String args[]) {
    //     int n = 1;
    //     printNumb(n);
    // }

    //3. print sum of first n natural numbers

    //  public static void printNumb(int i, int n, int sum) {
    //     if(i == n) {
    //         sum += i;
    //         System.out.println(sum);
    //     }
    //     sum +=i;
    //     printNumb(i+1, n, sum);
    // }
    // public static void main(String args[]) {
    //     printNumb(1, 5, 0);
    // }

    // 4. print factorial of a number n
    public static int calcFactorial(int n) {
        if(n==1 || n==0) {
            return 1;
        }

        int fact_nm1 = calcFactorial(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;

    }
    public static void main(String args[]) {
        int n = 5;
       int ans = calcFactorial(n);
       System.out.println(ans);
        
    }
    
}
