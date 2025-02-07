import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int [][] target = targetCreator();
        char[][] board = initializeBoard();

        System.out.println("All set. Get ready to rumble!");
        displayBoard(board);
        System.out.println();

        while (!isEmpty(target, board)) {
            int[] coordinates = coordinatesTaker();

            if (isTarget(target, coordinates)) {
                board[coordinates[0]][coordinates[1]] = 'X';
            } else {
                board[coordinates[0]][coordinates[1]] = '*';
            }
            displayBoard(board);
            System.out.println();
        }

        System.out.println("You have won!");
        scanner.close();
    }

    static int[][] targetCreator() {
        int[][] target = new int[3][2];
        int x,y;
        if(random.nextInt() % 2 == 0) {       // horizontal
            x = random.nextInt(0,5);
            y = random.nextInt(0,3);
            for(int i = 0; i < 3; i++) {
                target[i] = new int[]{x, y + i};
            }
        }
        else {
            x = random.nextInt(0,3);
            y = random.nextInt(0,5);
            for(int j = 0; j < 3; j++) {
                target[j] = new int[]{x + j, y};
            }
        }
        return target;
    }

    static boolean isEmpty(int [][] target, char[][] board) {
        for(int i = 0; i < target.length; i++) {
            if(board[target[i][0]][target[i][1]] !=  'X') {
                return false;
            }
        }
        return true;
    }

    static boolean isTarget(int[][] target, int[] coordinates) {
        for (int i = 0; i < target.length; i++) {
            if(Arrays.equals(target[i], coordinates)) {
                return true;
            }
        }
        return false;
    }

    static char[][] initializeBoard() {
        char[][] board = new char[5][5];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
        return board;
    }

    static int[] coordinatesTaker() {
        int[] numbers = new int[2];
        int x, y;
        while(true) {
            System.out.print("Enter the coordinates: ");
            if(scanner.hasNextInt()) {
                x = scanner.nextInt();
                if(x >= 1 && x <= 5) {
                    if (scanner.hasNextInt()) {
                        y = scanner.nextInt();
                        if(y >= 1 && y <= 5) {
                            numbers[0] = x - 1;
                            numbers[1] = y - 1;
                            break;
                        }
                        else {
                            System.out.println("Invalid input!");
                            scanner.nextLine();
                        }
                    } else {
                        System.out.println("Invalid input!");
                        scanner.nextLine();
                    }
                }
                else {
                    System.out.println("Invalid input!");
                    scanner.nextLine();
                }
            }
            else {
                System.out.println("Invalid input!");
                scanner.nextLine();
            }
        }
        return numbers;
    }

    static void displayBoard(char[][] board) {
        System.out.println(" 0 | 1 | 2 | 3 | 4 | 5 |");
        for(int i = 0; i < board.length; i++) {
            System.out.printf(" %d |", i + 1);
            for(int j = 0; j < board[i].length; j++) {
                System.out.printf(" %c |", board[i][j]);
            }
            System.out.println();
        }
    }
}
