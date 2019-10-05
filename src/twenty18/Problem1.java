package twenty18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Problem 1 — Big Blue Something
The Big Blue Something Company only sells blue things. The quality control engineer
has set up a machine to spot check the colors of the items coming off the assembly line.
The machine checks each item in several locations (from 2 to 100 locations per item), and
it reports the color at each location. In order for an item to pass quality control, it must be
blue in at least 50% of the locations.
The first line of input contains the number of items that have been checked. Each
other line contains the colors detected in a single item. The colors are separated by spaces.
There is no space at the end of the line. You can assume that colors will be spelled with
lower case letters (a–z). For each item, output whether the item “passed” or “failed” the
quality control check.
Example input:
5
blue red green
blue blue orange red
red green green red blue blue blue red
blue blue red
red orange blue
Example output (corresponding to the example input above):
failed
passed
failed
passed
failed
 * @author jake
 *
 */
public class Problem1 {
	public static void main(String[] args) {
		/*
		Scanner kb = new Scanner(System.in);
		ArrayList<String> myItems = new ArrayList<String>();
		
		System.out.print("How Many Items:\t");
		int items = kb.nextInt();;
		
		kb.nextLine();
		
		for(int i = 0; i < items; i++) {
			System.out.print("Enter Element " + (i + 1) + "\t");
			myItems.add(kb.nextLine());
		}
		
		
		kb.close();
		
		for(int i = 0; i < items; i++) {
			System.out.print(check(myItems.get(i)));
		}
		*/
		
		ArrayList<String> myItems = new ArrayList<String>();
		myItems.add("blue red green");
		myItems.add("blue blue orange red");
		myItems.add("red green green red blue blue blue red");
		myItems.add("blue blue red");
		myItems.add("red orange blue");
		
		for(int i = 0; i < myItems.size(); i++) {
			System.out.println(myItems.get(i) + "\t\t" + check(myItems.get(i)));
		}
		
		
	}
	
	public static String check(String words) {
		String[] colors = words.split(" ");
		String blue = "blue";
		int count = 0;
		for(int i = 0; i < colors.length; i++) {
			if(colors[i].equals(blue)) {
				count += 1;
			}
		}
		
		if(count >= (colors.length / 2.0)) {
			return "passed";
		}
		
		return "failed";
	}
}
