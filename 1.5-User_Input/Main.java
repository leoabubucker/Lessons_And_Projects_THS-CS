//import scanner to be used
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        //create a new scanner object that takes in input
        Scanner sc = new Scanner(System.in);

        //get a string from the user
        String i = sc.nextLine();

        //get a word from the user
        String j = sc.next();

        //get an int from the user 
        int a = sc.nextInt();

        //other frequently used methods to get input from user 
        sc.nextBoolean();
        sc.nextDouble();

        //close the scanner to prevent resource leaks (IMPORTANT)
        sc.close();
    }
}