package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		Smurf Papa_Smurf = new Smurf("Papa_Smurf");
		Smurf Smurfette = new Smurf("Smurfette");
		
		Handy.getName();
		Handy.eat();
		Handy.getHatColor();
		Handy.isGirlOrBoy();
		
		Papa_Smurf.getName();
		Papa_Smurf.eat();
		Papa_Smurf.getHatColor();
		Papa_Smurf.isGirlOrBoy();
		
		Smurfette.getName();
		Smurfette.eat();
		Smurfette.getHatColor();
		Smurfette.isGirlOrBoy();
		
	}
}
