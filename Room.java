//example of a room 
public class Room 
{
	//instance variables
	String name;
	String [] exits;
	Artifact contents;
	String description;
	String getExits;
	
	
	Room()
	{}
	
	Room(String name)
	{
		this.name = name; 
	}
	
	Room(String name, String[] exits)
	{
		this(name); //uses the constructor from above 
		this.exits = exits;
	}
	
	Room(String name, String [] exits, String description)
	{
		this(name);
		this.description = description;
	}
// switches letter direction to complete word	
	String getExits()
	{
		String direction = "";
		for (String exit : exits)
		{
			String whichDirection = exit;
			switch (whichDirection)
			{
			case "n":
				direction +="North ";
				break;
		
			case "s":
				direction +="South ";
				break;
				
			case "e":
				direction +="East ";
				break;
				
			case "w":
				direction +="West ";
				break;
				
			case "ne":
				direction +="Northeast ";
				break;
				
			case "sw":
				direction +="Southwest ";
				break;
				
			}
		}
		return direction ;
	}
	

	
	boolean isValidExit(String requestedExit)
	{
		boolean result = false;
		int index = 0;
		while (index < exits.length && result == false) //if ran out of places to look or you found it 
		{
			if (exits[index].equals(requestedExit))
				result = true;
			else
				index++;
			//if its not keep on looking 
		}
		
		return result;
	}
}
