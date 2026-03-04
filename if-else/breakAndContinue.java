public class breakAndContinue {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};

        // Difference break and continue

    // break -> loop se bahar nikal jao
    for(int i = 1; i<= 5; i++) {
        if(i == 3) {
            break;
        }
        System.out.println(i);
    }

    // continue -> sirf current step skip
    for(int i = 1; i<=arr.length; i++) {
        if(i == 3) {
            continue;
        }
        System.out.println(i);
    }

    }
    
    
}
