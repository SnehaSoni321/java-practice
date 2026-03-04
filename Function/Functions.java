import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class Functions {
      //1. first function 


    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);  // call kiya function ko
    }
    

}
