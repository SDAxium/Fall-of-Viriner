
public class Adventurer extends Character
{
	public Adventurer(String charName ) 
	{
		//Multiply first and then cast or all the stats will be 1.
		super(
				charName,
				(Math.random() * 10 + 1), //health and max healths
				(Math.random() * 10 + 1), //strength
				(Math.random() * 10 + 1), //defense
				(Math.random() * 10 + 1), //magic
				(Math.random() * 10 + 1), //resistance
				(Math.random() * 10 + 1), //dexterity
				(Math.random() * 10 + 1), //speed
				(Math.random() * 10 + 1), //stamina
				(Math.random() * 10 + 1), //mana control
				(Math.random() * 10 + 1), //luck
				(Math.random() * 10 + 1) //intelligence
		);
	}

}
