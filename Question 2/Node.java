package Assignment3;

public class Node {
	
	
	//-----------------------------------------------------
	// Title: Question 2
	// Author: Basme Zantout - Zeynep Sude Bal
	// ID: 99227947762 - 
	// Section: 1
	// Assignment: 3
	// Description: This is the class used to create Nodes for 
	//              a Binary Search tree and holds the key and 
        //              information of the Captains. It has the 
        //              required getter and setter methods for it.
	//-----------------------------------------------------

	
	
	
//-------------------------------------------------------
// Attribute: the "ID" or Identity Number of the Captain
//           which is considered the key for the Binary
//           Search tree
//-------------------------------------------------------

	private int ID;
	
	
//-------------------------------------------------------
// Attribute: the "captain" object which holds the Captains'
//           information
// Note: check "Captain.java" class for details
//-------------------------------------------------------

	private Captain captain;
	
	
//-------------------------------------------------------
// Attribute: the "right" and "left" nodes, because in a 
//            Binary tree each node branches into 2 nodes
//            (each node has 2 children: right and left)
//-------------------------------------------------------

	private Node right, left;
	
	
	
	
//-----------------------------------------------------
// Constructor: Creates a new node by instantiating the 
//              "ID" (the key) and the Captain object
//-----------------------------------------------------

	public Node(int ID, Captain captain)
	{
		this.setID(ID);
		this.captain = captain;
	}
	

	
//-----------------------------------------------------
// Getter: returns the left child of a node
//-----------------------------------------------------

	public Node getLeft() 
	{
		return left;
	}

	
//-----------------------------------------------------
// Setter: sets the left child of a node
//-----------------------------------------------------

	public void setLeft(Node left)
	{
		this.left = left;
	}

	
//-----------------------------------------------------
// Getter: returns the right child of a node
//-----------------------------------------------------

	public Node getRight()
	{
		return right;
	}

	
//-----------------------------------------------------
// Setter: sets the right child of a node
//-----------------------------------------------------

	public void setRight(Node right)
	{
		this.right = right;
	}

	
//-----------------------------------------------------
// Getter: returns the captain object
//-----------------------------------------------------

	public Captain getCaptain() 
	{
		return captain;
	}

	
//-----------------------------------------------------
// Setter: sets the captain object
//-----------------------------------------------------

	public void setCaptain(Captain captain) 
	{
		this.captain = captain;
	}

	
//-----------------------------------------------------
// Getter: returns the Captain's ID (the key)
//-----------------------------------------------------

	public int getID() 
	{
		return ID;
	}

	
//-----------------------------------------------------
// Setter: sets the Captain's ID
//-----------------------------------------------------

	public void setID(int iD) 
	{
		ID = iD;
	}

	
//-----------------------------------------------------
// Getter: returns the Captain's name
//-----------------------------------------------------

	public String getName() 
	{
		return captain.name;
	}
	
	
//-----------------------------------------------------
// Getter: returns the Captain's rating
//-----------------------------------------------------

	public int getRate() 
	{
		return captain.rate;
	}

	
//-----------------------------------------------------
// Setter: sets the Captain's rating
//-----------------------------------------------------

	public void setRate(int rate) 
	{
		captain.rate = rate;
	}
	
	
//-----------------------------------------------------
// Getter: returns the Captain's availability condition
//-----------------------------------------------------
	
	public boolean getAvailable() 
	{
		return captain.available;
	}
	
	
//-----------------------------------------------------
// Setter: sets the Captain's availability condition
//-----------------------------------------------------

	public void setAvailable(boolean availability) 
	{
		captain.available = availability;
	}
	
	
	
//-----------------------------------------------------
// Summary: this methods prints all of the Captain's 
//          information: ID, name, availability condition,
//          and the rating
// Note: The information are printed with some index space 
//       preceding them for a better output structure
//-----------------------------------------------------

	public void print_CaptainInfo()
	{
		
		System.out.println("		       ID: " + ID);
		
		System.out.println("		       Name: " + captain.name);
		
		String availability;
		if (captain.available) availability = "True";
		else                   availability = "False";
		System.out.println("		       Available: " + availability);
		
		System.out.println("		       Rating star: " + captain.rate);
	}


	}
	
	
	
