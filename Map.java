

public class Map 
{
	// Instance variables
    Room rooms[][] = new Room[4][4];
    
    // Constructor
    Map()
    {
    	Room library = new Room("University Library");
    	library.exits = new String [] {"e","s"};
    	library.description = "Sunlight is streaming in through the glass windows.";
 
        Room coffeeLand = new Room("Starbucks");
        coffeeLand.exits = new String[] {"w","s","e"};
        coffeeLand.description = "You can hear the steam coming from the espresso machine as the aroma of roasted coffee beans make students and staff eager to get to their next destination. ";
   
        Room computerWorld = new Room("24hr Computer Lab");
        computerWorld.exits = new String [] {"w","s"};
        computerWorld.description = "There are a variety of students doing homework and watching online videos in this crowded room filled with computers.";
        
    	Room learningRoom = new Room("Class room");
    	learningRoom.exits = new String [] {"n","e"};
    	learningRoom.description = "You see an old table covered with papers near the front of the room.";
    	
    	Room roseWonderland = new Room ("Rose Garden");
    	roseWonderland.exits = new String [] {"w","s","n"};
    	roseWonderland.description = "You are standing in the middle of a beautiful rose garden.";
    	
    	Room workoutRoom = new Room ("BRIC");
    	workoutRoom.exits = new String [] {"n","e"};
    	workoutRoom.description = "As you input your Bronco ID to get into the BRIC, there is a fellow student almost at the top of the rock wall.";
    	
    	Room spendMoney = new Room ("Bronco Bookstore");
    	spendMoney.exits = new String [] {"w","s"};
    	spendMoney.description = "There is a winter sale going on with tables filled with half priced Bronco gear!";
    	
    	Room prezHome = new Room ("Kellogg Mansion");
    	prezHome.exits = new String [] {"e"};
    	prezHome.description = "This is the former home of William Kellogg.";
    	
    	Room yumFood = new Room ("Los Olivos");
    	yumFood.exits = new String [] {"w","n","s"};
    	yumFood.description = "The aroma of hamburgers and pizza wafts through the air.";
    	
    	Room healthRoom = new Room ("Health and Wellness Center");
    	healthRoom.exits = new String [] {"e","sw"};
    	healthRoom.description = "The waiting room is filled with students due to flu season.";
    	
        Room largeRoom = new Room("Lecture Hall");
        largeRoom.exits = new String[] {"w","n"};
        largeRoom.description = "The only seats available for this lecture hall are all the way in the front.";
        
        Room natureRoom = new Room ("Box Canyon");
        natureRoom.exits = new String [] {"n"};
        natureRoom.description = "This looks like the Voorhis Ecological Reserve. A caernous opening in the canyon wall lies just ahead of you.";
        
        Room hotelRoom = new Room ("Kellog West");
        hotelRoom.exits = new String [] {"n", "ne"};
        hotelRoom.description = "Being up on the hill gives you wonderful view of the campus and of course our very own hotel!";
       
        
        //artifacts
        Artifact picture = new Artifact("picture");
        picture.descriptionArtifact = "The picture bears an inscription that reads: W.K. Kellogg. He appears to be holding a box of Corn Flakes.";
        prezHome.contents = picture;
              
        Artifact lunch = new Artifact("Lunch");
        lunch.descriptionArtifact= "The lunch appears to be a hamburger, french fries, and some kind of soda.";
        yumFood.contents = lunch;
        
        Artifact exam = new Artifact("Exam");
        exam.descriptionArtifact= "CIS 234 Final Exam... The rest appears unreadable due to a lack of printer toner.";
        learningRoom.contents = exam;
        
        Artifact sign = new Artifact("Sign");
        sign.descriptionArtifact= "The sign reads: No food or drinks in the library.";
        library.contents = sign;
        
        Artifact gazebo = new Artifact("Gazebo");
        gazebo.descriptionArtifact= "The small plaque on the structure reads: Enjoy the garden!";
        roseWonderland.contents = gazebo;
       
        Artifact keyboard = new Artifact("Keyboard");
        keyboard.descriptionArtifact="This keyboard is so used up that the letters are no longer visible on the keys.";
        computerWorld.contents = keyboard;
        
        Artifact hoodie = new Artifact ("Cal Poly Pomona Hoodie");
        hoodie.descriptionArtifact = "The letters for this hoodie are green and gold, perfect to show some bronco pride around campus.";
        spendMoney.contents = hoodie;
        
        Artifact vase = new Artifact ("Vase");
        vase.descriptionArtifact = "An arrangement of lillies and roses are displayed in the clear vase with stones at the bottom to keep them in place";
        hotelRoom.contents = vase;
        
        SpecialArtifact drink = new SpecialArtifact ("Grande Iced Caramel Macchiato", "The barista calls your name and places the drink on the table.", "You begin to stir the drink...","The separation between the dark coffee and milk start to disappear.","The drink is now perfectly stirred creating a lighter coffee color.");
        coffeeLand.contents = drink;
        
        SpecialArtifact gates = new SpecialArtifact ("BRIC gate", "The gates are closed. ", "You input your Bronco ID and fingerprint. ","The gates are now open. ","The gates lock behind you. ");
        workoutRoom.contents = gates;
        
        SpecialArtifact sheet = new SpecialArtifact ("Sign-in Sheet", "The sign-in sheet seems empty. ", "The sheet starts to levitate towards you and speak. ","The sheet request from your name and the date. ","The sheet returns back to its origninal state on the table. ");
        healthRoom.contents = sheet;
        
        SpecialArtifact paper = new SpecialArtifact ("Paper");
        paper.offDescription = "The paper appears blank. ";
        paper.onDescription = "The paper reads: Welcome to the Great Cal Poly Underground!";
        paper.touchOnDescription = "The paper begins to glow...";
        paper.touchOffDescription ="The writing fades.";
        natureRoom.contents = paper;
  
        //assigning them a location or a room 
        rooms[0][0] = library;
        rooms[0][1] = coffeeLand;
        rooms[0][2] = computerWorld;
        rooms[1][0] = learningRoom;
        rooms[1][1] = roseWonderland;
        rooms[1][2] = workoutRoom;
        rooms[1][3] = spendMoney;
        rooms[2][0] = prezHome;
        rooms[2][1] = yumFood;
        rooms[2][2] = healthRoom;
        rooms[2][3] = largeRoom;
        rooms[3][0] = natureRoom;
        rooms[3][1] = hotelRoom;
       
        
    }

	

}