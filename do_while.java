import java.util.Scanner;

public class do_while {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value ;
        /*value = input.nextInt();

        while(value != 5){
            System.out.println("Enter a number :");
            value = input.nextInt();
        }
        */
        
        do {
            System.out.println("Enter a number: ");
            value = input.nextInt();
        }
        while(value != 5);

        System.out.println("Yaay, Got 5!!");
    }
}
