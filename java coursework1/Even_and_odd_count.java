//5.	Write a java program to count the number of even and odd digits in a number
public class Even_and_odd_count {
    public static void main(String[] args) {
        int number=1234985567,evenCount = 0,oddCount = 0;
        while (number > 0)
        {
            if (number % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            number /= 10;
        }
        System.out.println("the number of even numbers is " + evenCount);
        System.out.println("the number of odd numbers is " + oddCount);
    }
}
