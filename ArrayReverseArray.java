public class ArrayReverseArray {
    public static void main(String args[]) {

        //1. Reverse array
        //  int arr[] = {3,4,5};
        //  for(int i = arr.length-1; i>=0; i--) {
        //     System.out.println(arr[i]);
        //  }

        //2(i). rotate array left by 1
        // int arr[] = {1,2,3,4,5,6,7,8};
        // int first = arr[0];
        // for( int i = 0; i<arr.length-1; i++) {
        //     arr[i] = arr[i+1];
        // }
        // arr[arr.length - 1] = first;

        // for (int num : arr) {
        //     System.out.println(num + " ");
        // }

        //2(ii). rotate array rigth by 1
        // int arr[] = {1,2,3,4};
        // int last = arr[arr.length-1];
        // for(int i = arr.length-1; i>0; i--){
        //     arr[i] = arr[i-1];
        // }
        // arr[0] = last;
        // for(int num : arr) {
        //     System.out.println(num + " ");
        // }

        // palindrome check
        int arr[] = {1,2,1};

        // incorrect logic

       // int original = 0;

        // for(int i = 0; i<arr.length; i++) {
        //     original = arr[i];
        //     break;
        // }
        // int reverse = 0;

        // for(int i = arr.length-1; i>=0; i++ ) {
        //     reverse = arr[i];
        //     break;
        // } 
        // if(original == reverse) {
        //     System.out.println("Palindrom");
        // } else {
        //     System.out.println("Not palindrome");
        // }

        boolean isPalindrome = true;
        for(int i = 0; i<arr.length/2; i++) {
            if(arr[i] != arr[arr.length-1-i]) {
                isPalindrome = false;
                break;
            }
            if(isPalindrome) {
                System.out.println("It is Palindrom");
            } else {
                System.out.println("It is not Palindrom");
            }
        }






    }
    
}
