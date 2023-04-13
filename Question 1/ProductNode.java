package Assignment3;

public class ProductNode {

	//-----------------------------------------------------
	// Title: Question 1
	// Author: Basme Zantout - Zeynep Sude Bal
	// Description: This is the class used to create Nodes for 
	//              a Binary Search tree and holds the key and 
        //              information of the Captains. It has the 
        //              required getter and setter methods for it.
	//-----------------------------------------------------

	
	
//-------------------------------------------------------
// Attribute: the "ID" or Identity Number of the Product
//           which is considered the key for the Binary
//           Search tree
//-------------------------------------------------------

	private int ID;
	
		
//-------------------------------------------------------
// Attribute: the "name" of the Captain
//-------------------------------------------------------

	private String name;
		
//-------------------------------------------------------
// Attribute: the number of "pieces" available in stock
//            of a specific product
//-------------------------------------------------------

	private int piece;
		
		
//-------------------------------------------------------
// Attribute: the "right" and "left" nodes, because in a 
//            Binary tree each node branches into 2 nodes
//            (each node has 2 children: right and left)
//-------------------------------------------------------

	ProductNode left;
	ProductNode right;
	
	
//-----------------------------------------------------
// Constructor: Creates a new node by instantiating the 
//              "ID" (the key), "name", and "piece"
//-----------------------------------------------------

	public ProductNode(int ID, String name, int piece) 
	{
		this.ID = ID;
		this.name = name;
		this.piece = piece;
	}

	
//-----------------------------------------------------
// Getter: returns the ID of the Product
//-----------------------------------------------------

    public int getID() {
		return ID;
	}
	
		
//-----------------------------------------------------
// Setter: sets the Product's ID
//-----------------------------------------------------

	public void setID(int iD) {
		ID = iD;
	}

	
//-----------------------------------------------------
// Getter: returns the Products's name
//-----------------------------------------------------

	public String getName() {
		return name;
	}

	
//-----------------------------------------------------
// Setter: sets the Products's name
//-----------------------------------------------------

	public void setName(String name) {
		this.name = name;
	}

	
//-----------------------------------------------------
// Getter: returns the number of pieces available in 
//         stock of a Product
//-----------------------------------------------------

	public int getPiece() {
		return piece;
	}

	
//-----------------------------------------------------
// Setter: sets the number of pieces available in 
//         stock of a Product
//-----------------------------------------------------

	public void setPiece(int piece) {
		this.piece = piece;
	}

	
//-----------------------------------------------------
// Getter: returns the left child of a node
//-----------------------------------------------------

	public ProductNode getLeft() {
		return left;
	}

	
//-----------------------------------------------------
// Setter: sets the left child of a node
//-----------------------------------------------------

	public void setLeft(ProductNode left) {
		this.left = left;
	}

	
//-----------------------------------------------------
// Getter: returns the right child of a node
//-----------------------------------------------------

	public ProductNode getRight() {
		return right;
	}
	
//-----------------------------------------------------
// Setter: sets the right child of a node
//-----------------------------------------------------

	public void setRight(ProductNode right) {
		this.right = right;
	}
}
	

