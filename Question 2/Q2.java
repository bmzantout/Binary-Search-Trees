package Assignment3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Q2 {


	//-----------------------------------------------------
	// Title: Question 2
	// Author: Basme Zantout - Zeynep Sude Bal
	// ID: 99227947762 - 
	// Section: 1
	// Assignment: 3
	// Description: This is the main class for Question 2 which depends
	//              on the following classes: 
	//              "BinarySearchTree_Captain.java", "Node.java",
	//              and "Captain.java" class. It generates the expected
	//              output by calling the required methods.
	//-----------------------------------------------------

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// BEGINNIG
		
		System.out.println("--------------- WELCOME TO CDRC SYSTEM ---------------");
		
		Scanner s = new Scanner(System.in);
		String file_name = s.next();

                //----------------------------------------------------------------
		// Reading the text file and calling the required methods based on
		// on the information read from the text file
		// Note: Check "readFile(String file)" method below for details
		//----------------------------------------------------------------	
		
		readFile(file_name);
		
		//ENDING 
		
		System.out.println();
		System.out.println("Thank you for using CDRC, Good Bye!");
		
		s.close();
		
	}
	
	
	
	
	
	
	
	

	private static void readFile(String file) 
	{
		
		
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
//                information like "ID", "rate", and "name" and call 
//                the specified method required
//--------------------------------------------------------------


		try {
			
		//--------------------------------------------------------------
		// Setting a Scanner for the text file
		//--------------------------------------------------------------

			File f = new File(file);
			Scanner scan = new Scanner(f);
			
		//--------------------------------------------------------------
		// The information that will be scanned when needed to be passed
		// as parameters in the methods that will be called
		//--------------------------------------------------------------

			int ID;
			int rate;
			String name;
			
			
		//--------------------------------------------------------------
		// Using a while-loop, we iterate through the text file until we
	    // reach the end of the text file
		//--------------------------------------------------------------

			while (scan.hasNext())
			{
				
			//--------------------------------------------------------------
			// Scanning the String that tells what functionality is 
			// to be implemented
			//--------------------------------------------------------------

				String functionality = scan.next();
				
				
			//--------------------------------------------------------------
			// In a switch-case statement we call the methods and read the 
			// information needed based on the "functionality"
			//--------------------------------------------------------------
		
				switch(functionality)
				{
				
				case "Add_Captain": 
					
				//--------------------------------------------------------------------
				// When the functionality is "Add_Captain", we read the "ID" and
				// "name" from the text file and call the "Add_Captain" method
				// Note (1): the method takes the Captain's "ID" and "name"
				//           as parameter and adds him/her to the tree accordingly
				// Note (2): check "Add_Captain" method in "BinarySearchTree_Captain"
				//           class for implementation details
				//--------------------------------------------------------------------

					ID = scan.nextInt();
					name = scan.next();
					BinarySearchTree_Captain.Add_Captain(ID, new Captain(name));
					System.out.println("----------------------------------------------------------------");
					break;
					
					
				case "Is_Available":	
					
				//--------------------------------------------------------------------
				// When the functionality is "Is_Available", we read the "ID" 
				// from the text file and call the "Is_Available" method
				// Note (1): the method takes the Captain's "ID" as a parameter
				//           and checks his/her availability accordingly
				// Note (2): check "Is_Available" method in "BinarySearchTree_Captain"
				//           class for implementation details
				//--------------------------------------------------------------------

					ID = scan.nextInt();
					BinarySearchTree_Captain.Is_Available(ID);
					System.out.println("----------------------------------------------------------------");
					break;
					
					
				case "Display_captain":
					
				//----------------------------------------------------------------------
				// When the functionality is "Display_captain", we read the "ID" 
				// from the text file and call the "Display_captain" method
				// Note (1): the method takes the Captain's "ID" as a parameter
				//           and displays his/her information accordingly
				// Note (2): check "Display_captain" method in "BinarySearchTree_Captain"
				//           class for implementation details
				//----------------------------------------------------------------------

					ID = scan.nextInt();
					BinarySearchTree_Captain.Display_captain(ID);
					System.out.println("----------------------------------------------------------------");
					break;
					
				case "Finish":
					
				//--------------------------------------------------------------------
				// When the functionality is "Finish", we read the "ID" and "rate"
				// from the text file and call the "Finish" method
				// Note (1): the method takes the Captain's "ID" as a parameter
				//           to end a ride and rate it when needed 
				// Note (2): check "Finish" method in "BinarySearchTree_Captain"
				//           class for implementation details
				//--------------------------------------------------------------------

					ID = scan.nextInt();
					rate = scan.nextInt();
					BinarySearchTree_Captain.Finish(ID, rate);
					System.out.println("----------------------------------------------------------------");
					break;
					
					
				case "Delete_captain":	
					
				//----------------------------------------------------------------------
				// When the functionality is "Delete_captain", we read the "ID" 
				// from the text file and call the "Delete_captain" method
				// Note (1): the method takes the Captain's "ID" as a parameter
				//           and deletes him/her from the tree
				// Note (2): check "Delete_captain" method in "BinarySearchTree_Captain"
				//           class for implementation details
				//----------------------------------------------------------------------

					ID = scan.nextInt();
					BinarySearchTree_Captain.Delete_captain(ID);
					System.out.println("----------------------------------------------------------------");
					break;
					
				case "Display_all_captains":
					
				//----------------------------------------------------------------------
				// When the functionality is "Display_all_captains", we call the 
				// "Display_all_captains" method
				// Note (1): the method does not take any parameter, it just displays 
				//           all the Captains' information
				// Note (2): check "Display_all_captains" method in "BinarySearchTree_Captain"
				//           class for implementation details
				//----------------------------------------------------------------------

					System.out.println("----------ALL CAPTAINS----------");
					BinarySearchTree_Captain.Display_all_captains();
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
