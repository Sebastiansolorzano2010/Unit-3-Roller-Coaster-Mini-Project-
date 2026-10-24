/*Stores the rider's information.

Constructor saves the rider's four values.

Checks the height, age, and ticket cost.

Returns true if the rider can ride. */
public class RollerCoasterTicket {

    // Instance variables
    private int height;
    private int age;
    private int quarters;
    private boolean riderPass;

    // Constructor
    public RollerCoasterTicket(int height, int age, int quarters, boolean riderPass) 
    {
        this.height = height;
        this.age = age;
        this.quarters = quarters;
        this.riderPass = riderPass;
    }

    // Method to check if the rider can ride
    public boolean canIRide() {
        boolean tallEnough = height > 50 || age > 18;
        int cost;

        if (riderPass) {
            cost = 2;
        } else {
            cost = 4;
        }

        return tallEnough && quarters >= cost;
    }
}
