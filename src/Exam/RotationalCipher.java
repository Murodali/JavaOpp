package Exam;

public class RotationalCipher {
    public int shiftKey;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    RotationalCipher(int shiftKey){
        this.shiftKey = shiftKey;
    }

    String rotate(String data){
        String res = "";
        for (int i = 0; i < data.length(); i++) {
            char letter = data.charAt(i);
            boolean isUpperLetter = Character.isUpperCase(letter);
            letter = Character.toLowerCase(letter);
            int k = 0;
            int indicator = 0;
            for (int j = 0; j < alphabet.length(); j++) {
                if (alphabet.charAt(j) == letter){
                    k = j;
                    indicator++;
                    break;
                }
            }
            if (indicator != 1) {
                res+= letter;
                continue;
            }
            k += this.shiftKey;
            k %= 26;
            if (isUpperLetter) letter = Character.toUpperCase(alphabet.charAt(k));
            else letter = alphabet.charAt(k);
            res += letter;
        }

        return res;
    }
}
