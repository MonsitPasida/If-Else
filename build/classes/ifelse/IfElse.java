package ifelse;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        String username = "siamcodes";
        String password = "1234";
        Scanner sn = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

        //คำสั่ง If else
        if (username == "siamcodes" && password == "1234") {
            System.out.println("Ko.");
        } else {
            System.out.println("No.");
        }

        //คำสั่ง Else-If
        System.out.println("\t-----------------------------------------");
        System.out.println("\tScore Evaluation Program");
        System.out.print("กรุณาป้อมข้อมูลอยู่ระหว่าง 0-100: ");
        int score = sn.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("You must enter a correct score, try again later.");
        } else {
            if (score >= 80) {
                System.out.println("Your score is excellent.");
                System.out.println("You grant grade S.");
            } else if (score >= 60) {
                System.out.println("Your score is good.");
                System.out.println("You grant grade A.");
            } else if (score >= 40) {
                System.out.println("Your score is fair.");
                System.out.println("You grant grade B.");
            } else {
                System.out.println("Your score is poor.");
                System.out.println("You grant grade C.");
            }
        }

        //คำสั่ง Switch
        System.out.println("\t-----------------------------------------");
        System.out.print("What\'s floor do you want to go: ");
        char floor = reader.next().charAt(0);
        switch (floor) {
            case 'G':
                System.out.println("Elevator is going to ground floor.");
                break;
            case '1':
                System.out.println("Elevator is going to first floor.");
                break;
            case '2':
                System.out.println("Elevator is going to second floor.");
                break;
            case '3':
                System.out.println("Elevator is going to third floor.");
                break;
            default:
                System.out.println("Elevator don't know where to go.");
        }
    }
}
