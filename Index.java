/**
 * This program is an algorithm used to perform encryption and decryption.
 * It implements three different "ciphers" - the Caesar cipher, the
 * Substitution cipher, and the Rail Fence cipher.
 * It outputs the encrypted or decrypted message as per user's requirement
 * based on the type of cipher they choose to use.
 * 
 * @author Srikar.C->Srikaludev(GitHub)
 */
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Index {

    public static void main(String[] args) {
        boolean quitInput = false;
        Scanner in = new Scanner(System.in);

        while (!quitInput) {
            System.out.println("Cipher Program - Please choose an option");
            System.out.println("");
            System.out.println("C - Caesar");
            System.out.println("R - Rail Fence");
            System.out.println("S - Substitution");
            System.out.println("Q - Quit");
            System.out.println("");

            System.out.print("Option: ");
            String cipher = in.next();
            char cipherType = cipher.charAt(0);

            if (cipherType == 'c' || cipherType == 'r' || cipherType == 's' || cipherType == 'q') {
                cipherType = Character.toUpperCase(cipherType);
            }

            if (cipher.length() != 1
                    || (cipherType != 'C' && cipherType != 'R' && cipherType != 'S' && cipherType != 'Q')) {
                System.out.println("Invalid option");
                System.out.println("");
            } else if (cipherType == 'Q') {
                quitInput = true;
            } else {
                System.out.print("E-ncrypt/D-ecrypt: ");
                String crypt = in.next();
                char cryptType = crypt.charAt(0);

                if (cryptType == 'e' || cryptType == 'd') {
                    cryptType = Character.toUpperCase(cryptType);
                }

                if (crypt.length() != 1 || (cryptType != 'E' && cryptType != 'D')) {
                    System.out.println("Invalid input");
                    System.out.println("");
                } else {
                    String result = "";

                    System.out.print("Phrase: ");
                    in.nextLine(); // Consume newline left-over
                    String phrase = in.nextLine();
                    char[] letters = phrase.toCharArray();
                    boolean encrypt = cryptType == 'E';

                    if (cipherType == 'C') {
                        System.out.print("Shift amount (1-25): ");
                        int shiftAmount = in.nextInt();

                        if (shiftAmount < CaesarCipher.LOWEST_SHIFT || shiftAmount > CaesarCipher.HIGHEST_SHIFT) {
                            System.out.println("Invalid amount");
                        } else {
                            result = CaesarCipher.caesarCipher(letters, encrypt, shiftAmount);
                        }
                    } else if (cipherType == 'S') {
                        result = SubstitutionCipher.substitutionCipher(letters, encrypt);
                    } else if (cipherType == 'R') {
                        result = RailFenceCipher.railFenceCipher(letters, encrypt);
                    }

                    if (!result.isEmpty()) {
                        if (encrypt) {
                            System.out.println("Encrypted phrase: " + result);
                        } else {
                            System.out.println("Decrypted phrase: " + result);
                        }
                        try {
                            printNames(result);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("");
                }
            }
        }

        in.close();
    }

    public static void printNames(String name) throws InterruptedException {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        long timeCharacter = 1;
        List<Character> originalList = new ArrayList<>();
        for (char c : name.toCharArray()) {
            originalList.add(c);
        }

        List<Character> shuffleList = new ArrayList<>();
        for (char c : alphabet.toCharArray()) {
            shuffleList.add(c);
        }
        Collections.shuffle(shuffleList);

        StringBuilder sb = new StringBuilder();

        for (char j : originalList) {
            if (j != ' ') {
                for (char i : shuffleList) {
                    System.out.println(sb.toString() + i);

                    if (i == j) {
                        sb.append(j);
                    }

                    if (sb.toString().equals(name)) {
                        break;
                    }

                    TimeUnit.MILLISECONDS.sleep(timeCharacter);
                }
            } else {
                sb.append(' ');
            }
        }
    }
}
