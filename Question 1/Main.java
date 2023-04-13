package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	//-----------------------------------------------------
	// Title: Question 1
	// Author: Basme Zantout - Zeynep Sude Bal
	// ID: 99227947762 - 22399623714
	// Section: 1
	// Assignment: 3
	// Description: This is the main class for Question 1 which depends
	//              on the following classes: 
	//              "TreeNode.java", and "ProductNode.java",
	//              classes. It generates the expected
	//              output by calling the required methods.
	//-----------------------------------------------------
	

public static void main(String[] args) {
		
			// BEGINNIG
		
		System.out.println("--------------- WELCOME TO ITS SYSTEM ---------------");
		
		Scanner s = new Scanner(System.in);
		String file = s.next();
		
		//----------------------------------------------------------------
		// Reading the text file and calling the required methods based on
		// on the information read from the text file
		// Note: Check "readFile(String file)" method below for details
		//----------------------------------------------------------------	
	
		readFile(file);
		
		s.close();

	}
		private static void readFile(String file) 
		
				
//--------------------------------------------------------------
// Summary: Reads the text file and calls the required methods 
//          based on on the information read from the text file
//		          
// Precondition: Takes the file name as a parameter and scans the 
//		              values in it using Scanner class
// Postcondition: inside a while-loop, we iterate through the text 
//                file until no more input is available. In each 
//                iteration in the while-loop, we check the String
//                value or the "functionality" that should be 
//                implemented. So, in a switch-case statement based
//                on the functionality read, we scan the following 
//                information like "ID", "piece", and "name" and call 
//                the specified method required
//--------------------------------------------------------------

		{
			
			try {
				
		//--------------------------------------------------------------
		// Setting a Scanner for the text file
		//--------------------------------------------------------------

				File f = new File(file);
				Scanner scan = new Scanner(f);
				
				while (scan.hasNext())
				{
			
			//--------------------------------------------------------------
			// Scanning the String that tells what functionality is 
			// to be implemented
			//--------------------------------------------------------------

					String functionality = scan.next();
					
		   //--------------------------------------------------------------
		   // The information that will be scanned when needed to be passed
		   // as parameters in the methods that will be called
	       //--------------------------------------------------------------

					int ID;
					int piece;
					String name;
					
			//--------------------------------------------------------------
			// In a switch-case statement we call the methods and read the 
			// information needed based on the "functionality"
			//--------------------------------------------------------------

					switch(functionality)
					{
					    
				//--------------------------------------------------------------------
				// When the functionality is "Add_product", we read the "ID", "piece"
				// and "name" from the text file and call the "createProduct" method
				// Note (1): the method takes the Product's "ID" and "name" and "piece"
				//           as parameter and adds him/her to the tree accordingly
				// Note (2): check "createProduct" method in "TreeNode"
				//           class for implementation details
				//--------------------------------------------------------------------


					case "Add_product": 
						
						ID = scan.nextInt();
						name = scan.next();
						piece = scan.nextInt();
						TreeNode.createProduct(ID, name, piece);
						break;
						
						
				//--------------------------------------------------------------------
				// When the functionality is "Is_Available", we read the "ID" 
				// from the text file and call the "search" method
				// Note (1): the method takes the Product's "ID" as a parameter
				//           and checks his/her availability accordingly
				// Note (2): check "search" method in "TreeNode"
				//           class for implementation details
				//--------------------------------------------------------------------

					case "Is_Available":	
						
						ID = scan.nextInt();
						TreeNode.search(ID);
						break;
						
				//----------------------------------------------------------------------
				// When the functionality is "Quit", we call the "Quit" method
				// Note (1): the method does not take any parameter, it just displays 
				//           the end of the program
				// Note (2): check "Quit" method in "TreeNode"
				//           class for implementation details
				//----------------------------------------------------------------------

		
					case "Quit":
						TreeNode.Quit();
						break;
					
					}
					
				}
				
		//--------------------------------------------------------------
		// Closing the Scanner
		//--------------------------------------------------------------

				scan.close();
				
			    } 
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
