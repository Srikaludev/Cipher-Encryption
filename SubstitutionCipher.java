public class SubstitutionCipher {
    public static final char[] SUB_LTRS = {
        'j', 'i', 'd', 'o', 't', 'h', 'u', 'q', 'e', 'w', 'r', 'x', 'k',
        's', 'z', 'c', 'g', 'l', 'p', 'a', 'y', 'b', 'm', 'f', 'n', 'v'
    };

    public static final char[] DEC_SUB_LTRS = {
        't', 'v', 'p', 'c', 'i', 'x', 'q', 'f', 'b', 'a', 'm', 'r', 'w',
        'y', 'd', 's', 'h', 'k', 'n', 'e', 'g', 'z', 'j', 'l', 'u', 'o'
    };

    public static String substitutionCipher(char[] phrase, boolean encrypt) {
        StringBuilder result = new StringBuilder();

        if (encrypt) {
            for (int i = 0; i < phrase.length; i++) {
                if (Character.isLetter(phrase[i])) {
                    if (phrase[i] >= 'A' && phrase[i] <= 'Z') {
                        int subInt = (phrase[i] - 'A');
                        char ch = Character.toUpperCase(SUB_LTRS[subInt]);
                        result.append(ch);
                    } else {
                        int subInt = (phrase[i] - 'a');
                        char ch = SUB_LTRS[subInt];
                        result.append(ch);
                    }
                } else {
                    result.append(phrase[i]);
                }
            }
        } else {
            for (int i = 0; i < phrase.length; i++) {
                if (Character.isLetter(phrase[i])) {
                    if (phrase[i] >= 'A' && phrase[i] <= 'Z') {
                        int subInt = (phrase[i] - 'A');
                        char ch = Character.toUpperCase(DEC_SUB_LTRS[subInt]);
                        result.append(ch);
                    } else {
                        int subInt = (phrase[i] - 'a');
                        char ch = DEC_SUB_LTRS[subInt];
                        result.append(ch);
                    }
                } else {
                    result.append(phrase[i]);
                }
            }
        }

        return result.toString();
    }
}
