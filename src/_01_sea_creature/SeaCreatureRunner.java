package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		SeaCreature Patrick = new SeaCreature("Patrick");
		SeaCreature Squidward = new SeaCreature("Squidward");
		
		Spongebob.getName();
		Spongebob.eat();
		Spongebob.laugh();
		
		Patrick.getName();
		Patrick.eat();
		Patrick.laugh();
		
		Squidward.getName();
		Squidward.eat();
		Squidward.laugh();
	}
	
}
