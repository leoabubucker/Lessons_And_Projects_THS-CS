public class Main{
    
    //main method
    public static void main(String[] args){

        /* method calls, these are necessary to run these methods 
         * as they will not run own their own
        */

        //methods without parameters
        myMethod();
        
        //methods with parameters (parameter must be same type)
        paramMethod("Mario");

        //return statements
        returnInt(5);
    }

    // methods without parameters
    public static void myMethod(){
        String userInput = "Mario";
        System.out.println("Your username is " + userInput);
    }

    //methods with parameters
    public static void paramMethod(String name){
        System.out.println("Your name is " + name);
    }

    /* Reutrn Statements 
     * These methods return a value
     * The value returned must be specificed
     * by replacing 'void' with the appropriate type
    */
    public static int returnInt(int number){
        number++;

        return number; 
    }

}