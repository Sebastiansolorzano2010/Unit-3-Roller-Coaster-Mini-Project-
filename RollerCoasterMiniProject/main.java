/* Gets the rider's information from the user.

 Checks if the user has a frequent rider pass.

 Creates a RollerCoasterTicket object.

 Prints whether the rider can ride. */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner information = new Scanner(System.in)) {
            System.out.println("How tall are you in inches? ");
            int height = information.nextInt();

            System.out.println("How old are you?");
            int age = information.nextInt();

            System.out.println("Do you have a frequent rider pass?");
            String answer = information.next();

            System.out.println("How many quarters do you have?");
            int quarters = information.nextInt();

            boolean riderPass = answer.equalsIgnoreCase("yes");

            RollerCoasterTicket rider = new RollerCoasterTicket(height, age, quarters, riderPass);
            System.out.println(rider.canIRide());
        }
    }
}