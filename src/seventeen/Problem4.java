package seventeen;

import java.util.ArrayList;

/*
Problem 4 — On Task
There’s so much to do these days! Homework, sports, hobbies, socializing, watching
over the flock, shearing, taking the wool to market—it seems like it never ends! To further
complicate matters, sometimes one task must be done before another can be done, such as
making sure that the sheep dip is on hand before the sheep are treated for parasites. Also,
in some cases, tasks will need to be done simultaneously. For example, Sheila likes to
listen to music as she dips sheep, so you’ll need to schedule Bruce the DJ to raise the roof
while the sheep dip is taking place.
To help you manage your busy life, you decide to write a program to schedule your
tasks. Each task is identified by a capital letter (A, B, C, etc.) Ordering constraints can be
specified: A<B means that task A must be done before task B, and A=B means that tasks
A and B must be done simultaneously.
Program input: Each line of input specifies a list of tasks (separated by commas, no
spaces), followed by a series of zero or more constraints (separated by spaces) of the form
X<Y or X=Y, where X and Y are tasks. As a special case, a line containing the text quit
indicates the end of input, and when encountered the program should exit without any
further output. Example input:
A,B,C,D A<C B<D
A,B,C,D A<C B<D A=B
A,B,C,D A<C B<D A=B C=D
A,B,C,D D<A D<B C=D
A,B,C,D D<A A=B B=C
A,B,C,D C<B
A,B,C A<B B<A
A,B,C A<B B<C C<A
quit
Program output: For each input to the program (other than quit), the program should
output a line of text with a schedule. A schedule consists of the text Order:, followed by
a space, followed by a sequence of steps separated by spaces. Each step consists of one
or more comma-separated tasks in alphabetical order. A step will have multiple tasks
only if there are constraints specifying that tasks must be scheduled simultaneously. The
schedule must honor all of the constraints specified by the input, and must include all
of the tasks. In the absence of an explicit ordering constraint, steps should be ordered
alphabetically by the “smallest” (alphabetically earliest) task in each step. As a special
case, if there is no possible schedule that satisfies the ordering constraints, the output line
should consist of the text No schedule. Example output (corresponding to the example
input above):
Order: A B C D
7
Order: A,B C D
Order: A,B C,D
Order: C,D A B
Order: D A,B,C
Order: A C B D
No schedule
No schedule
*/

public class Problem4{
    public static void main(String[] args){
        ArrayList<String> inputs = new ArrayList<String>();
        
        inputs.add("A,B,C,D A<C B<D");
        inputs.add("A,B,C,D A<C B<D A=B");
        inputs.add("A,B,C,D A<C B<D A=B C=D");
        inputs.add("A,B,C,D D<A D<B C=D");
        inputs.add("A,B,C,D D<A A=B B=C");
        inputs.add("A,B,C,D C<B");
        inputs.add("A,B,C A<B B<A");
        inputs.add("A,B,C A<B B<C C<A");

        for(String i : inputs){
            System.out.println("Order:\t" + order(i));
        }
    }

    public static String order(String raw){
        ArrayList<String> objectives = new ArrayList<String>();
        ArrayList<String> commands = new ArrayList<String>();

        char[] raw_viewable = raw.toCharArray();

        for(int i = 0; i < raw_viewable.length; i++){
            if(raw_viewable[i + 1] == ' ' && commands.size() == 0){
                objectives.add("" + raw_viewable[i]);
        
            }

            if(raw_viewable[i] == '<' || raw_viewable[i] == '>' || raw_viewable[i] == '='){
                commands.add("" + raw_viewable[i-1] + raw_viewable[i] + raw_viewable[i+1]);
                i++;
            }
        }



        return "";
    }
}