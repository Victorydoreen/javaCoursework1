//2.	Write a Java program to find the largest of 3 numbers
public class LargestNumber {
    public static void main(String[] args)
    {
//initializing numbers to compare
        int m=10, n=25, p=9;
//comparing numbers, m with n and m with p
//if both conditions are true, it prints m
        if(m>=n && m>=p)
            System.out.println(m+" is the largest Number");
//comparing n with m and n with p
//if both conditions are true, it prints n
        else if (n>=m && n>=p)
            System.out.println(n+" is the largest Number");
        else
//it prints p if the above conditions are false
            System.out.println(p+" is the largest number");
    }
}
