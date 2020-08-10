import java.util.Scanner;

public class SwitchHomeWork1 {

    //1. wap that takes the user provided  number 1 to 12 and output should be monthName i e.january
      //month name (1)- this month is January.
      //month name (2)- this month is December.
    public static void monthName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Enter number 1 to 12 to find out month Name: ");
        int number1to12 = scanner.nextInt();
        switch (number1to12) {
            case 1:
                System.out.println("This month is January");
                break;
            case 2:
                System.out.println("This month is February");
                break;
            case 3:
                System.out.println("This month is march");
                break;
            case 4:
                System.out.println("This month is April");
                break;
            case 5:
                System.out.println("This month is May");
                break;
            case 6:
                System.out.println("This month is June");
                break;
            case 7:
                System.out.println("This month is July");
                break;
            case 8:
                System.out.println("This month is August");
                break;
            case 9:
                System.out.println("This month is September");
                break;
            case 10:
                System.out.println("This month is October");
                break;
            case 11:
                System.out.println("This month is November");
                break;
            case 12:
                System.out.println("This month is December");
                break;
            default:
                System.out.println("This is not a month ");


        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        monthName();
    }










}

































