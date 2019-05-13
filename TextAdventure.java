import java.util.Scanner;
	

	public class TextAdventure extends AdventureModel{
		
		public static void main(String[] args) {

	System.out.println("Welcome to Wicked Werewolf!\nYou either escape or you are eaten alive by Werewolves!!");
	System.out.println("___________________________________________________________________________________________________");
	System.out.println("What is your name?");
	Scanner input = new Scanner(System.in);
	String characterName = input.nextLine();
	
	Adventurer player=new Adventurer();
	player.setName(characterName);
	
	System.out.println("___________________________________________________________________________________________________");

	
	System.out.println (player +  " you are a 25 year old man who’s beloved dog runs away while you are walking it.\n" +
			"On your mission to find your dog, you stumble upon a scary, cold, and abandoned town filled with evil werewolves. \n" +
			"Finding yourself surrounded with angry and hungry werewolves, you are desperately trying to find a way to escape. \n");

	System.out.println("Your only option for an escape route is reaching the abandoned car which is at the end of the street with houses filled with werewolves. ");

	System.out.println(	"You must find a way to the items and most importantly, the car keys to escape the werewolves. you need to find the following things:\n1.Car keys \n2.Gas\n3.First Aid Kit\n4.Ammo \n5.Food and Water");
	
	System.out.println("___________________________________________________________________________________________________");
			
	
	AdventureModel game= new AdventureModel();
	game.buildLocations();
	String nav = "";
	int x;
	
	
	while(game.end==false && game.badEnd==false)
	{
		
		nav = "";
		x=0;
		System.out.println("Where would you like to go");
		nav= input.nextLine();
		
		
		
		if (nav.equals("left")) {
			x = 1;	
		} else if (nav.equals("right")) {
			x = 2;	
		} else if (nav.equals("straight")) {
			x = 3;
		} 
		game.navigate(x);
		nav="";
		System.out.println("___________________________________________________________________________________________________");
	}
	input.close();
	if (game.end == true) {
		System.out.println("Congrats on surviving! Thanks for playing Wicked WereWolf!");
	} else if (game.badEnd == true) {
		System.out.println("Tough luck! Try again!");
	}
		}
	}