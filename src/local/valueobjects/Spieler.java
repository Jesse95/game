package local.valueobjects;

public class Spieler {
	private String name;
	
	public Spieler(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
