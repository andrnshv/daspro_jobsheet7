import java.util.Scanner;

public class TheTriangle06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInput;
        String s = " ";

        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for(int i = 0; i < numInput ; i++) {
            s = "* " + s;
            System.out.println(s);
        }
    }
}
