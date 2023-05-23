//6.	Write a java program to find the sum of elements in an array
public class Sum_of_elements_in_an_array {
    public static void main(String[] args) {
        //Initialize array
        int [] array1 = new int [] {1, 2, 3, 4, 5};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
