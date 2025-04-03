import java.util.Scanner;

public class gcdpal {
     public static int gcm(int a, int b) {
        int i;
        if (a < b)
            i = a;
        else
            i = b;

        for (; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
 
        return 1;
    }

    public static boolean isPalindrome(String string){
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) != string.charAt(string.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int b = scanner.nextInt();
        
        int gcd = gcm(a,b);
        System.out.println("The greatest common divisor for " + a + " and " + b + " is " + gcd);
        
        scanner.nextLine();
        
        System.out.println("Enter a word: ");
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s));
        
        scanner.close();
    }
}
