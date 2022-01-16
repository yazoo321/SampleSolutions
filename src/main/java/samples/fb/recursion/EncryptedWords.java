package samples.fb.recursion;

public class EncryptedWords {

    String findEncryptedWord(String s) {
        // Write your code here

        StringBuilder sb = new StringBuilder();

        encryptSubstring(0, s.length(), s, sb);

        return sb.toString();

    }

    private void encryptSubstring(int start, int end, String s, StringBuilder sb) {
        int diff = end - start;
        if (diff <= 0) {
            return;
        }

        int mid = diff % 2 == 1 ? start + (diff/2) + 1 : start + (diff/2);

        sb.append(s.charAt(mid - 1));
        encryptSubstring(start, mid-1, s, sb);
        encryptSubstring(mid, end, s, sb);
    }


}
