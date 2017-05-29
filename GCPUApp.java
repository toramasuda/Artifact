import java.util.Scanner;

public class GCPUApp
{
	public static void main(String[] args) 
    {
        // Initialize variables
        int row = 3;
        int col = 0;
        Map map = new Map();
        Scanner scan = new Scanner(System.in);

        // User dialog
        System.out.println("Welcome to the Great Cal Poly Underground!");
        System.out.println("");
        System.out.println("You have entered "+map.rooms[row][col].name);
		  System.out.println(map.rooms[row][col].description);
		  System.out.println("There is an opening "+map.rooms[row][col].getExits());
		  System.out.println("There is a " + map.rooms[row][col].contents.name + " here");
        System.out.println("");
        String input = "";
        while (!input.equals("quit") && !input.equals("y")) 
        {
        	System.out.print("You have entered ");
            System.out.println(map.rooms[row][col].name);
            System.out.print("> ");
            input = scan.nextLine().toLowerCase();
        
  //Directions          	
            if(input.equals("n")){
            	if(map.rooms[row][col].isValidExit("n"))
            		row--;	
            	else
            		System.out.println("You can't go that way.");}
            
            else if(input.equals("s")){
            	if(map.rooms[row][col].isValidExit("s"))
            		row++;
            	else
            		System.out.println("You can't go that way.");}
            
            else if(input.equals("e")){
            	if(map.rooms[row][col].isValidExit("e"))
            		col++;
            	
            	else
            		System.out.println("You can't go that way.");}
            
            else if(input.equals("w")){
            	if(map.rooms[row][col].isValidExit("w"))
            		col--;
            	else
            		System.out.println("You can't go that way.");}
            
            else  if(input.equals("ne")){
            	if(map.rooms[row][col].isValidExit("ne")){
            		row--;
            		col++;
            	}
            	else
            		System.out.println("You can't go that way. ");
            }
            
            else if(input.equals("sw")){
            	if(map.rooms[row][col].isValidExit("sw")){
            		row++;
            		col--;
            	}
            		else
            			System.out.println("You can't go that way. ");
            }  
            

  //commands: touch, examine, look          
            else if (input.equals("touch")){
            	if (map.rooms[row][col].contents == null){
            		System.out.println("Nothing happens");
            	}else {
            		System.out.println(map.rooms[row][col].contents.touch());
            	}
            }
            	
            else  if(input.equals("examine")) {
        	  if(map.rooms[row][col].contents!= null)
				System.out.println(map.rooms[row][col].contents.examine());
				else
					System.out.print("This room contains no artifacts.");}
          
          else if (input.equals("look")){
        	  if (map.rooms[row][col].contents!=null){
        		  System.out.println(map.rooms[row][col].name);
        		  System.out.println(map.rooms[row][col].description);
        		  System.out.println("There is an opening "+map.rooms[row][col].getExits());
        		  System.out.println("There is a " + map.rooms[row][col].contents.name + " here");
        		  
        	  }
        	  else 
        		  System.out.println("This room appears to be empty");
          
       
          }
     
          		
//Quit command			   
          else if(input.equals("quit"))
            {
            	System.out.println("Do you wish to leave the Underground (Y/N)");
            	System.out.print(">");
            	input = scan.nextLine().toLowerCase();
            		if(input.equalsIgnoreCase("y"))
            		{
            			
            		}else if (input.equalsIgnoreCase("n")){
            			System.out.println("Let's continue playing.");
            		}             
            		
            		
 //hello command           		
            } else
            {
            	System.out.println("I don't understand the word " + "\"" + input + "\"" + ".");
            }

            
        }

        // Display goodbye message and close resources
        System.out.println("Thank you for visiting the Underground!");
        
        scan.close();
    }

}


