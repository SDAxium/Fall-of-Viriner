
public abstract class Character {
		
		private String name;
//		public int maxHP;
		private int hp;
		private int str;
		private int def;
		private int mag;
		private int res;
		private int dex;
		private int spd;
		private int stam;
		private int manactrl;
		private int luck;
		private int intel; 
	
		public Character(String charName, int health, int strength, int defense, int magic, int resistance, int speed) 
		{
			name = charName;
			hp = health;
			str = strength;
			def = defense;
			mag = magic;
			res = resistance;
			spd = speed;
		}
		
		
		public String toString() {
			String msg = "";
			msg += name + "\n";
			msg += "HP: " + hp + "\n";
			msg += "Strength: " + str + "\n";
			msg += "Defense: " + def + "\n";
			msg += "Magic: " + mag + "\n";
			msg += "Resistance: " + res;
			return msg;
		}
		
		public int getBST() 
		{
			return getHP()+getStr()+getDef()+getMag()+getRes()+getDex()+getSpeed()+getStam()+getManactrl()+getLuck()+getIntel();
		}
		public int getHP() 
		{
			return hp;
		}
		public void setHP(int health) 
		{
			this.hp = health;
		}
		public int getStr()
		{
			return str;
		}
		public void setStr(int strength)
		{
			this.str = strength;
		}
		public int getDef()
		{
			return def;
		}
		public void setDef(int defense)
		{
			this.def = defense;
		}
		public int getMag()
		{
			return mag;
		}
		public void setMag(int magic)
		{
			this.mag = magic;
		}
		public int getRes()
		{
			return res;
		}
		public void setRes(int resistance)
		{
			this.res = resistance;
		}
		public int getDex()
		{
			return dex;
		}
		public void setDex(int dexity)
		{
			this.dex = dexity;
		}
		public int getSpeed()
		{
			return spd;
		}
		public void setSpeed(int speed)
		{
			this.spd = speed;
		}
		public int getStam()
		{
			return stam;
		}
		public void setStam(int stamina)
		{
			this.stam = stamina;
		}
		public int getManactrl()
		{
			return manactrl;
		}
		public void setManactrl(int manacontrol)
		{
			this.manactrl = manacontrol;
		}
		public int getLuck()
		{
			return luck;
		}
		public void setLuck(int luck)
		{
			this.luck = luck;
		}
		public int getIntel()
		{
			return intel;
		}
		public void setInt(int intelligence)
		{
			intel = intelligence;
		}
		//stat setters complete
		boolean burn;
		boolean paralysis;
		boolean poison;
		boolean freeze;
		boolean silence;
		boolean curse;
		boolean grounded;
		boolean cLock;
		boolean dLock;
		
		public void burn()
		{
			while(burn = true)
			{
				hp = (9/10)*hp;
				setStr((4/5)*getStr());
			}
		}
		public void paralysis()
		{
			while(paralysis = true)
			{
				setSpeed((3/5)*spd);
				setDex((4/5)*dex);
			}
		}
		public void poison()
		{
			while(poison = true)
			{
				hp -= (9/10)*hp;
			}
		}
		public void freeze()
		{
			while(freeze = true)
			{
			setSpeed((1/3)*spd);
			setStr((19/20)*str);
			}
		}
		public void silence()
		{
			while(silence = true)
			{
				setMag((1/2)*mag);
			}
		}
		public void curse()
		{
			while(curse = true)
			{
				setLuck((4/5)*luck);
				setSpeed((13/20)*spd);
				setDex((13/20)*dex);
			}
		}
		public void grounded()
		{
			while(grounded = true)
				{
				//unimplemented flight
				setDex((4/5)*dex);
				}
		}
		/*public void cLock()
		{
			while(cLock = true)
			{
				//stops target from activating skills for a set time and turns off current skills
				activeSkills = false;
			}
		}*/
		
		public void dLock()
		{
			while(dLock = true)
			{
			for(int i = 20;i <= 0;i--)
			{
				if(i > 0)
				{
					System.out.print("You are deadlocked. Death in "+ i + " turns");
				}
				if(i < 1)
				{
					setHP(0);
					System.out.print("You have died");
				}
			}
		}
	}
}
