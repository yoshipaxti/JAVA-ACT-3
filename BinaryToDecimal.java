import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of binary numbers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the binary number: ");
            String binary = scanner.nextLine();

            int decimal = convertBinaryToDecimal(binary);
            System.out.println("Decimal equivalent: " + decimal);
        }

        scanner.close();
    }

    private static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);

            if (digit == '1') {
                decimal += Math.pow(2, power);
            }

            power++;
        }

        return decimal;
    }
}
