public class CaesarCipher {
    public static final int HIGHEST_SHIFT = 25;
    public static final int LOWEST_SHIFT = 1;
    public static final int ALPHABETS = 26;

    public static String caesarCipher(char[] phrase, boolean encrypt, int shiftAmount) {
        if (shiftAmount < LOWEST_SHIFT || shiftAmount > HIGHEST_SHIFT) {
            throw new IllegalArgumentException("Invalid amount");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < phrase.length; i++) {
            if (Character.isLetter(phrase[i])) {
                if (phrase[i] >= 'A' && phrase[i] <= 'Z') {
                    int shift = encrypt
                            ? (shiftAmount + phrase[i] - 'A') % ALPHABETS
                            : (-shiftAmount + phrase[i] - 'A' + ALPHABETS) % ALPHABETS;
                    char ch = (char) (shift + 'A');
                    result.append(ch);
                } else {
                    int shift = encrypt
                            ? (shiftAmount + phrase[i] - 'a') % ALPHABETS
                            : (-shiftAmount + phrase[i] - 'a' + ALPHABETS) % ALPHABETS;
                    char ch = (char) (shift + 'a');
                    result.append(ch);
                }
            } else {
                result.append(phrase[i]);
            }
        }

        return result.toString();
    }
}
