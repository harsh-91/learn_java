import java.util.Scanner;

public class getting_user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an Integer: ");
        int value = input.nextInt();
        System.out.println("you have entered " + value);
        
    }
    
}
