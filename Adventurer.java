public class Adventurer extends Health{

private String name; 
private int health;

public Adventurer() {
	this.name="No Name";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	this.health = health;
}

public String toString(){
	return ("Werewolf Hunter "+ this.name);			// Overriding
}


}
