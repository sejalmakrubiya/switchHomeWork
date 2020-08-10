import java.util.Scanner;

public class SwitchHomeWork3 {

    //3.wap that takes the user provided number 1 to 7 and output should be weekName i.e monday
    // weekName (1)-today is  monday
    // weekName (2)-today is tuesday
    public static void weekName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3.Enter number 1 to 7 to find out week Name: ");
        int number1to7 = scanner.nextInt();
        switch (number1to7) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is tuesday");
                break;
            case 3:
                System.out.println("Today is wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("This is not week");
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        weekName();
    }







}








