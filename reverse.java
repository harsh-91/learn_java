import java.util.Scanner;

/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
For example, if the input is 12345, the output should be 54321.*/

public class reverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter the number you want to reverse : ");
        int number ;
        number = console.nextInt();
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}