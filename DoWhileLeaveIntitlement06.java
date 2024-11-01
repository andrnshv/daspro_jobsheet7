import java.util.Scanner;

public class DoWhileLeaveIntitlement06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation =  " ";

        System.out.print("Input The Number of Leave Entitlement: ");
        leaveEntitlement = input.nextInt();


        do {
            System.out.print("Do you want take a leave (y/n)? or stop (t) " );
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("t")) {
                System.out.print("Stop the loop");
                break;
            }

            if(confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)?: ");
                numLeave = input.nextInt();

                if(numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Reamaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You dont have enough leave entitlement ");
                }
            }
        } while(leaveEntitlement > 0);
    }
}
