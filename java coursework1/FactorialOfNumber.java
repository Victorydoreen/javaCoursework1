//3.	Write a Java program to find the factorial of a number
//  Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!.
public class FactorialOfNumber {
    public static void main(String args[]){
//         innitializing the numbers
            int x, factorial=1;
            int myNumber=6;
            //where myNumber is the number we are calculating factorial for
            for(x=1;x<=myNumber;x++){
                factorial=factorial*x;
            }
            System.out.println("The Factorial of "+myNumber+" is: "+factorial);

    }
}
