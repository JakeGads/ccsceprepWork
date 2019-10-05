package twenty18;

/*
 Consider the following configuration of dominoes represented by a sequence of characters:
||| /||| _
The | character represents an upright domino, the / character represents a domino that is
tipping over, the _ character represents a domino that has fallen (and is horizontal), and
a space represents a gap without a domino.
Your task is to implement a simulation showing the subsequent time steps following
an arbitrary initial configuration, according to the following rules. On each time step,
• Each tipping domino will cause its neighbor to the right to change from upright to
tipping, if the neighbor is currently upright
• Any tipping dominoes will change to horizontal
• All other positions in the sequence will remain unchanged
Your simulator should simulate as many time steps as necessary until a quiescent state is
reached (where no further changes will occur.)
The input to the program is a series of domino configurations, one per line. You may
assume that a domino configuration will have at most 40 positions. Leading and trailing
whitespace on each line should be ignored. As a special case, if a line consists of the
text quit, the program should exit immediately. You may assume that the input will be
terminated with a quit line.
Example input:
||| /||| _
/||||| /|_|/ ||
||//||||||
||__ _|_ __|
quit
For each input configuration, the program should print the configurations resulting
from each time step of the simulation, starting with the initial configuration, until a quiescent state is reached. After printing the final state, it should print a line consisting of
the text END.
Example output (corresponding to the example input above):
||| /||| _
||| _/|| _
||| __/| _
||| ___/ _
5
||| ____ _
END
/||||| /|_|/ ||
_/|||| _/_|_ ||
__/||| ___|_ ||
___/|| ___|_ ||
____/| ___|_ ||
_____/ ___|_ ||
______ ___|_ ||
END
||//||||||
||__/|||||
||___/||||
||____/|||
||_____/||
||______/|
||_______/
||________
END
||__ _|_ __|
EN
 */

public class Problem3 {
	public static void main(String [] args) {
		String myDominos = "||//||||||";
		char[] split = myDominos.toCharArray();
		boolean notDone = true;
		
		String falling = "/";
		String down = "_"
		
		while(notDone) {
			boolean isChange = false;
			for(int i = 0; i < split.length && !isChange; i++) {
				if(split[i].equals)
			}
		}
		
	}
}
