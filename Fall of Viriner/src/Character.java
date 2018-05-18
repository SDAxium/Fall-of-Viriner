
public abstract class Character implements Affinity {
		
		
		private String name;
		private double maxHP;
		private double hp;
		private double str;
		private double def;
		private double mag;
		private double res;
		private double dex;
		private double spd;
		private double stam;
		private double manactrl;
		private double luk;
		private double intel; 
	
		public Character(String charName, double health, double strength, double defense, double magic, double resistance, double dexterity, double speed, double stamina, double manacontrol, double luck, double intelligence) 
		{
			name = charName;
			maxHP = health;
			hp = health;
			str = strength;
			def = defense;
			mag = magic;
			res = resistance;
			dex = dexterity;
			spd = speed;
			stam = stamina;
			manactrl = manacontrol;
			luk = luck;
			intel = intelligence;
		}
		
		public String toString() {
			String msg = "";
			msg += name + "\n";
			msg += "Max HP: " + maxHP + "\n";
			msg += "Current Health: " + hp + "\n";
			msg += "Strength: " + str + "\n";
			msg += "Defense: " + def + "\n";
			msg += "Magic: " + mag + "\n";
			msg += "Resistance: " + res + "\n";
			msg += "Dexterity: " + dex + "\n";
			msg += "Speed: " + spd + "\n";
			msg += "Stamina: " + stam + "\n";
			msg += "Mana Control: " + manactrl + "\n";
			msg += "Luck: " + luk + "\n";
			msg += "doubleelligence: " + intel;
			return msg;
		}
		
		public double getBST() 
		{
			return getHP()+getStr()+getDef()+getMag()+getRes()+getDex()+getSpeed()+getStam()+getManactrl()+getLuck()+getIntel();
		}
		public double getHP() 
		{
			return hp;
		}
		public void setHP(double health) 
		{
			this.hp = health;
		}
		public double getStr()
		{
			return str;
		}
		public void setStr(double strength)
		{
			this.str = strength;
		}
		public double getDef()
		{
			return def;
		}
		public void setDef(double defense)
		{
			this.def = defense;
		}
		public double getMag()
		{
			return mag;
		}
		public void setMag(double magic)
		{
			this.mag = magic;
		}
		public double getRes()
		{
			return res;
		}
		public void setRes(double resistance)
		{
			this.res = resistance;
		}
		public double getDex()
		{
			return dex;
		}
		public void setDex(double dexterity)
		{
			this.dex = dexterity;
		}
		public double getSpeed()
		{
			return spd;
		}
		public void setSpeed(double speed)
		{
			this.spd = speed;
		}
		public double getStam()
		{
			return stam;
		}
		public void setStam(double stamina)
		{
			this.stam = stamina;
		}
		public double getManactrl()
		{
			return manactrl;
		}
		public void setManactrl(double manacontrol)
		{
			this.manactrl = manacontrol;
		}
		public double getLuck()
		{
			return luk;
		}
		public void setLuck(double luck)
		{
			this.luk = luck;
		}
		public double getIntel()
		{
			return intel;
		}
		public void setIntel(double intelligence)
		{
			this.intel = intelligence;
		}
		
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
			while(burn)
			{
				long systime = System.nanoTime();
				long burntime = System.nanoTime()-systime;
				if(burntime >= (3*(10^9)) && burntime%(3*(10^9)) == 0)
				{
					hp -= (1/16)*maxHP;
				}
			}
		}
		public void paralysis()
		{
			while(paralysis)
			{
				setSpeed((3/5)*spd);
				setDex((4/5)*dex);
			}
		}
		public void poison()
		{
			while(poison)
			{
				long starttime = System.nanoTime();
				if(starttime >= (3*(10^9)) && starttime%(3*(10^9)) == 0)
				{
					hp -= (1/8)*maxHP;
				}
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
				setLuck((4/5)*luk);
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
			for(double i = 20;i <= 0;i--)
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

 