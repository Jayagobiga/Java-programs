import java.util.Scanner;

public class FindCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character to be searched: ");
        char targetChar = scanner.nextLine().charAt(0);
        scanner.close();

        int index = inputString.indexOf(targetChar);

        if (index != -1) {
            System.out.println(targetChar + " is found in string at index: " + (index + 1));
        } else {
            System.out.println(targetChar + " is not found in the string.");
        }
    }
}
