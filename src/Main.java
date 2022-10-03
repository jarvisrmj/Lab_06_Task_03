import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double bigSide = 0;
        double smallSide = 0;
        String trash = "";
        double perimeter = 0;
        double diagonal = 0;
        double diagonal_2 = 0;

        System.out.println("Enter the size of the larger side");
        if (in.hasNextDouble()) {
            bigSide = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        System.out.println("Enter the size of the smaller side");
        if (in.hasNextDouble()) {
            smallSide = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        perimeter = (2 * bigSide) + (2 * smallSide);
        System.out.println("The perimeter is: " + perimeter);

        diagonal = (bigSide * bigSide) + (smallSide * smallSide);
        diagonal_2 = Math.sqrt(diagonal);
        System.out.println("The diagonal is: " + diagonal_2);
        {

        }
    }
}
