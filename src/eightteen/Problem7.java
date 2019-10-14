package eightteen;
/*
It is important for Gerald Thermaine to keep things organized. He has large collections
and once per year he rearranges the collections to their optimal configurations.
For each of his collections, Gerald wants to know how many ways there are to arrange
the items in a line. Some of the items in a collection are indistinguishable. Others are
special. For example, he has a collection of bottlecaps. He has 8 unique bottlecaps, as
well as 15 bottlecaps of his favorite drink (Yum-E Soda) and 10 bottlecaps of his secondfavorite drink (PrettyGood NRG Drink).
The first line of input gives the number of collections that Gerald has. Each other line
of input represents one collection. The first number on a line is the number of unique
items in the collection. Each other number on the line represents a group of identical
items. There may be up to 10 different groups of identical items. Each group may contain 2 to 200 identical items. The first collection in the sample input represents Gerald’s
bottlecap collection. The total number of ways to arrange a collection will not exceed
9,200,000,000,000,000,000. For each collection, output the number of ways Gerald could
arrange his collection in a line.
Example input:
7
8 15 10
6 8 5
4 5 4 3
1 200
4
0 100 10
0 150
Example output (corresponding to the example input above):
1829881822267699200
25141596480
1210809600
201
24
46897636623981
1
*/

import java.util.ArrayList;

public class Problem7 {
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("8 15 10");
		input.add("6 8 5");
		input.add("4 5 4 3");
		input.add("1 200");
		input.add("4");
		input.add("0 100 10");
		input.add("0 150");	
	}
	
	public static int combinations(String list_number) {
		String[] temp = list_number.split(" ");
		int[] numbers = new int[temp.length];
		for(int i = 0; i < temp.length; i++) {
			numbers[i] = Integer.parseInt(temp[i]);
		}
		
		return numbers[0];
	}
	
	public static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static int permutation(int n, int r) {
		return factorial(n) / factorial(n - r);
	}
	
	public static int choice(int n, int r) {
		return factorial(n) / (factorial(n-r) * factorial(r));
	}
}
