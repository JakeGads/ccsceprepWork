import java.util.ArrayList;

/*
 * Postfix notation, also known as “reverse Polish notation” (RPN), is a way of writing
mathematical expressions in an unambiguous way. A postfix expression has the form
operand operand operator
In other words, the operator (such as + for addition, − for subtraction, etc.) goes after
the operands. Contrast this with an infix expression, where the operator goes between the
operands. Infix expressions are inherently ambiguous. For example,
a + b × 3
could mean either
a + (b × 3)
or
(a + b) × 3
In practice, we treat the first interpretation as the “correct” one because multiplication has
a higher precedence than addition. In postfix notation, no such ambiguity exists. The first
interpretation (do the multiplication first) would be written as
a b 3 × +
The second interpretation (do the addition first) would be written as
a b + 3 ×
Your task is to implement a calculator for evaluating postfix expressions consisting
of integers, variables, and the operators + - * / = . The operators + - * / mean
addition, subtraction, multiplication, and division, respectively. The = operator means
variable assignment: its first operand should be the name of a variable, and its second
operand is the value that should be assigned to the variable. The result of evaluating an
assignment expression is the value assigned. Variable names are single lower case letters
(a–z). Literal integers are a sequence of one or more digit characters (0–9), optionally
preceeded by a minus sign (-) to indicate a negative value. Both input values and results
can be negative.
Each line of input to the program consists of a single postfix expression to be evaluated. On each input line, the tokens (variables, integer literals, and operators) will be
separated by one or more space characters. Leading or trailing space characters are possible, and should be ignored. As a special case, if the input line is quit, the program
should exit immediately. You can assume that all inputs will be terminated by a quit
line.
7
For each input expression, the program should print a single line of text containing
the result of evaluating the expression. You may assume that any variables used will be
defined using the assignment operator (=) before being used as a value. You may also
assume that the second operand of a division (/) operation will never be zero. Division
operations should truncate: for example, the expression 11 2 / should evaluate to the
result 5 .
Example input:
a 3 =
b 3 a * =
a b 3 * +
a b + 3 *
19 6 -
4 c 11 = *
c
-3 5 *
3 41 -
quit
Example output (corresponding to the example input above):
3
9
30
36
13
44
11
-15
-38
 */
public class Problem4 {
	static char[] opperands = {'+', '-', 'x', '*', '/'};
	static char end = '=';
	
	public static void main() {
		ArrayList<String> inputs = new ArrayList<String>();
		inputs.add("a 3 =");
		inputs.add("b 3 a * =");
		inputs.add("a b 3 * +");
		inputs.add("a b + 3 *");
		
		for(String i : inputs) {
			math(i);
		}
	}
	
	public static void math(String input) {
		
	}
}

