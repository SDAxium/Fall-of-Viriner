
public class Adventurer extends Character 
{
	public Adventurer(String charName) 
	{
		//Multiply first and then cast or all the stats will be 1.
		super(
				charName,
				(int)(Math.random() * 10 + 1), //health
				(int)(Math.random() * 10 + 1), //strength
				(int)(Math.random() * 10 + 1), //defense
				(int)(Math.random() * 10 + 1), //magic
				(int)(Math.random() * 10 + 1) //resistance				
		);
	}

}
