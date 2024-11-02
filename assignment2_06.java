import java.util.Scanner;

public class assignment2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ticket = 0, price = 50000;
        Double total;

        do {
            System.out.print("input the total ticket (or input -1 to stop): ");
            ticket = input.nextInt();
            if (ticket < 0) {
                System.out.print("invalid ticket input!");
                break;
            }
                total = (double)price * ticket;
                if (ticket > 10) {
                    System.out.println("Customers gets a 15% discount");
                    System.out.println("Total tickets sold is " + ticket);
                    System.out.println("Total ticket price is " + (total * 0.85));
                }
                else if(ticket > 4) {
                    System.out.println("Customers gets a 10% discount");
                    System.out.println("Total tickets sold is " + ticket);
                    System.out.println("Total tickets price is " + (total * 0.90));
                }
        }while(ticket > 0);
    }
}
