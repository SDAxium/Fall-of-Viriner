//Trial 2 of many. Sisiame hasn't come to roast my retarded ass yet
public class Character {
		int Level;
		int Experience;
		
		static int health;
		static int strength;
		static int defense;
		static int magic;
		static int resistance;
		static int agility;
		static int speed;
		static int stamina;
		static int manacontrol;
		static int luck;
		static int intelligence; 
	
		public static int getBST() 
		{
			return health+strength+defense+magic+resistance+agility+speed+stamina+manacontrol+luck+intelligence;
		}
		public static void setHP(int value)
		{
			health = value;
		}
		public static void setStr(int x)
		{
			strength = x;
		}
		public static void setDef(int x)
		{
			defense = x;
		}
		public static void setMag(int x)
		{
			magic = x;
		}
		public static void setRes(int x)
		{
			resistance = x;
		}
		public static void setAgil(int x)
		{
			agility = x;
		}
		public static void setSpeed(int x)
		{
			speed = x;
		}
		public static void setStam(int x)
		{
			stamina = x;
		}
		public static void setMC(int x)
		{
			manacontrol = x;
		}
		public static void setLuk(int x)
		{
			luck = x;
		}
		public static void setInt(int x)
		{
			intelligence = x;
		}
}
