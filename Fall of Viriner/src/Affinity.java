
public interface Affinity {
	public enum elementAffinity
	{
		None, Water, Earth, Fire, Wind, Lightning, Ice, Poison, Metal, Light, Dark, Nature
	}
	
	public class Elements
	{
		elementAffinity element;
		public Elements(elementAffinity element)
		{
			this.element = element;
		}
		
	public void setEstatchange(Character c)
	{
		switch(element)
		{
		case None:
			break;
		case Water:
			c.setDex(1.1*c.getDex());
		case Earth:
			c.setRes(1.1*c.getRes());
			c.setHP(1.08*c.getHP());
			c.setStr(1.04*c.getStr());
		case Fire:
			c.setMag(1.1*c.getMag());
		case Wind:
			c.setSpeed(1.1*c.getSpeed());
			c.setDex(1.05*c.getDex());
		case Lightning:
			c.setStr(1.05*c.getStr());
			c.setMag(1.05*c.getMag());
		case Ice:
			c.setDef(1.05*c.getDef());
			c.setRes(1.05*c.getRes());
		case Poison:
			c.setStr(1.05*c.getStr());
		case Metal:
			c.setDef(1.15*c.getDef());
			c.setRes(1.15*c.getRes());
		case Light:
			break;
		case Dark:
			break;
		case Nature:
			break;
		}
	}
	
	}
}
