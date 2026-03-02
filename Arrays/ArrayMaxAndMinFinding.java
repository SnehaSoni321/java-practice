public class ArrayMaxAndMinFinding {

    public static void main(String args[]) {

        int arr[] = {5,4,3,2,6};
    //1. find max element
    // int max = arr[0];
    // for(int i = 1; i<arr.length; i++) {
    //     if(arr[i] > max){
    //         max = arr[i];
    //     }
    // }
    // System.out.println(max);

    //2. find min element
    // int min = arr[0];
    // for(int i = 1; i<arr.length; i++) {
    //     if(arr[i] < min) {
    //         min = arr[i];
    //     }
    // }
    // System.out.println(min);
        
    //3. find second max 
    // int max = Integer.MIN_VALUE;
    // int secondMax = Integer.MIN_VALUE;
    // for(int i = 0; i<arr.length; i++) {
    //     if(arr[i] > max) {
    //         secondMax = max;
    //         max = arr[i];
    //     } else if(arr[i] > secondMax && arr[i] != max) {
    //         secondMax = arr[i];
    //     }
    // }
    // System.out.println(secondMax);


    //4. find the difference between maximum and minimum
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i = 0; i<arr.length; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    int diff = max - min;
    System.out.println(diff);



    }
    
    
}
