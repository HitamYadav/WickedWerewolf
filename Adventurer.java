public class Adventurer extends Houses{

private String name;
public Adventurer() {
	this.name="No Name";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public String toString(){
	return ("WereWolf Hunter "+ this.name);
}


}
