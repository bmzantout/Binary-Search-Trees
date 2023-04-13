package Assignment3;

public class Captain {
	
	
	//-----------------------------------------------------
	// Title: Question 2
	// Author: Basme Zantout - Zeynep Sude Bal
	// Description: This is the class that has the Captains'
	//              information attributes and the constructor
	//              the creates a new Captain object
	//-----------------------------------------------------

	
//-------------------------------------------------------
// Attribute: the "name" of the Captain
//-------------------------------------------------------

	public String name;
	
	
//-------------------------------------------------------
// Attribute: the "rate" of the Captain
//-------------------------------------------------------

	public int rate;
	
	
//-------------------------------------------------------
// Attribute: the Captain's availability condition
//-------------------------------------------------------

	public boolean available;
	
	
	
//-----------------------------------------------------
// Constructor: Creates a new captain object by assigning
//              to it its name and setting the default value 
//              of "available" to true and "rate" to 0
//-----------------------------------------------------

	public Captain(String name)
	{
		this.name = name;
		this.available = true;
		this.rate = 0;
	}
	
}
