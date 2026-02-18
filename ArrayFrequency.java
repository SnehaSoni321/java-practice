public class ArrayFrequency {
    public static void main(String args[]) {
        // find frequency of number
        //  int arr[] = {1,2,3,2,4,2,5,2};
        //  int x = 2;
        //  int count = 0;
        //  for(int i = 0; i<arr.length; i++) {
        //     if(arr[i] == x) {
        //         count++;  
        //     }
        //  }
        //  System.out.println(count);

        //duplicate elements
        //  int arr[] = {2,3,2,4,5,3,4};
        //  for(int i = 0; i<arr.length; i++) {
        
        //     for(int j = i+1; j<arr.length; j++) {
        //         if(arr[i] == arr[j]) {
        //          System.out.println(arr[i]);
        //         }
        //     }
            
        //  }

        // sort the array
        int arr[] = {4,5,3,2,1};
        for(int i = 0; i<arr.length-1; i++) {

            for(int j = 0;j<arr.length-1-i; j++){

                if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
         }
            
        }
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



        


    }
    
}
