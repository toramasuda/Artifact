
public class SpecialArtifact extends Artifact
{
	//instance variables
	boolean state;
	String onDescription;
	String offDescription;
	String touchOnDescription;
	String touchOffDescription;
	
	//constructors
	
	SpecialArtifact (String name){
		super(name);
	}
	SpecialArtifact(String name, String offDescription, String touchOnDescription, String onDescription, String touchOffDescription)
	{
		super(name);
	this.onDescription = onDescription;	
	this.offDescription = offDescription;
	this.touchOnDescription = touchOnDescription;
	this.touchOffDescription = touchOffDescription;
	}
	
//display on and off description 
public String examine()
{
	String message;
	if (this.state == false){
		message =  offDescription;
	} else if (this.state== true){
		message = onDescription;
	} else{
		return "There was an error that occurred. ";
	}
	
	return message;
	
}
//display touch on and off description
public String touch(){
	String message;
	this.state = !this.state;
	if ( this.state == false){
		message = touchOffDescription;
	} else if (this.state == true){
		message = touchOnDescription;
	}else {
		return "There was an error that occurred. ";
	}
	
	return message;
}




}
