import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String firstName = "tony";
        // System.out.println(firstName);

        String firstName = "tony";
        String lastName = "stark";
        // //concatenation -> string ko jodna
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // // length nikalne ke liye
        // System.out.println(fullName.length());

        // charAt -> string ke ander ek ek charater ko access karna

        // for(int i=0; i<firstName.length(); i++) {
        // System.out.println(firstName.charAt(i));
        // }

        // compare -> string ke ander charater A-Z mei A ko kam or Z ko jada mana jata h
        // String name1 = "Tony";
        // String name2 = "Tony";

        // if(name1.compareTo(name2) == 0) {
        // System.out.println("String are equal");
        // } else {
        // System.out.println("String are not equal");
        // }

        // substring -> string mei se koi bhi part nikalna

        // String sentence = "My name is Tony";
        // // substring give to beginning index and ending index
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);

        // 1. take an arry of strings input from the user and find the cumulative
        // (combined) length of all those strings
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of strings: ");
        // int size = sc.nextInt();

        // String array[] = new String[size];
        // int toLength = 0;

        // for(int i = 0; i<size; i++) {
        // array[i] = sc.next();
        // toLength += array[i].length();
        // }
        // System.out.println(toLength);

        // or

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of strings: ");
        // int n = sc.nextInt();
        // String[] arr = new String[n];

        // sc.nextLine(); // note whenever you use nextInt() before nextLine(), always
        // write one extra
        // // nextLine() to clear the buffer.

        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter string " + (i + 1) + ": ");
        // arr[i] = sc.nextLine();
        // }
        // int totalLength = 0;
        // for (int i = 0; i < n; i++) {
        // totalLength = totalLength + arr[i].length();
        // }

        // System.out.println("Total length of all strings = " + totalLength);

        // 2. Input a string from the user create a new string called 'result' in which
        // you will replace the letter 'e' in the original string with letter 'i'.

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String result = "";
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result = result + 'i';
            } else {
                result = result + str.charAt(i);
            }
            
        }
        System.out.println(result);
        
    }

}
