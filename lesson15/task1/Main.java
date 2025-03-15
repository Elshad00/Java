import java.util.*;

public class Main {

    public static PerformOperation isOdd() {
        return n -> (n & 1) == 1;
    }

    public static PerformOperation isPrime() {
        return n -> {
            if (n < 2) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            String original = Integer.toString(n);
            String reversed = new StringBuilder(original).reverse().toString();
            return original.equals(reversed);
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        while (cases-- > 0) {
            int condition = scanner.nextInt();
            int number = scanner.nextInt();
            String result = "";
            if (condition == 1) {
                result = isOdd().check(number) ? "ODD" : "EVEN";
            } else if (condition == 2) {
                result = isPrime().check(number) ? "PRIME" : "COMPOSITE";
            } else if (condition == 3) {
                result = isPalindrome().check(number) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(result);
        }
        scanner.close();
    }
}