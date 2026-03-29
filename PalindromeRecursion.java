
import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker");
        System.out.println("Entre the string you want to check");
        String str = scanner.next();


    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int last = str.length()-1;
        if (str.charAt(0)!=str.charAt(last)){
            return false;
        }
        String newString = str.substring(1, last) ;
        return isPalindrome(newString);
        
    }
        
    }
    


