import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";

        String userDay;
        String userTasks;

        while(true) {
            boolean flag = true;
            System.out.print("\nPlease, input the day of the week: ");
            userDay = scanner.nextLine().toLowerCase().trim();
            if (userDay.equalsIgnoreCase("exit")) {
                break;
            }
            for(int j = 0; j < 7; j++) {
                if(userDay.equalsIgnoreCase(schedule[j][0])) {
                    System.out.printf("Your tasks for %s: %s\n", schedule[j][0], schedule[j][1]);
                    flag = false;
                    break;
                }
            }
            if(flag) {
                for (int i = 0; i < 7; i++) {
                    if (userDay.length() > "change".length() && userDay.contains(" ")) {
                        if (userDay.substring(0, 6).equalsIgnoreCase("change") && userDay.substring(userDay.indexOf(" ") + 1).equalsIgnoreCase(schedule[i][0])) {
                            System.out.printf("Please, input new tasks for %s: ", schedule[i][0]);
                            userTasks = scanner.nextLine();
                            schedule[i][1] = userTasks;
                            flag = false;
                            break;
                        }
                    }
                    if (userDay.length() > "reschedule".length() && userDay.contains(" ")) {
                        if (userDay.substring(0, 10).equalsIgnoreCase("reschedule") && userDay.substring(userDay.indexOf(" ") + 1).equalsIgnoreCase(schedule[i][0])) {
                            System.out.printf("Please, input new tasks for %s: ", schedule[i][0]);
                            userTasks = scanner.nextLine();
                            schedule[i][1] = userTasks;
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(flag) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
