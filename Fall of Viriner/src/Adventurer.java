
public class Adventurer extends Character 
{
	public Adventurer() 
	{
		setHP((int)Math.random()*10+1);
		setStr((int)Math.random()*10+1);
		setDef((int)Math.random()*10+1);
		setMag((int)Math.random()*10+1);
		setRes((int)Math.random()*10+1);
		setAgil((int)Math.random()*10+1);
		setSpeed((int)Math.random()*10+1);
		setStam((int)Math.random()*10+1);
		setMC((int)Math.random()*10+1);
		setLuk((int)Math.random()*10+1);
		setInt((int)Math.random()*10+1);
	}

}
