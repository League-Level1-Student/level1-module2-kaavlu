package _02_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=7-RDGT5Lsp8 
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3. & 4. see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	// Papa Smurf wears a red hat, all the others are white.
	public void getHatColor() {
		if(name.equals("Papa_Smurf")) {
			System.out.println( "My hat is red");
		}else {
			System.out.println("My hat is white");
		}
		
	}

	// Smurfette is the only female Smurf.
	public void isGirlOrBoy() {
		if(name.equals("Smurfette")) {
			System.out.println("girl");
		}else {
			System.out.println("boy");
		}

	}
}


