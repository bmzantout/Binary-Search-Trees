package Assignment3;

public class TreeNode {
	
	//-----------------------------------------------------
	// Title: Question 1
	// Author: Basme Zantout - Zeynep Sude Bal
	// Description: This is the class that holds the Products'
	//              information using a Binary Search Tree 
        //              data structure
	//-----------------------------------------------------


	
//-------------------------------------------------------
// Attribute: the root of the Binary Search Tree
//-------------------------------------------------------

	
	private static ProductNode root; 
		
//-------------------------------------------------------
// Attribute: the boolean "found" which is true when a 
//            node is found and false otherwise
//-------------------------------------------------------

	private static boolean found;
	

	
	public TreeNode() 
	
//-------------------------------------------------------
// Constructor:
//   * Default constructor for tree.
//	 * Takes no parameter. 
//	 * It sets root to null.
//-------------------------------------------------------
   {
		root = null;
	}
	
	
	
	
	public TreeNode(ProductNode root) 
		
//-------------------------------------------------------
// Constructor:
//	 * Constructor for tree with a root parameter. 
//	 * It will take root in TreeNode type
//	 * It sets root of this object to parameter
//-------------------------------------------------------

	{
		this.root = root;
	}



	
	public ProductNode getRoot() 
			
//-------------------------------------------------------
// Getter:
//	 * Returns the root of our tree.
//	 * Takes no parameter. Its return type is TreeNode.
//	 * Returns the root.
//-------------------------------------------------------

	{
		return root;
	}
	

	
	public void setRoot(ProductNode root)
	
//-------------------------------------------------------
// Setter:
//	 * Assigns the value of root.
//	 * Takes a TreeNode object as root in parameters.
//	 * Sets the value of root.
//-------------------------------------------------------

	{
		this.root = root;
	}
	
	
	public static void createProduct(int ID, String name, int piece) 
			
//---------------------------------------------------------------------------------
// Summary: Adds a Product to the Binary Search Tree
// Precondition: A public method to add a product by ID, name and piece. 
// Postcondition:   
//	 * It first checks the root value, if it is null, it basically adds it. 
//	 * Otherwise, it basically adds the product.
//	 * It takes ID and piece as integer and name as String
//	 *It assigns root of this object to returned value from create product function.
// Note: this method calls a recursive "createProduct" method
//----------------------------------------------------------------------------------

	{
		System.out.println("Create Product:");
		
		//-----------------------------------------------------------------------
		// IF root is null. Add directly to it
		//-----------------------------------------------------------------------
		
		if(root == null) root = new ProductNode(ID, name, piece);
	
		root = createProduct(root, ID, name, piece);
		
		printInfo(root, ID, name, piece);
	
	}
	
	
	private static ProductNode createProduct(ProductNode node, int ID, String name, int piece) 
	
//-----------------------------------------------------------------------------------------------
// Summary: Adds a Product to the Binary Search Tree
// Precondition: A recursive method to add a product by ID, name and piece, and root 
// Postcondition:   
//	 * Take product value and go left if piece is less, go right if transfer fee is greater
//	 * Take a product in a node type. Take ID and piece in integer type and take name in string type
//	 * Return the product node
//------------------------------------------------------------------------------------------------

	{
	    //-----------------------------------------------------------------------
		// IF root is null. Add directly to it
		//-----------------------------------------------------------------------

		if(node == null) 
		{  
			return new ProductNode(ID,name,piece);
		}
			if(piece > node.getPiece()) 
			{ 
			    
	      	//-----------------------------------------------------------------------
	    	// IF added product's piece is greater than current product go right
	    	//-----------------------------------------------------------------------

				node.setRight(createProduct(node.getRight(), ID,  name, piece));
			}
			
			else if(piece < node.getPiece()) 
			{
		//-----------------------------------------------------------------------
	    	// ELSE IF added product's piece is less than current productgo left
	    	//-----------------------------------------------------------------------
	    	
				node.setLeft(createProduct(node.getLeft(),ID, name, piece));
			}
			
		return node;
	}
	
	
	

	public static void search(Integer ID) {
		
//-----------------------------------------------------------------------
// Summary: Checks the availability of a Product
// Precondition: this method takes a Product's ID (key) as parameter  
// Postcondition: the method searches for the node with the given 
//	              ID and prints out the number of pieces in stock if it is
//                available. Otherwise, it prints an error message indicating
//                that the product is out of stock
//------------------------------------------------------------------------

	
	//-----------------------------------------------------------------------
	// Searching for the Product with the given ID
	// Note: Check "Find" method below for implementation details 
	//-----------------------------------------------------------------------

		ProductNode r = Find(ID);
	
	//-----------------------------------------------------------------------
	// IF the Product was found we print a String showing the number of 
	// pieces available in stock and we terminate the method
	//-----------------------------------------------------------------------
	
		if (found)
		{
			System.out.println("There are " + r.getPiece() + " products\n");
		    return;
		}
		
	//-----------------------------------------------------------------------
	// ELSE IF the Product was not found we print to the console a String
	// indicating that the Product was not found and we terminate the method
	//-----------------------------------------------------------------------

		System.out.println("The product is out of stock!!!\n");
		return;
	
}


	public static ProductNode Find(Integer ID)
		
//-----------------------------------------------------------------------
// Summary: searches for Product in a tree using its ID (key)
// Precondition: this method takes a Product ID (key) as parameter  
// Postcondition: this method searches for the node with the given 
//                ID and returns that node (if it exists). The method
//                uses the Binary Search Tree property of placing the
//                nodes with respect to their order
//------------------------------------------------------------------------

	{
				
	//------------------------------------------------------------
	// The static boolean "found" will be true when the node
    // we are searching for is found and will stay false otherwise
	//------------------------------------------------------------

		found = false;
		
	//------------------------------------------------------------
	// We will search starting from the root of the tree
	//------------------------------------------------------------
	
		ProductNode r = root;
		
		
	//------------------------------------------------------------
	// In a while-loop we will keep searching and iterating over
	// the tree until we find the node or we reach the end of the
	// tree 
	//------------------------------------------------------------

		while (r != null)
		{
		    
		//-------------------------------------------------------
		// We compare the key (ID) of the Product that we are  
		// searching for to the other nodes on the tree accordingly
		//-------------------------------------------------------

			int comparison = ID.compareTo(r.getID());
			
			
		//-------------------------------------------------------
		// IF the ID is less than the key compared we move to the
		// node at the left 
		//-------------------------------------------------------

			if (comparison < 0) 
			{
				r = r.getLeft();
			}
	
				
		//-------------------------------------------------------
		// ELSE IF the ID is greater than the key compared we move 
		// to the node at the right 
		//-------------------------------------------------------

			else if (comparison > 0) 
			{
				r = r.getRight();
			}
			
		//-------------------------------------------------------
		// ELSE IF the ID is equal to the key compared we assign 
		// "true" to the boolean "found" and return that node
		//-------------------------------------------------------

			else 
			{
				found = true;
				return r;
			}	
		}
		
	//-------------------------------------------------------
	// We return null in case we didn't find the node we're 
	// searching for
	// Note: In this case the boolean "found" will be "false"
	//-------------------------------------------------------

	return null;
	
}
	
	public static void printInfo(ProductNode root, int ID, String name, int piece)
		
//-----------------------------------------------------
// Summary: this methods prints a Product's information: 
//          ID, name, and pieces in stock
//
// Note: The information are printed with some index space 
//       preceding them for a better output structure
//-----------------------------------------------------

	{
		
			System.out.println("		       ID: " + ID);
			System.out.println("		       Name: " + name);
			System.out.println("		       Piece: " + piece);
			System.out.println();
	}
	
	
	
	public static void Quit() 
			
//-----------------------------------------------------
// Summary: Prints a String to denote the end of the 
//          program
//-----------------------------------------------------

	{
		System.out.println("Thank you for using ITS, Good Bye!");
	}
	
}
