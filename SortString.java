import java.util.Arrays;

class SortString {
    public static void main(String[] args) {

        String str = "deepak";

        // Convert string to character array
        char arr[] = str.toCharArray();

        // Sort the array
        Arrays.sort(arr);

        // Convert back to string
        String sorted = new String(arr);

        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sorted);
    }
}