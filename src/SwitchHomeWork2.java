import java.util.Scanner;

public class SwitchHomeWork2 {


    /*2.input any alphabet from a to f and print their city name accordingly
           ayy other alphabet should be invalid entry
         */
    public static void cityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2.Enter any alphabet from a to f to print their city name:");
        switch (scanner.nextLine()) {
            case "a":
                System.out.println("Ahmadabad");
                break;
            case "b":
                System.out.println("Bombay");
                break;
            case "c":
                System.out.println("china");
                break;
            case "d":
                System.out.println("Delhi");
                break;
            case "e":
                System.out.println("Egypt");
                break;
            case "f":
                System.out.println("France");
                break;
            default:
                System.out.println("invalid entry");

        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cityName();

    }








}




































































































































































































































































































































































































































































































