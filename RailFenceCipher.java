public class RailFenceCipher {

    public static String railFenceCipher(char[] phrase, boolean encrypt) {
        StringBuilder result = new StringBuilder();

        if (encrypt) {
            for (int i = 0; i < phrase.length; i++) {
                if (i % 2 == 0) {
                    result.append(phrase[i]);
                }
            }
            for (int i = 0; i < phrase.length; i++) {
                if (i % 2 == 1) {
                    result.append(phrase[i]);
                }
            }
        } else {
            char[] tempArray = new char[phrase.length];
            int mid = (phrase.length + 1) / 2;
            int evenIndex = 0, oddIndex = 1;  // Change from oddIndex = mid to oddIndex = 1

            // Place characters at even indices (first half of input)
            for (int i = 0; i < mid; i++) {
                if (evenIndex < phrase.length) {  // Add bounds check
                    tempArray[evenIndex] = phrase[i];
                    evenIndex += 2;
                }
            }
           
            // Place characters at odd indices (second half of input)
            for (int i = mid; i < phrase.length; i++) {
                if (oddIndex < phrase.length) {  // Add bounds check
                    tempArray[oddIndex] = phrase[i];
                    oddIndex += 2;
                }
            }
            result.append(tempArray);
        }

        return result.toString();
    }
}