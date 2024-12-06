public class Main{

    public static void main(String[] args){
    
        /*
         * Conditionals
         */
        
        int playerScore = 10;

        // if condiiton that checks if playerScore is >= 10 and if it is, prints 'You win'
        if( playerScore >= 10)
        {
            System.out.println("You win!");
        }

        // else statement that runs if playerScore is less than 10
        playerScore = 5; 

        if( playerScore >= 10)
        {
            System.out.println("You win!");
        }else {
            playerScore++; 
            System.out.println("You do not have enough score!");
        }

        // else if statement that runs if playerScore is 5
        playerScore = 5; 

        if( playerScore >= 10)
        {
            System.out.println("You win!");
        }else if (playerScore == 5){
            System.out.println("You are halfway there!");
        }else {
            playerScore++;
        }

        // We have to use .equals to compare strings 
        String name = "John";

        if (name.equals("John"))
        {
            System.out.println("Wow your name is john!");
        }else if (name.equals("Cat")){
            System.out.println("You have an interesting name");
        }


        /* 
         * Loops  
         */

        // while loop are loops that run while a condition is true 
        int i = 0; 

        while ( i < 5){
            System.out.println(i);
            i++;          // increase i to exit the loop
        }

        /*
         * do-while loops are loops that do something 
         * while a condition is true. The only differnce 
         * between do-while loops and while loops is that
         * do-while loops always run atleast once
         */
        int j = 0; 

        do{
            System.out.println(j);
            j++;
        }
        while ( j < 0);    //even though the condiiton is false the do block executes once


        /*
         * For loops are shortened ways to write while loops 
         */

        for( int k = 0; k < 5; k++){
            System.out.println(k);
        }

    }

}