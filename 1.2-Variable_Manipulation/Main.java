public class Main{
    
    public static void main(String[] args){ 
        
        /*
         * Variable Manipulation
         */

        //declare a variable 'score' with a value of 0
        int score = 0; 

        //reassign 10 a value of 10
        score = 10; 

        // add 10 to score
        score += 10; 
        //add 1 to score
        score++;

        //subtract 10 from score
        score -= 10; 
        //subtract 1 from score
        score--;

        //divide score by 10
        score /= 10; 

        //multiply score by 10
        score *= 10;

        //return the remained of score divided by 10 
        score %= 10;

        /* Modulus funcitons in the following way: 
         * 10 % 2 = 0; there is no remainder when 10/2 so 0 is returned
         * 5 % 2 = 1; there is a remainder of 1 when 5/2 so 1 is returned
         */
        System.out.println(score);


        /* 
         * String Manipulation
         */
        
        //declares 2 strings 'firstName' and 'lastName'
        String firstName = "George"; 
        String lastName = "Washigton";
        
        //prints "George Washington" by adding strings together
        System.out.println( firstName + " " + lastName);

        //prints the lenght (6) of 'firstName' (starts at 1)
        System.out.println( firstName.length());

        /* prints a substring that includes the first index and does not includ the last index
         * indexes start at 0 in programming
         * prints "Geo"
         */
        System.out.println(firstName.substring(0, 3));
        
    }
    
}