
package encryption;


public class CeaserCode {
    
    
    public static String encrypt(String message, int shift) {
        
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    char encryptedChar = (char) ((c - 'a' + shift) % 26 + 'a');
                    encrypted.append(encryptedChar);
                } else {
                    char encryptedChar = (char) ((c - 'A' + shift) % 26 + 'A');
                    encrypted.append(encryptedChar);
                }
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }
    
    
        public static String decrypt(String message, int shift) {
        return encrypt(message, 26 - shift);
    }
    
}
