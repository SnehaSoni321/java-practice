import java.util.Scanner;

public class Practice1DArray {
    public static void main(String args[]) {
// Easy and Middle questions

    // 1. Array print karo

        // int[] arr = {1,2,3};
        // System.out.println(arr[0]);
        // // aagr pura arrya print karna h to
        // for(int i=0; i<arr.length; i++){
        // System.out.print(arr[i] + " ");
        // }

        // or

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // int [] numbers = new int[size];

        // for(int i=0; i<size; i++){
        // numbers[i] = sc.nextInt();
        // }

        // for(int j=0; j<size; j++){
        // System.out.print(numbers[j] + " ");
        // }

    // 2. sum of all element

        // int [] arr = {1,2,3,4,5};
        // int sum = 0;
        // for(int i = 0; i<arr.length; i++){
        // sum = sum + arr[i];
        // System.out.print("Sum of array: " + sum);
        // }

    // 3. Maximum element find karo

        // int [] arr = {2,4,6,8,};
        // int max = arr[0];

        // for(int i=1; i<arr.length; i++){
        // if(arr[i] > max) {
        // max = arr[i];
        // }
        // }

        // System.out.println("Maximum element is:" + max);

    // 4. Minimum element find karo

        // int[] arr = {5,3,7,5,2};
        // int min = arr[0];

        // for(int i=1; i<arr.length; i++){
        // if(arr[i] < min) {
        // min = arr[i];
        // }
        // }
        // System.out.println("Minimum element is: " + min);

    // 5. Search an element (Linear search)

        // int[] arr = {2,4,5,6,3,9};
        // int x = 5;
        // int i;

        // for(i = 0; i<arr.length; i++) {
        //     if(arr[i] == x){
        //         System.out.println("Element fount at index: "+ i);
                
        //     }
        // }
        // if(i==arr.length){
        //     System.out.println("Element not found");
        // }

    // 6. Count even and odd numbers
        // int [] arr = {2,4,3,5,8,6,9,7};
        // int evenCount = 0;
        // int oddCount = 0;
         
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]%2 == 0){
        //         evenCount++;
        //     } else {
        //         oddCount++;
               
        //     }
        // }
        //  System.out.println(" Even count: " + evenCount);     
        //  System.out.print(" Odd count: " + oddCount);
       
    // 7. Reverse the array 

        // int[] arr = {1,2,3,4,5};

        // for(int i = arr.length-1; i>=0; i--){
        //     System.out.print(arr[i] + " ");
        // }


    //8. user se le kar copy array into another array

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        
        // int [] arr1 = new int[size];

        // for(int i = 0; i<size; i++){
        //     arr1[i] = sc.nextInt();
        // }
        // int[] arr2 = new int[size];

        // for(int i = 0; i<size; i++){
        //     arr2[i] = arr1[i];
        // }

        // for(int i = 0; i<size; i++){
        //     System.out.print(arr2[i] + " ");
        // }
        // sc.close();


    // 9. find second largest element

        // int[] arr = {2,5,4,7,9,3};

        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;
        // int thirdLargest = Integer.MIN_VALUE;

        // for(int i=0; i<arr.length; i++){

        //     if(arr[i]> largest){
        //         thirdLargest = secondLargest;
        //         secondLargest=largest;
        //         largest = arr[i];
        //     } else if(arr[i]> secondLargest && arr[i] != largest) {
        //         thirdLargest = secondLargest;
        //         secondLargest = arr[i];

        //     } else if(arr[i]> thirdLargest && arr[i] != secondLargest && arr[i] != largest) {
        //         thirdLargest = arr[i];
        //     }

        // }
        // System.out.println("third largest number: "+ thirdLargest);

    //10. Check array is sorted or not

        // int[] arr = {2,4,5,8,9};
        // boolean isSorted = true;

        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i]>arr[i+1]){
        //         isSorted=false;
        //         break;
        //     }
        // }

        //  if(isSorted){
        //     System.out.println("Array is sorted");
        //  } else {
        //     System.out.println("Array is not sorted");
        //  }

    // 11. check element present or not

    // int[] arr = {2,4,3,6,5,8};
    // boolean isPresent = false;
    // int x = 9;
   

    // for(int i=0; i<arr.length-1; i++){
    //     if(arr[i] == x){
    //         isPresent = true;
    //         break;
    //     } 
    // }
     
    // if(isPresent) {
    //     System.out.println("Element is present");
    // } else {
    //     System.out.println("Element is not present");
    // }

    //Advanced 1D array question

    // 1. Frequency of each element -> kon sa number kitni bar repeat ho raha h
        //  int [] a = {10,20,30,70,70,50,70,10,10,90};

        //  for(int i = 0; i<a.length; i++) {
        //     int x = a[i];
        //     int count = 0;
        //     if(x == -1){
        //         continue;
        //     }

        //     for(int j = 0; j<a.length; j++){
        //         if(a[j]==x) {
        //             count++;
        //             a[j] = -1;
        //         }
        //     }
        //     System.out.println("Frequecy of " + x + " is " + count);
        //  }

         // or

        //  int[] a = {10,20,30,70,70,50,70,10,10,90};

        //  boolean[] visited = new boolean[a.length];
        //  for(int i = 0; i<a.length; i++) {
        //     if(visited[i] == true) {
        //         continue;
        //     }
        //     int x = a[i];
        //     int count = 1;
             
        //     for(int j = i+1; j<a.length; j++) {
        //         if(a[j] == x){
        //             count++;
        //             visited[j] = true;
        //         }
        //     }
        //     System.out.println("Frequency of "+ x +" is " + count);
        //  }

         // Remove duplicate elements

        //  int arr[] = {3,5,3,6,6,1};
        //  boolean[] duplicate = new boolean[arr.length];
        //  for(int i = 0; i<arr.length; i++) {
        //     if(duplicate[i] == true) {
        //         continue;
        //     }
        //     int x = arr[i];
        //     for (int j = i+1; j<arr.length; j++) {
        //         if(arr[j] == x){
        //             duplicate[j] = true;
        //         }
        //     }
        //     System.out.println(x);
        //  }

        // find the element that appears only ones

        int arr[] = {3,5,3,6,6,1};
        boolean[] appears = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++) {
            if(appears[i] == true) {
                continue;
            }
            int x = arr[i];
            int count = 1;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j] == x) {
                    count++;
                    appears[j] = true;
                } 
            }
            if(count==1) {
                 System.out.println(x);
            }
        }
        

         

    }

}
