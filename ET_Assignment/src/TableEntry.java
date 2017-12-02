/*
 * TableEntry.java
 */

/**
 * @author Kristopher Brown
 *
 * Represents an entry in the given CSV file. 
 * Entries have first_name, last_name, age, state
 *
 */
public class TableEntry implements Comparable<TableEntry>{

	private String fName;
	private String lName;
	private int age;
	private String state;	
	
	
	public TableEntry (String fName, String lName, int age, String state){
		
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.state = state;
		
	}
	
	
	public TableEntry(String[] split) {
		this.fName = split[0];
		this.lName = split[1];
		this.age = Integer.parseInt(split[2]);
		this.state = split[3];
	}


	/**
	 * Getter for fName
	 * 
	 * @return - First name of entry
	 */
	public String getFName(){
		return fName;
	}
	
	
	/**
	 * Getter for lName
	 * 
	 * @return - Last Name of entry
	 */
	public String getLName(){
		return lName;
	}
	
	
	/**
	 * Getter for age
	 * 
	 * @return - Age of entry
	 */
	public int getAge(){
		return age;
	}
	
	
	/**
	 * Getter for state
	 * 
	 * @return - State of entry
	 */
	public String getState(){
		return state;
	}


	/**
	 * Compares TableEntrys by state alphabetically
	 */
	public int compareTo(TableEntry x) {
		
		return getState().compareTo(x.getState());
	}
	
	public String toString(){
		
		String ret = fName + " " + lName + ", " + state + ", " + Integer.toString(age);
		return ret;
	}
}
