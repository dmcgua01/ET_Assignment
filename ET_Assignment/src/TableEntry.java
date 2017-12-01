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
public class TableEntry {

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
}
