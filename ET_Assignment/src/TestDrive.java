import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;



/*
 * TestDrive.java
 */

/**
 * @author Kristopher Brown
 * 
 * An assignment for an interview process. Takes in values from a given CSV file
 * separates the entries by age. Reads the entries out grouped by state and age
 *
 */
public class TestDrive {
	
	/**
	 * @param args - Command line argument, should be a direct link to a csv file
	 * @throws FileNotFoundException 
	 * 
	 */
	public static void main(String[] args){
		
		ArrayList<TableEntry> entries30Plus = new ArrayList<TableEntry>();
		ArrayList<TableEntry> entries29Less = new ArrayList<TableEntry>();
		
		/*
		 * Usage statement
		 */
		if(args.length == 0){
			System.out.println("No Command line argument.\n"
					+ "Usage: java TestDrive [csv link]");
			System.exit(0);
		}
		
		
		/*
		 * Parse the csv file, seperate the values into two groups based on age
		 * age < 30 and age >= 30
		 */
		else{
					
			try {
				BufferedReader br = new BufferedReader(new FileReader(args[0]));
				String line;
				line = br.readLine(); //The first line is not an entry of values
				while((line = br.readLine()) != null){
					String[] split = line.split(",");
					if (Integer.parseInt(split[2]) < 30){
						entries29Less.add(new TableEntry(split));
					}
					else{
						entries30Plus.add(new TableEntry(split));
					}
					
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
		/*
		 * Sorts both groups by state alphabetically to allow for easier grouping by states
		 */
		Collections.sort(entries29Less);
		Collections.sort(entries30Plus);
		
		/*
		 * Printing the groups individually, seperating by state
		 */
		
		System.out.println("30+ Years Old");
		System.out.println("----------------------");
		
		printEntries(entries30Plus);
		System.out.println();
		
		System.out.println("< 30 Years Old");
		System.out.println("----------------------");
		
		printEntries(entries29Less);
		
	}
	
	/**
	 * Prints the TableEntry lists to stdout 
	 * according to the assignment's example formatting
	 * 
	 * @param pList - An ArrayList of TableEntrys
	 */
	private static void printEntries(ArrayList<TableEntry> pList){
		int i;
		String prevState = "ZZ"; //ZZ will trigger an if statement in the printing step
		
		for(i = 0; i < pList.size(); i++){
			if(!prevState.equals(pList.get(i).getState())){
				prevState = pList.get(i).getState();
				System.out.println("State: " + prevState);
			}
			System.out.println("Document: " + pList.get(i).toString());
		}
	}
}