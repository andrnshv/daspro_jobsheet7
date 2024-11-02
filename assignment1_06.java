import java.util.Scanner;

public class assignment1_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInput;
        String s = " ";

        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for(int i = numInput; i > 0 ; i--) {
            s = "* ".repeat(i);
            System.out.println(s);
        }

    }
}
