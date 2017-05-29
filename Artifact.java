
public class Artifact 
{

	String name, descriptionArtifact, touchArtifact;

	
	
	Artifact(String name){
		this.name = name;
	}
	
	Artifact(String name, String descriptionArtifact )
	{
		this.name = name;
		this.descriptionArtifact = descriptionArtifact;
	}
	

// examine displays ordinary description of artifact 
	
	public String examine()
	{
		return descriptionArtifact;
	}
	
//display that touch method doesn't do anything because it isn't a special artifact 
	
	public String touch()
	{
		touchArtifact ="Touching the "+ name + " doesn't appear to do anything";
		return touchArtifact;
	}

}
