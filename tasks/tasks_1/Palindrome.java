import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.print(isPalindrome(word));
    }
    public static boolean isPalindrome(String word){
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reversed = reversed + word.charAt(i);
        }
        return reversed.equals(word);
    }
}
