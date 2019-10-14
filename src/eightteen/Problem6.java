package eightteen;
/*
 * In the game BoggleTM, letters are arranged randomly on a grid, and the goal is to
find words that can be spelled by starting at a particular grid location and continuing
up, down, left, right, or diagonally to neighboring grid locations. Visiting the same grid
location twice or more within a single path is not allowed. For example, consider the
following grids. The grid on the left is an example configuration. The arrows on the grid
on the right show a path which spells the word “year” within the example configuration.
Your task is to write a program that, when given an arbitrary list of words and one or
more arbitrary Boggle grids, finds all paths within the grids which spell any of the words
in the word list. A grid can be any size up to 26x26, and is not necessarily square. It is
possible that a single word will occur multiple times in a single grid, in which case the
program should find paths for all occurrences. A path is listed as a comma-separated (no
spaces) sequence of coordinates, where letters A–Z specify the row (A is the top row) and
numbers 0–25 indicate the columns (0 is the left column). For example, the coordinate B2
indicates the second row and the third column. All of the words and the configuration of
the Boggle grid will consist exclusively of lower-case letters (a–z).
The input starts with a list of words, one word per line, terminated by a line consisting
of the text END. (Note that END should not be considered to be a word.) You can assume
there will be no more than 200 words, and that no word is more than 20 letters long.
Then, there is a sequence of 1 or more Boggle grid configurations. A grid configuration
starts with a line specifying the grid size as the number of rows followed by the number
of columns (both integers, separated by a space.) Next in the grid configuration is one
line per grid row specifying the letters in that row. As a special case, if the grid size line
consists only of the value -1, the program should exit immediately.
Example input:
cat
car
care
year
tree
END
4 4
13
zqxt
ncry
peae
etfr
3 5
ranqm
kects
ydcaw
-1
For each board configuration in the input, the program should print a single line reading Solutions:, followed by the list of paths spelling the words in the word list. The
paths should be ordered lexicographically by comparing pairs of coordinates. Coordinates should be compared first by row, then by column. (Note that, for example, the
coordinate C9 should be before C10, not after, because C9’s column is less than C10’s column.) To break ties where one path is a prefix of another, the shorter path should be
ordered before the longer path.
Example output (corresponding to the example input above):
Solutions:
A3,B2,C1,D0
B1,C2,B2
B1,C2,B2,C1
B1,C2,B2,C3
B1,C2,D1
B1,C2,D3
B1,C2,D3,C3
B3,C3,C2,B2
B3,C3,C2,D3
Solutions:
B2,A1,A0
B2,A1,A0,B1
B2,C3,B3
C0,B1,A1,A0
C2,C3,B3
 */

public class Problem6 {

}
