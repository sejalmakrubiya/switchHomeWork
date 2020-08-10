import java.util.Scanner;

public class SwitchHomeWork4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*4. create a method that takes an integer returns "even" for even
           integers and "odd" for odd integers.
       */

        System.out.print("Please enter any number = ");
        int a = scanner.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println("Even number");
                break;
            case 1:
                System.out.println("Odd number");
                break;
        }


    }


}
























































