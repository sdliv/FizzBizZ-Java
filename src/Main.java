import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");

        Integer newNumber = userInput.nextInt();

        for (int i = 1; i <= newNumber; i++) {
            if (i % 56 == 0) {
                System.out.println("LaunchCodeSTL!");
            }else if (i % 4 == 0 && i % 7 == 0) {
                System.out.println("LaunchCode");
            } else if (i % 4 == 0) {
                System.out.println("Launch");
            } else if (i % 7 == 0) {
                System.out.println("Code");
            } else if (i % 56 == 0) {
                System.out.println("LaunchCodeSTL!");
            } else
            {
                System.out.println(i);
            }

        }
    }
}