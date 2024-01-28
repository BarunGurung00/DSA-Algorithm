public class Recursion{

    // Recursion is the process of repeating items in a self-similar way.
    // We start with a base case, and then we have a recursive case that calls the function again with a different argument.
    // The recursion continues until we reach our base case.
    public static void main(String[] args){
        System.out.println(factorial(4));
    }   

    public static int factorial(int num){
        if(num <= 1) return 1;
        return num * factorial(num -1);
    }
}