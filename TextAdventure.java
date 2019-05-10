import java.util.Scanner;
	

	public class TextAdventure extends AdventureModel{

		public static void main(String[] args) {
			//boolean works=true;
	System.out.println("Welcome to Wicked Werewolf!\nYou either escape or you are eaten alive by Werewolves!!");
	System.out.println("___________________________________________________________________________________________________");
	System.out.println("What is your name?");
	Scanner input = new Scanner(System.in);
	String characterName = input.nextLine();


	//String playertype="";
	//Scanner input2 = new Scanner(System.in);
	
	Adventurer player=new Adventurer();
	player.setName(characterName);
	
	System.out.println("___________________________________________________________________________________________________");

	
	System.out.println (characterName +  " you are a 25 year old man who’s beloved dog runs away while you are walking it.\n" +
			"On your mission to find your dog, you stumble upon a scary, cold, and abandoned town filled with evil werewolves. \n" +
			"Finding yourself surrounded with angry and hungry werewolves, you are desperately trying to find a way to escape. \n");

	System.out.println("You're only option for an escape route is reaching the abandoned car which is at the end of the street with houses filled with werewolves. ");

	System.out.println(	"YOU must find a way to the items and most importantly, the car keys to escape the werewolves. you need to find the following things:\n1.car keys \n2.gas\n3.first aid kit\n4.Ammo \n5.food and water");
	
	System.out.println("___________________________________________________________________________________________________");
			
	
	AdventureModel game= new AdventureModel();
	game.populatelands();
	//game.printLands();
	String nav;
	int x;
	
	
	
	while(game.end==false)
	{
		nav="";
	x=0;
	System.out.println("Where would you like to go");
	nav= input.nextLine();
	if (nav.equals("straight"))
		x = 1;	
	else if (nav.equals("left"))
		x = 2;	
	else if (nav.equals("right"))
		x = 3;
	
	game.navigate(x);
	nav="";
	System.out.println("___________________________________________________________________________________________________");
	}
	input.close();
	
	System.out.println("Thanks for playing Wicked WereWolf!");
	
		}
	}
	
