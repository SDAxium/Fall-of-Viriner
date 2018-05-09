
public class Adventurer extends Character 
{
	public Adventurer(String charName) 
	{
		//Multiply first and then cast or all the stats will be 1.
		super(
				charName,
				(int)(Math.random() * 10 + 1), //health and max healths
				(int)(Math.random() * 10 + 1), //strength
				(int)(Math.random() * 10 + 1), //defense
				(int)(Math.random() * 10 + 1), //magic
				(int)(Math.random() * 10 + 1), //resistance
				(int)(Math.random() * 10 + 1), //dexterity
				(int)(Math.random() * 10 + 1), //speed
				(int)(Math.random() * 10 + 1), //stamina
				(int)(Math.random() * 10 + 1), //mana control
				(int)(Math.random() * 10 + 1), //luck
				(int)(Math.random() * 10 + 1) //intelligence
		);
	}

}
