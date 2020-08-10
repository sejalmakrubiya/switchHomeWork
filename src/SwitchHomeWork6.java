import java.util.Scanner;

public class SwitchHomeWork6 {

//6.if you enter  name of the station, you should be able to see the tube stops

    public static void trainStationName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("6.Enter the name of the station = ");
        switch (scanner.nextLine()) {
            case "Northolt" :
                System.out.println("Central Line");
            break;
            case "Wembley park":
                System.out.println("metropolitan line");
            break;
            case "Stratford" :
                System.out.println("Jubilee line");
            break;
            case "Green park" :
                System.out.println("victoria line");
            break;
            case "Northern line" :
                System.out.println("London bridge");
            break;
            default:
                System.out.println("Not a valid station");
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        trainStationName();
    }










}



















