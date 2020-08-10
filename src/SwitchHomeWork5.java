import java.util.Scanner;

public class SwitchHomeWork5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    /*5.create a function that takes two numbers and a mathematical operator + - / *
    and will perform a calculation with the given numbers.
     */

        System.out.print("Enter any numbers = ");
        double a = scanner.nextInt();
        System.out.print("Enter any numbers = ");
        double b = scanner.nextInt();
        System.out.print("Enter the operator = ");
        switch (scanner.next()) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;


        }


    }


}






























