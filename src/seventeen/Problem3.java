package seventeen;
/*
You are one of the world’s most celebrated ASCII artists! Your medium is text, and
letters, numbers, and symbols are your palette.
To help you create your compositions more efficiently, you decide to write a program
to do flood fill, which allows you to replace all occurrences of a selected character in a
contiguous region with a fill character. It works like this:
• A composition is a grid of text characters
• You select a particular character in the grid (specifying its row and column)
• All reachable occurrences of the selected character are replaced by a chosen fill character
• An occurrence is “reachable” if it can be reached from the location of the selected
character by some sequence of up, down, right, and/or left moves without ever
encountering a character other than the selected character
Program input: The program input consists of a series of specifications. Each specification starts with a line specifying integer width, height, x, and y values, followed by
a single character, which is the fill character. Then, a number of input lines equal to the
height value follows, with each line specifying the characters forming one row of the
composition grid. As a special case, if a specification starts with an input line consisting
of the text quit, then the program should exit immediately without any further output.
Example input:
16 7 8 5 o
................
................
....#######.....
...#......#.....
....#......####.
...#............
..#.............
16 7 8 5 o
................
................
....#######.....
...#......#.....
....#......#####
...#............
..#.............
quit
5
Program output: For each specification in the input the program should print an output grid showing the results of performing a flood fill at the location specified by the x
and y coordinates. Note that coordinate value 0 (zero) indicates the leftmost column (x)
or topmost row (y). Starting from the location of the flood fill, all reachable occurrences of
the selected character should be replaced with the fill character. Each output grid should
be separated with a single blank line. Example output (corresponding to the input above):
oooooooooooooooo
oooooooooooooooo
oooo#######ooooo
ooo#oooooo#ooooo
oooo#oooooo####o
ooo#oooooooooooo
oo#ooooooooooooo
................
................
....#######.....
...#oooooo#.....
....#oooooo#####
...#oooooooooooo
..#ooooooooooooo
 */
public class Problem3 {

}
