package seventeen;
/*
Disjunctive Normal Form, or DNF, is a way of writing a boolean expression in a canonical form.
Consider a language for writing arbitrary boolean expressions, where ^ means “and”,
+ means “or”, ! means “not”, the letters a, b, c, etc. indicate propositions (statements
that are true or false), and parentheses may be used to explicitly control the order of
evaluation. Here is an example expression (not in DNF):
a^(b+!c)
This expression means “a and (b or not c)”, meaning that the overall expression is true if
and only if both
• a is true, and
• either b is true or c is false (or both)
In DNF, this example expression would be written
(a^!b^!c)+(a^b^!c)+(a^b^c)
An expression written in DNF is some number of terms connected by + (or). Each term
specifies, for all propositions in the original expression, one combination of values (true
or false) which, if assigned to the propositions, will make the original expression true.
For example, in the DNF expression above, the first term indicates that one case where
the original expression is true occurs when a is true, b is false, and c is false.
Your program should read arbitrary boolean expressions and convert them to DNF.
The input expressions use the syntax described above. The ^ operator (“and”) has a
higher precedence than the + operator (“or”). The ! operator (“not”) is a unary prefix
operator. Parentheses may be used arbitrarily for grouping. Input expressions will not
have any whitespace characters (space, tab, etc.)
Requirements for the DNF output are:
• Each term is parenthesized
• The propositions in each term are in alphabetical order
• The terms are ordered such that the assignments of truth values to propositions are
ordered lexicographically (with false being considered less than true); for example,
all terms where the first proposition is false appear earlier than all terms where the
first proposition is true
9
Program input: The input to the program will be a sequence of boolean expressions,
one per line. As a special case, a line of input consisting of the text quit terminates
the input, and should cause the program to exit without generating any further output.
Example input:
a^(b+!c)
(a^b)+!c
a^b+!c
a+!((b)^c)
a^(b+!c)^d
quit
Program output: For each input expression, the program should print a single line
containing the DNF form of the corresponding input expression. Example output (corresponding to the example input shown above):
(a^!b^!c)+(a^b^!c)+(a^b^c)
(!a^!b^!c)+(!a^b^!c)+(a^!b^!c)+(a^b^!c)+(a^b^c)
(!a^!b^!c)+(!a^b^!c)+(a^!b^!c)+(a^b^!c)+(a^b^c)
(!a^!b^!c)+(!a^!b^c)+(!a^b^!c)+(a^!b^!c)+(a^!b^c)+(a^b^!c)+(a^b^c)
(a^!b^!c^d)+(a^b^!c^d)+(a^b^c^d)
*/

/*
a^(b+!c)
(a^!b^!c)+(a^b^!c)+(a^b^c)
*/

public class Problem5{
    public static void main(String[] args){
        System.out.println(DNF("a^(b+!c"));
    }

    public static String DNF(String form){
        char[] dnf = form.toCharArray();
        
        char and = '^', or = '+', not = '!';


        for(int i = 0; i < dnf.length; i++){
            
        }


        return "";
    }
}