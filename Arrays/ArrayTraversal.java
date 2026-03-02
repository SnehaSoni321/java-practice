public class ArrayTraversal {
    public static void main(String args[]) {
        // Traversal Algorithm
        // // 1. print all element of an array
        // int arr[] = {2,3,4,5,6};
        // for(int i = 0; i<arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // 2. sum of all elements
        // int arr[] = {2,3,4,5,6};
        // int x = arr[0];
        // for(int i = 1; i<arr.length; i++) {
        // x = x + arr[i];
        // }
        // System.out.println("Sum of all elements: " + x);

        // 3. count even and odd numbers
        // int arr[] = {2,3,4,5,6};
        // int evenCount = 0;
        // int oddCount = 0;
        // for(int i = 0; i<arr.length; i++) {
        // if(arr[i] % 2 == 0) {
        // evenCount++;
        // } else if(arr[i] % 2 != 0) {
        // oddCount++;
        // }
        // }
        // System.out.println("even: "+evenCount);
        // System.out.println("odd: "+oddCount);

        // 4. count positive, negative and zero
        // int arr[] = {2,4,0,-5,3,-4,0,8,-2};
        // int positive = 0;
        // int negative = 0;
        // int zero = 0;
        // for(int i = 0; i<arr.length; i++) {
        // if(arr[i] > 0) {
        // positive++;
        // } else if(arr[i] < 0) {
        // negative++;
        // } else if(arr[i] == 0) {
        // zero++;
        // }
        // }
        // System.out.println("Positive: " + positive);
        // System.out.println("Negative: " + negative);
        // System.out.println("Zero: " + zero);

        // 5. find average of array elements
        // int arr[] = {2,5,8};
        // int sum = 0;
        // int count = 0;
        // for(int i = 0; i<arr.length; i++) {
        // sum = sum + arr[i];
        // count++;
        // }
        // int x = sum/count;
        // System.out.println(x);

        // or
        // good way :-
        // int arr[] = { 2, 5, 8 };
        // int sum = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum + arr[i];
        // }

        // double avg = (double) sum / arr.length; // (double) sum ka matlab: sum permanently double nahi hota wo sirf usi
        //                                         // line ke liye double banta hai
        // System.out.println(avg);

        // 6. print elements at even index
        int arr[] = {3,6,2,4,7,8};
        for(int i = 0; i<arr.length; i++) {
            if(i % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }

}
