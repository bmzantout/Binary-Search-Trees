package Assignment3;


public class BinarySearchTree_Captain {

	
	//-----------------------------------------------------
	// Title: Question 2
	// Author: Basme Zantout - Zeynep Sude Bal
	// Description: This is the class that holds the Captains'
	//              information using a Binary Search Tree 
        //              data structure
	//-----------------------------------------------------

	
	
//-------------------------------------------------------
// Attribute: the root of the Binary Search Tree
//-------------------------------------------------------
	
	private static Node root;

	
//-------------------------------------------------------
// Attribute: the boolean "found" which is true when a 
//            node is found and false otherwise
//-------------------------------------------------------
	
	private static boolean found;
	
	
//-------------------------------------------------------
// Attribute: "deleted_chauffeur" holds the node that will
//            be deleted from the Binary Search Tree
//-------------------------------------------------------
	
	private static Node deleted_chauffeur;
	
	
//-------------------------------------------------------
// Attribute: "added_chauffeur" hold the node that will be
//            added to the Binary Search Tree
//-------------------------------------------------------

	private static Node added_chauffeur;
	
	
	
	
	public static void Add_Captain(Integer key, Captain captain)
	
//-----------------------------------------------------------------------
// Summary: adds a new Captain to the Binary Search Tree
// Precondition: this method takes a Captain object and his/her ID (key) 
//               as parameter
// Postcondition: this methods adds a new Captain to the tree based on
//                the key value (ID). It calls a recursive "Add_Captain"
//                method which finds the right place to create a new 
//                node and link it to the tree
// Note: check the recursive "Add_Captain" method for implementation details
//------------------------------------------------------------------------
		
	{			
		System.out.println("Add Captain: Add a new captain record in the System");
		System.out.println();
		
	//----------------------------------------------------------
	// Calling the recursive "Add_Captain" method that adds a
	// node and returns the new root that links to the tree with
	// the added node
	//----------------------------------------------------------
			
		root = Add_Captain(root, key, captain);
		
		
	//----------------------------------------------------------
	// Printing out the information of the added Captain 
	// Note: check the "print_CaptainInfo" method in Node.java
	//       class for details
	//----------------------------------------------------------
	
		added_chauffeur.print_CaptainInfo();
	}
	
	
	
	
	
	private static Node Add_Captain(Node r, Integer key, Captain captain)
	
//-----------------------------------------------------------------------
// Summary: adds a new Captain to the Binary Search Tree
// Precondition: this method takes a Captain object and his/her ID (key) 
//               as well as the tree root as parameter
// Postcondition: by comparing the ID (key) to the nodes of the tree we 
//                either go right or left recursively until we find the 
//                right location to place the new Captain 
//------------------------------------------------------------------------
			
	{
		
		
	//-------------------------------------------------------
	// IF the tree is empty or the right location of the new 
	// node was found, we create the new Captain node and
	// return that newly added Captain node. 
	// Note: we assign the new node to "added_chauffeur" so 
	//       we can print the Captain's information later
	//-------------------------------------------------------
			
		if (r == null) 
		{
			added_chauffeur = new Node(key, captain);
			return added_chauffeur; 	
		}
		
		
	//-------------------------------------------------------
	// ELSE, we compare the key (ID) of the Captain that will 
	// be added to the other nodes on tree accordingly
	//-------------------------------------------------------

		int comparison = key.compareTo(r.getID());
		
		
	//-------------------------------------------------------
	// IF the ID is less than the key compared we move to the
	// node at the left (recursively)
	//-------------------------------------------------------

		if (comparison < 0) 
		{
			r.setLeft(Add_Captain(r.getLeft(), key, captain));
		}
		
		
	//-------------------------------------------------------
	// ELSE IF the ID is greater than the key compared we move 
	// to the node at the right (recursively)
	//-------------------------------------------------------

		else if (comparison > 0)
		{
			r.setRight(Add_Captain(r.getRight(), key, captain));
		}
		
		
	//-------------------------------------------------------
	// ELSE IF the ID is equal to the key compared we update 
	// the tree by placing the new node in the location of 
	// an old node having the same key or ID
    // Note: we assign the new node to "added_chauffeur" so 
	//       we can print the Captain's information later
	//-------------------------------------------------------

		else 
		{
			r.setCaptain(captain);
			added_chauffeur = r;
		}
		
		
	//-------------------------------------------------------
	// ELSE return the node "r" if none of the conditions 
	// were satisfied
	//-------------------------------------------------------

		return r;
	}
	
	
	
	
	
	public static void Delete_captain(Integer key)
	
//-----------------------------------------------------------------------------
// Summary: deletes a Captain from the Binary Search Tree
// Precondition: this method takes a Captain's ID (key) as parameter 
// Postcondition: this methods deletes a Captain from the tree based on
//	                the key value (ID). It calls a recursive "Delete_captain"
//	                method which finds the node that will be deleted (if it
//                  exists) and returns the new link to the tree root
// Note: check the recursive "Delete_captain" method for implementation details
//------------------------------------------------------------------------------

	{
		
		
	//------------------------------------------------------------
	// The static boolean "found" will be true when the node
    // that will be deleted is found and will stay false otherwise
	//------------------------------------------------------------

		found = false;
		
		
	//----------------------------------------------------------
	// Calling the recursive "Delete_captain" method that deletes
	// the specified node if found and returns the new root that 
	// links to the tree with the deleted node
	//----------------------------------------------------------

		root = Delete_captain(root, key);
		
		
	//----------------------------------------------------------
	// IF the node was found we print to the console the String
	// indicating that the captain has been deleted
	// ELSE if the captain was not found we print to the console 
	// the String indicating that the captain was not found
	//----------------------------------------------------------

		if (found)     System.out.println("Delete Captain: The captain " + deleted_chauffeur.getName() + " left CCR");
		else           System.out.println("Delete Captain: Couldn’t find any captain with ID number " + key);
	}
	
	
	
	
	
	private static Node Delete_captain(Node r, Integer key)
	
//---------------------------------------------------------------------------
// Summary: deletes a Captain from the Binary Search Tree
// Precondition: this method takes a Captain's ID (key) as well as the tree 
//               root as parameter
// Postcondition: by comparing the ID (key) to the nodes of the tree we 
//	              either go right or left recursively until we find the 
//	              ID of the Captain that will be deleted or until we finish
//                iterating over the tree without finding the indicated Captain
//----------------------------------------------------------------------------

	{
		
		
	//-------------------------------------------------------
	// IF the tree is empty or the node was not found we 
	// return null
	//-------------------------------------------------------

		if (r == null)
		{
			return null;
		}
		
		
	//-------------------------------------------------------
	// ELSE, we compare the key (ID) of the Captain that will 
	// be deleted to the other nodes on the tree accordingly
	//-------------------------------------------------------

		int comparison = key.compareTo(r.getID());
		
		
	//-------------------------------------------------------
	// IF the ID is less than the key compared we move to the
	// node at the left (recursively)
	//-------------------------------------------------------

		if (comparison < 0)
		{
			r.setLeft(Delete_captain(r.getLeft(), key));
		}
		
		
	//-------------------------------------------------------
	// ELSE IF the ID is greater than the key compared we move 
	// to the node at the right (recursively)
	//-------------------------------------------------------

		else if (comparison > 0)
		{
			r.setRight(Delete_captain(r.getRight(), key));
		}
		
		
	//----------------------------------------------------------
	// ELSE IF the ID is equal to the key compared we assign
	// "true" to the boolean "found" and do the deletion 
	// considering the following cases or conditions which are:
	//
	//  CASE  1 - The node that will be deleted has no children 
	//            OR has only 1 child
	//  CASE  2 - The node that will be deleted has 2 children 
	// 
        // Note: we assign the node that will be deleted to 
	//       "deleted_chauffeur" so we can print the Captain's 
	//       information later
	//----------------------------------------------------------

		else 
		{
			found = true;
			deleted_chauffeur = r;
			
			
		//----------------------------------------------------------
		//  CASE  1 - The node that will be deleted has no children 
		//            OR has only 1 child
		//----------------------------------------------------------
			
			if (r.getRight() == null) return r.getLeft();
		
			if (r.getLeft() == null) return r.getRight();
			
		//----------------------------------------------------------
		//  CASE  2 - The node that will be deleted has 2 children
		//
		//  Note: check the methods "find_min" and "delete_min" below 
		//        for implementation details
		//----------------------------------------------------------
				
			Node temp = r;
			
			r = find_min(temp.getRight());
			r.setRight(delete_min(temp.getRight()));
			r.setLeft(temp.getLeft());
			
		}
		
		
	//-------------------------------------------------------
	// ELSE return the node "r" if none of the conditions 
	// were satisfied
	//-------------------------------------------------------

		return r;
	}

	
	
	
	
	private static Node delete_min(Node r)
	
//---------------------------------------------------------------------------
// Summary: deletes the node with the minimum value found from a given root 
// Precondition: this method takes the root as parameter and deletes the minimum
//               value starting from that root
// Postcondition: Since we are iterating through a Binary Search Tree the 
//                minimum or (less than) value is always located at the left 
//                of the node greater than it. Thus, we iterate through the 
//                tree recursively until we find the minimum node and delete
//                it based on its location in the tree
//----------------------------------------------------------------------------

	{
		
	//----------------------------------------------------------
	//  IF we found the minimum node in the tree which means that
	//  we found the node that has no left child we delete it by
	//  returning the node at the right (the right node might also 
	//  be null) 
	//----------------------------------------------------------

		if (r.getLeft() == null) return r.getRight();
		
		
	//----------------------------------------------------------
	// ELSE IF the minimum node is still not found (which means 
	// that we still have a left child), then we call the method
	// recursively by starting from the left child this time
	//----------------------------------------------------------

		else r.setLeft(delete_min(r.getLeft()));
		
		return r;
	}
	
	
	
	
	
	private static Node find_min(Node r)
	
//---------------------------------------------------------------------------
// Summary: finds the node with the minimum value found from a given root 
// Precondition: this method takes the root as parameter and finds the minimum
//	               value starting from that root
// Postcondition: Since we are iterating through a Binary Search Tree the 
//	                minimum value is always the leftmost child in the tree
//----------------------------------------------------------------------------

	{
		
	//-------------------------------------------------------------
	// In w while-loop we keep iterating until we find the minimum
	// or leftmost child in the tree
	//-------------------------------------------------------------

		while (r.getLeft() != null)
		{
			r = r.getLeft();
		}
		
		return r;
	}

	
	
	
	
	public static void Is_Available(Integer key)
	
//-----------------------------------------------------------------------
// Summary: Checks the availability of the Captain to rent a car
// Precondition: this method takes a Captain's ID (key) as parameter  
// Postcondition: the method searches for the node with the given 
//	              ID and rents a car with the Captain if he/she is available.
//                Otherwise, it prints an error message indicating that the
//                Captain is either unavailable or is not found.
//------------------------------------------------------------------------

	{
	
	//-----------------------------------------------------------------------
	// Searching for the Captain with the given ID
	// Note: Check "Search" method below for implementation details 
	//-----------------------------------------------------------------------
		
		Node r = Search(key);
		
	//-----------------------------------------------------------------------
	// IF the Captain was found we check 2 conditions
	// Note: Check "Search" method below for details about "found" boolean
	//-----------------------------------------------------------------------
		
		if (found)
		{
			
		//-----------------------------------------------------------------------
		// Condition (1) : IF the Captain is available we set the availability 
		//                 condition of the captain to false and print to the 
		//                 console a String indicating that a ride is reserved
		//-----------------------------------------------------------------------
			
			if (r.getAvailable())
			{
				r.setAvailable(false);
				System.out.println("IsAvailable: Reserve a new Ride with captain " + r.getID());
			}
			
		//-----------------------------------------------------------------------
		// Condition (2) : IF the Captain is not available we print to the console
		//                 a String indicating that the Captain is unavailable
		//-----------------------------------------------------------------------
	
			else 
			{
				System.out.println("IsAvailable: The captain " + r.getName() + " is not available. He is on another ride!");
			}
			
			
		//-----------------------------------------------------------------------
		// Terminate the method
		//-----------------------------------------------------------------------

		    return;
		}
		
		
	//-----------------------------------------------------------------------
	// ELSE IF the Captain was not found we print to the console a String
	// indicating that the Captain was not found and we terminate the method
	//-----------------------------------------------------------------------

		System.out.println("IsAvailable: Couldn't find any captain with ID number " + key);
		return;
	}

	
	
	
	
	public static void Display_captain(Integer key)
	
//-----------------------------------------------------------------------
// Summary: Displays the indicated Captain's information
// Precondition: this method takes a Captain's ID (key) as parameter  
// Postcondition: the method searches for the node with the given 
//		          ID and displays his/her information (if the captain
//                exists). Otherwise, it prints an error message indicating 
//                that the Captain is not found.
//------------------------------------------------------------------------

	{
		
	//-----------------------------------------------------------------------
	// Searching for the Captain with the given ID
	// Note: Check "Search" method below for implementation details 
	//-----------------------------------------------------------------------
			
		Node r = Search(key);
		
		
	//-----------------------------------------------------------------------
	// IF the Captain was found we display The Captain's information and
	// terminate the method
	// Note: Check "Search" method below for details about "found" boolean
	//-----------------------------------------------------------------------
		

		if (found)
		{
			System.out.println("Display Captain:");
		    r.print_CaptainInfo();
		    return;
		}
		
		
	//-----------------------------------------------------------------------
	// ELSE IF the Captain was not found we print to the console a String
	// indicating that the Captain was not found and we terminate the method
	//-----------------------------------------------------------------------

		System.out.println("Display Captain: Couldn't find any captain with ID number " + key);
		return;
	}
	
	
	
	
	
	public static void Finish(Integer key, int rate)
	
//-----------------------------------------------------------------------
// Summary: Finishes the ride with the indicated Captain
// Precondition: this method takes a Captain's ID (key) and the rating
//               as parameter  
// Postcondition: the method searches for the node with the given 
//			      ID and finishes the ride with the given captain (if the 
//                captain exists). Otherwise, it prints an error message 
//                indicating that the Captain either was not on a ride
//                or was not found.
//------------------------------------------------------------------------

	{
		
	//-----------------------------------------------------------------------
	// Searching for the Captain with the given ID
	// Note: Check "Search" method below for implementation details 
	//-----------------------------------------------------------------------
	
		Node r = Search(key);
		
		
	//-----------------------------------------------------------------------
	// IF the Captain was found we check 2 conditions
	// Note: Check "Search" method below for details about "found" boolean
	//-----------------------------------------------------------------------
	
		if (found)
		{
			
		//-----------------------------------------------------------------------
		// Condition (1) : IF the Captain was initially not available we set the 
		//                 availability condition of the captain to false, set his 
		//                 new rate, and print to the console a String indicating
		//                 that the ride finished
		//-----------------------------------------------------------------------
	
			if (!r.getAvailable())
			{
				r.setAvailable(true);
				
			//-----------------------------------------------------------------------
			// The rate has to be a number between (0 and 5) and it increases by 1 
			// when the rating is 1 and decreases by 1 when the rating is 0
			//-----------------------------------------------------------------------

				if ((r.getRate() < 5) && (rate == 1))       r.setRate(r.getRate() + 1);
				else if ((r.getRate() > 0) && (rate == 0))  r.setRate(r.getRate() - 1);
				
				System.out.println("Finish: Finish ride with captain " + r.getID());
				System.out.println();
				r.print_CaptainInfo();
			}
			
			
		//-----------------------------------------------------------------------
		// Condition (2) : IF the Captain was initially available we print to the 
		//                 console a String indicating that the Captain is not
		//                 on a ride
		//-----------------------------------------------------------------------
	
			else 
			{
				System.out.println("Finish: The captain " + r.getName() + " is not in a ride");
			}
			
			
		//-----------------------------------------------------------------------
		// Terminate the method
		//-----------------------------------------------------------------------

			return;
		}
		
		
	//-----------------------------------------------------------------------
	// ELSE IF the Captain was not found we print to the console a String
	// indicating that the Captain was not found and we terminate the method
	//-----------------------------------------------------------------------

		System.out.println("Finish: Couldn't find any captain with ID number " + key);
		return;
	}
	
	
	
	
	
	private static Node Search(Integer key)
	
//-----------------------------------------------------------------------
// Summary: searches for Captain in a tree using his ID (key)
// Precondition: this method takes a Captain ID (key) as parameter  
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
	
		Node r = root;
		
		
	//------------------------------------------------------------
	// In a while-loop we will keep searching and iterating over
	// the tree until we find the node or we reach the end of the
	// tree 
	//------------------------------------------------------------

		while (r != null)
		{
			
		//-------------------------------------------------------
		// We compare the key (ID) of the Captain that we are  
		// searching for to the other nodes on the tree accordingly
		//-------------------------------------------------------

			int comparison = key.compareTo(r.getID());
			
			
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
	
	
	
	
	
	public static void Display_all_captains()
	
//-----------------------------------------------------------------------
// Summary: displays the information of all the Captains in the tree
// Precondition: this method takes no parameter  
// Postcondition: the method calls a recursive "Display_all_captains" 
//                method and passes to it the root a parameter
//------------------------------------------------------------------------

	{
		Display_all_captains(root);
	}
	
	
	
	
	
	private static void Display_all_captains(Node r)
	
//-----------------------------------------------------------------------
// Summary: displays the information of all the Captains in the tree
// Precondition: this method takes the tree's root parameter  
// Postcondition: this method is an "In-order Traversal" method that 
//                traverses through every node in the list in ascending
//                order from least to greatest 
// Note: this recursive method follows the order of:
//
//       1- Move to the left child
//       2- Visit the Node (and print the Captain's information)
//       3- Move to the right child
//------------------------------------------------------------------------

	{

	//------------------------------------------------------------------------
	//  Return when we reach the end of the tree
	//------------------------------------------------------------------------

		if (r == null) return;

	//------------------------------------------------------------------------
	// 1- Move to the left child
	//------------------------------------------------------------------------

		Display_all_captains(r.getLeft());
		

	//------------------------------------------------------------------------
	// 2- Visit the Node (and print the Captain's information)
	//------------------------------------------------------------------------

		System.out.println("--CAPTAIN:");
		r.print_CaptainInfo();
		

	//------------------------------------------------------------------------
	// 3- Move to the right child
	//------------------------------------------------------------------------

		Display_all_captains(r.getRight());
	}
	
}
