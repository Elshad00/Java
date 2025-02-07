import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randNum = random.nextInt(0 , 101);
        int guess;
        int[] numbers = {};

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Let the game begin!");

        while(true) {
            System.out.print("Enter a number between 0-100: ");
            if(scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess >= 0 && guess <= 100) {
                    if (guess < randNum) {
                        System.out.println("Your number is too small. Please, try again.");
                        numbers = Arrays.copyOf(numbers, numbers.length + 1);
                        numbers[numbers.length - 1] = guess;
                    } else if (guess > randNum) {
                        System.out.println("Your number is too big. Please, try again.");
                        numbers = Arrays.copyOf(numbers, numbers.length + 1);
                        numbers[numbers.length - 1] = guess;
                    } else {
                        System.out.println("Congratulations, " + name + "!");
                        numbers[numbers.length - 1] = guess;
                        break;
                    }
                }
                else {
                    System.out.println("Invalid input. Please enter an integer between 0-100.");
                }
            }
            else {
                System.out.println("Invalid input. Please enter an integer between 0-100.");
                scanner.next();
            }
        }

        System.out.print("\nYour numbers: ");
        for(int i : numbers) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
