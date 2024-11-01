import java.util.Scanner;

public class WhileMultiple06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple;
        int sum = 0;
        int counter = 0;
        Double avg;

        System.out.print("Input the multiple: ");
        multiple = input.nextInt();

        int i = 1;
        while(i <= 50) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
            i++;
        }

        avg = (double)sum / counter;

        System.out.printf("There are %d number that are multiple of %d range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of multiples of %d in range 1 to 50 is %d.\n", multiple, sum);
        System.out.print("The average of sum and counter is " + avg + ".");
    }
}
