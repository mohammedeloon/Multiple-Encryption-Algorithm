
package encryption;

public class Encryption {

   
    public static void main(String[] args) {
        
        String normalText = "encryption is good";
        System.out.println("The Original text: "+ normalText);
        
        String encryptedText = CeaserCode.encrypt(normalText, 3);
        System.out.println("The Encrypted Text: " + encryptedText);
        
        
         // store the all the alphabet in an array
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                            'g', 'h', 'i', 'j', 'k', 'l',
                            'm', 'n', 'o', 'p', 'q', 'r',
                            's', 't', 'u', 'v', 'w', 'x',
                            'y', 'z', '1', '2', '3', '4',
                            '5', '6', '7', '8', '9', '0' };
       // Morse code by indexing
        String[] code
                = { ".-", "-...", "-.-.", "-..", ".",
                        "..-.", "--.", "....", "..", ".---",
                        "-.-", ".-..", "--", "-.", "---",
                        ".--.", "--.-", ".-.", "...", "-",
                        "..-", "...-", ".--", "-..-", "-.--",
                        "--..", "|" };

        // English to morse code
        String MorseText = MorseCode.englishToMorse(code, encryptedText, letter); 
        System.out.println("Morse code of "+ encryptedText + ": " + MorseText);
	System.out.println(" ");

 // Given Strings
        String morseCode = "... -.-. .... --- --- .-..";
        System.out.println("The original morse code to be decrypted: "+ MorseText);
       
        // morse to English
        String EnglishText =   MorseCode.morseToEnglish(code, MorseText);
        System.out.println("The English text of morse cipher: " + EnglishText);
        
        String decryptedText = CeaserCode.decrypt(EnglishText, 3);
        System.out.println("The decrypted Text: " + decryptedText);





    }
    
}
