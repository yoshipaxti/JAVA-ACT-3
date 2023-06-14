import java.util.Scanner;
import java.util.Stack;

public class ParenthesisBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sets of parentheses: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the set of parentheses: ");
            String parentheses = scanner.nextLine();

            if (isBalanced(parentheses)) {
                System.out.println("BALANCED");
            } else {
                System.out.println("NOT BALANCED");
            }
        }

        scanner.close();
    }

    private static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < parentheses.length(); i++) {
            char ch = parentheses.charAt(i);

            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
