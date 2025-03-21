import java.util.*;
import java.util.concurrent.TimeUnit;

public class PrintNames {
    
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String BOLD = "\u001B[1m";

    public static void printNames(String text, long charDelay) throws InterruptedException {
        printNames(text, charDelay, false);
    }

    public static void printNames(String text, long charDelay, boolean isEncrypting) throws InterruptedException {
        Random random = new Random();
        String hackerChars = "!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        
        String operation = isEncrypting ? "ENCRYPTING: " : "DECRYPTING: ";
        System.out.print(GREEN + BOLD + operation + RESET);
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                result.append(' ');
            } else {
                for (int i = 0; i < 5; i++) { 
                    System.out.print("\r" + GREEN + BOLD + operation + RESET + result.toString() + hackerChars.charAt(random.nextInt(hackerChars.length())));
                    TimeUnit.MILLISECONDS.sleep(charDelay);
                }
                result.append(c);
            }
            System.out.print("\r" + GREEN + BOLD + operation + RESET + result.toString());
            TimeUnit.MILLISECONDS.sleep(charDelay);
        }

        String completionMessage = isEncrypting ? "[ ENCRYPTION COMPLETE ]" : "[ ACCESS GRANTED ]";
        System.out.println("\n" + GREEN + completionMessage + RESET);
    }
}
