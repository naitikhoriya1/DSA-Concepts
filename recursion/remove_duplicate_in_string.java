public class remove_duplicate_in_string {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.print(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // If not visited then visit the node and print the character.
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str = "apnaacollage";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}