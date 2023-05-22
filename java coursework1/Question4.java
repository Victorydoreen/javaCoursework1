//4.	Write a java program to count the number of digits in a number
public class Question4 {
    public static void main(String[] args) {
        //number
        int num = 125687901;

        //variable to store count of digits in number
        int count = 0;

        //count number of digits in num
        while(num!=0) {
            num = num/10; //removes last digit of num
            count++;
        }

        //print the count
        System.out.println(count);
    }

}
