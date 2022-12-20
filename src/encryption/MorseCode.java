package encryption;

public class MorseCode {
    
    
    public static String  morseToEnglish(String[] code,String morseCode){
		String[] array = morseCode.split(" ");
                String englishText = "";
//		System.out.print("Morse code " + morseCode
//						+ " to English is ");
		// Morse code to English
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < code.length; j++) {
				if (array[i].compareTo(code[j]) == 0) {
				       englishText += (char)(j + 'a') + " ";
					break;
				}
			}
		}
                return englishText;
	}
    
	public static String englishToMorse(String[] code,String englishLang,char[] letter){
                String morseText = "";
//		System.out.print("Morse code of " + englishLang + " : ");
		for (int i = 0; i < englishLang.length(); i++) {
			for (int j = 0; j < letter.length; j++) {
				if (englishLang.charAt(i) == letter[j]) {
					morseText += code[j] + " ";
					break;
				}
			}
		}
                
                return morseText;
	}


        
        
        
}


    

