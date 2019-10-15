package seventeen;

import java.util.ArrayList;

/*
You can’t be too careful with your secrets! To enable you to communicate securely
with your network of agents, you write a program to decrypt secret messages.
The program decrypts using a key, which is a sequence of 26 distinct upper-case letters.
When decrypting an encrypted message, ‘A’ is replaced by whatever letter is in the first
position in the key, ‘B’ is replaced by whatever letter is in the second position, and so
forth.
Program input: The input of the program is a series of pairs of lines of text. The first
line in each pair is a decryption key as described above. The second line in each pair is an
encrypted message. As a special case, if the first line in a pair is the text quit, then the
program should exit immediately without further output. Example input:
FSEOABLITURZKXNYDCQHGVWJPM
WTCO HO QDJFI, JBC FKJIC ADKRC.
IYUCAXFEKWGVBOMHQJRSPNDTZL
HAXPHS BNC CTH DNOUCXHST NS BNC DEV’X WN XPH RNM.
OCVUJDMFBHWIGQTXYRASZELPNK
LH QAD KSYO OA MA TAGVKJVRV, MAOA LT OJV IVTO KSQ OA MVO OJVRV.
quit
Program output: For each input pair (decryption key and encrypted message), the
program should output a single line of text containing the decrypted text. All letters
(A–Z) in the encrypted message should be replaced using the substitution algorithm described above. All other characters (e.g., spaces and punctuation) should be left unmodified. Example output (corresponding to the example input above):
WHEN IN DOUBT, USE BRUTE FORCE.
EITHER YOU USE COMPUTERS OR YOU CAN’T DO THE JOB.
IF YOU WANT TO GO SOMEWHERE, GOTO IS THE BEST WAY TO GET THERE.
 */
public class Problem1 {
	
	static char[] alpha = {
			'A',
			'B',
			'C',
			'D',
			'E',
			'F',
			'G',
			'H',
			'I',
			'J',
			'K',
			'L',
			'M',
			'N',
			'O',
			'P',
			'Q',
			'R',
			'S',
			'T',
			'U',
			'V',
			'W',
			'X',
			'Y',
			'Z'
	};
	
	public static void main(String[] args) {
		String text = "FSEOABLITURZKXNYDCQHGVWJPM\n" + 
				"WTCO HO QDJFI, JBC FKJIC ADKRC.\n" + 
				"IYUCAXFEKWGVBOMHQJRSPNDTZL\n" + 
				"HAXPHS BNC CTH DNOUCXHST NS BNC DEV’X WN XPH RNM.\n" + 
				"OCVUJDMFBHWIGQTXYRASZELPNK\n" + 
				"LH QAD KSYO OA MA TAGVKJVRV, MAOA LT OJV IVTO KSQ OA MVO OJVRV.";
		
		//ArrayList<String> text = new ArrayList<String>();
		
		int key = 1;
		System.out.print(transform(text, key));
	}
	
	public static String transform(String text, int key) {
		String decrypted = "";
		char[] encrypted = text.toCharArray();
		
		for(char i : encrypted) {
			if(i == ' ' || i == '\n') {
				decrypted += i;
				continue;
			}
			for(int h = 0; h < alpha.length; h++) {
				if(alpha[h] == i) {
					int location = (h+1) % alpha.length;
					decrypted += alpha[location];
				}
			}
		}
		
		return decrypted;
		
	}
}
