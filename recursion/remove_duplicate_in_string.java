import java.util.Scanner;

public class remove_duplicate_in_string {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.print(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // If not visited then visit the node and print the character.
        if (map[currChar]) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[256]);
        scanner.close(); // Close the scanner
    }
}
