package _05_minion;

public class Minion {

	private String name;
	private String master;
	private String color;
	private int eyes;

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public Object getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public Object getEyes() {
		return eyes;
	}
	
	public void setEyes(int newEyes) {
		eyes = newEyes;
	}
	
	public Object getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}

	public Object getMaster() {
		return master;
	}
	
	public void setMaster(String newMaster) {
		master = newMaster;
	}

}
