
//1.	Write a Java program to swap 2 numbers
public class SwappingNumbers {
    public static void main(String[] args) {
        int first = 10;
        int second = 32;

        System.out.println("--Before swapping--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swapping--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
