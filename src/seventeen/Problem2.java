package seventeen;

import java.util.ArrayList;

/*
You are one of the world’s premier designers of two-dimensional roller coasters. You
live by three principles:
1. The ride must be fun
2. The car must reach the end of the track
3. The riders must survive
You uphold the first principle through years of experience and an unwavering devotion
to your art. Upholding the second and third principles, however, is a bit trickier!
Fortunately, through the magic of computation, you can simulate two-dimensional
roller coaster physics, and be sure that (1) your riders reach the end of the track, and (2)
reach it alive. You have developed your own notation for describing a 2-D coaster. An
example:
\\_/_\\\_/\
Each \ character indicates a downward slope, each _ character indicates a level grade, and
each / character indicates an incline. The example above corresponds to the following
roller coaster:
\ _
\_/ \
\
\_/\
The car moves from left to right, starting at the leftmost position. Its velocity is initially
0. Each downward slope increases the car’s velocity by 1. Each incline decreases the car’s
velocity by 1. Level grades do not change the car’s velocity. The car only moves forward
if its velocity is positive.
The simulation tracks the car’s velocity and location. If the car moves past the last
position, then it is considered to reach the end of the track—that’s good! However, if
the car’s final velocity is 10 or greater, the car is considered to have crashed, dooming its
riders—that’s not good.
Program input: Each line of input contains a 2-D roller coaster specification using the
notation described above. As a special case, a line of input consisting of the text quit
indicates the end of input, and the program should terminate immediately without any
further output. Example input:
\\_/_\\\_/\
_\\\_/_\
\\\_\_//_//_
\\\_/\\\\\\_//_\\\\\\_\\_
3
\\\_/\\\\\\_//_\\\\\\_\\_/////
\\\_/\\\\\\_//_\\\\\\_\\_////
\\_\__\\_/__//_//
\_//_\\\\\
quit
Program output: For each input (other than quit), the program should print a single
line of output with one of the following responses:
• Whee! if the car reached the end of the track and did not crash
• Splat! if the car reached the end of the track and crashed
• Stopped at N if the car did not reach the end of the track, where N is the position
where the car stopped (the leftmost position being 0)
Example output (corresponding to the example input above):
Whee!
Stopped at 0
Stopped at 10
Splat!
Whee!
Splat!
Stopped at 16
Stopped at 2
*/
public class Problem2 {
	public static void main(String[] args) {
		ArrayList<String> inputs = new ArrayList<String>();
		inputs.add("\\\\\\\\_/_\\\\\\\\\\\\_/\\\\");
		inputs.add("_\\\\\\_/_\\");
		inputs.add("\\\\\\_/\\\\\\\\\\\\_//_\\\\\\\\\\\\_\\\\_");
		inputs.add("\\\\\\_/\\\\\\\\\\\\_//_\\\\\\\\\\\\_\\\\_/////");
		inputs.add("\\\\_\\__\\\\_/__//_//");
		inputs.add("\\_//_\\\\\\\\\\");
		
		for(String i : inputs) {
			System.out.println(roll(i));
		}
	}
	public static String roll(String layout) {
		int velocity = 0;
		char[] tracks = layout.toCharArray();
		// int i = 0; i < tracks.length; i++
		for(char track : tracks) {
			if(track == '\\') {
				velocity++;
			}
			else if(track == '/') {
				velocity--;
			}
			
			if(velocity < 0) {
				return "Oh no we ran out of velocity";
			}
		}
		
		if(velocity >= 10) {
			return "Oh no they died";
		}
		
		return "Wowza looks like a fun time";
	}
}
