import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args) {

        // 1.create an array
        int [] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        //2.Loop through the array
        for (int i = 0; i < 10; i++){
            sum = sum + numbers[i];
        }
        System.out.println("The total sum of the elements in the array is: " + sum);
        System.out.println(); //just a space

        //3. array that holds 10 number inputs
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        int sum2 = 0;
        int [] numInput = new int [10];
        for(int i = 0; i < 10; i++){
            int input = key.nextInt();
            numInput[i] = input;
            sum2 = sum2 + numInput[i];
        }

        System.out.println("The sum of the input numbers are: " + sum2);

        //4.


    }
}
