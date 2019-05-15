
public class AdventureModel extends Werewolf {

	String[] places = new String[16];
	int currentLocation = 0;
	boolean end = false;
	boolean badEnd = false;
	String[] inv = new String[5];
	
	// Item List
	int health = 1;
	boolean foodWater = false;
	boolean ammo = false;
	boolean gas = false;
	boolean firstAid = false;
	boolean keys = false;
	
	// Has player been to this house?
	boolean house1 = false;
	boolean house2 = false;
	boolean house3 = false;
	boolean house4 = false;
	boolean house5 = false;
	boolean house6 = false;
	boolean house7 = false;
	boolean house8 = false;
	boolean house9 = false;
	boolean house10 = false;
	
	public void buildLocations() {
		 places[0] = "Street";
		 places[1] = "House 1";
		 places[2] = "House 2";
		 places[3] = "Street";
		 places[4] = "House 3";
		 places[5] = "House 4";
		 places[6] = "Street";
		 places[7] = "House 5";
		 places[8] = "House 6";
		 places[9] = "Street";
		 places[10] = "House 7";
		 places[11] = "House 8";
		 places[12] = "Street";
		 places[13] = "House 9";
		 places[14] = "House 10";
		 places[15] = "Car";	 
	}
	
	public void interaction() {			// Overriding
		
		Health player = new Adventurer();		// Polymorphism
		player.setHealth(1);
		badEnd = true;
		
	}
	
	public void fillInv() {
		
		if (foodWater == true) {
			inv[0] = "Food and Water";
		} else {
			inv[0] = "---";
		}
		if (ammo == true) {
			inv[1] = "Ammo";
		} else {
			inv[1] = "---";
		}
		if (gas == true) {
			inv[2] = "Gas";
		} else {
			inv[2] = "---";
		}
		if (firstAid == true) {
			inv[3] = "First Aid Kit";
		} else {
			inv [3] = "---";
		}
		if (keys == true) {
			inv[4] = "Keys";
		} else {
			inv[4] = "---";
		}
	}
	
	/*
	 * direction 1 = left
	 * direction 2 = right
	 * direction 3 = straight
	 * 4 = inventory
	 */
	
	public void navigate(int direction) {
		
		if (direction == 4) {
			fillInv();
			for (int i = 0; i < 5; i++) {
				System.out.println(inv[i]);
			}
		}
		
		if (currentLocation == 0) {	// Street Segment 1 (Start)
			if(direction == 1) {	// to House 1
				
				if (house1 == false) {
					System.out.println("You're in the House on the left and have obtained food & water.");
					currentLocation = 1;
					foodWater = true;
					house1 = true;
				} else {
					System.out.println("You have already been to this house");
				}
				
			} else if(direction == 2) {	// to House 2
				
				if (house2 == false) {
					System.out.println("You're in the House on the right and have obtained ammo.");
					currentLocation = 2;
					ammo = true;
					house2 = true;
				} else {
					System.out.println("You have already been to this house");
				}
				
			} else if(direction == 3) {	// to Street Segment 2
				
				currentLocation = 3;
				System.out.println("You have moved down the street and find another house on your left and on your right. \nYou hear howling from the right. \nWhich direction would you like to go?");
				
			}
		} else if (currentLocation == 1) { // House 1
			if(direction == 1) {	// to Dead End
				
				System.out.println("You cannot go any further left.");
				
			} else if(direction == 2) {	// to Street Segment 1 (Start)
				
				currentLocation = 0;
				System.out.println("You are back out on the street.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		} else if (currentLocation == 2) { // House 2
			if(direction == 1) {	// to Street Segment 1 (Start)
				
				currentLocation = 0;
				System.out.println("You are back out on the street.");
				
			} else if(direction == 2) {	// to Dead End
				
				System.out.println("You cannot go any further right.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		} else if (currentLocation == 3) { // Street Segment 2
			if (direction == 1) {	// to House 3
				
				if (house3 == false) {
					
					System.out.println("You're in the House on the left and have obtained gas.");
					currentLocation = 4;
					gas = true;					
					house3 = true;
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 2) {	// to House 4
				
				if (house4 == false) {
					
					System.out.println("You walk into the house and find yourself face to face with a werewolf!");
					currentLocation = 5;
					house4 = true;
					
					if (ammo == true) {
						System.out.println("You shoot the werewolf quickly and escape injury.");
					} else {						
						System.out.println("You make eye contact with the werewolf and before you can move, it leaps on you.");
						interaction();
					}
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 3) {	// to Street Segment 3
				
				currentLocation = 6;
				System.out.println("You have moved down the street and find another house on your left and on your right. \nYou stop and watch as a pack of werewolves move further down the street. \nWhich direction would you like to go?");
				
			}
		} else if (currentLocation == 4) { // House 3
			if(direction == 1) {	// to Dead End
				
				System.out.println("You cannot go any further left.");
				
			} else if(direction == 2) {	// to Street Segment 2
				
				currentLocation = 3;
				System.out.println("You are back out on the street.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		} else if (currentLocation == 5) { // House 4
			if(direction == 1) {	// to Street Segment 2
				
				currentLocation = 3;
				System.out.println("You are back out on the street.");
				
			} else if(direction == 2) {	// to Dead End
				
				System.out.println("You cannot go any further right.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		} else if (currentLocation == 6) { // Street Segment 3
			if (direction == 1) {	// to House 5
				
				if (house5 == false) {
					
					System.out.println("You walk into the house and find yourself face to face with a werewolf!");
					currentLocation = 7;
					house5 = true;
					
					if (ammo == true) {
						System.out.println("You shoot the werewolf quickly and escape injury.");
					} else {						
						System.out.println("You try to back out but trip as the werewolf catches you.");
						interaction();
					}
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 2) {	// to House 6
				
				if (house6 == false) {
					
					System.out.println("You're in the House on the right and have obtained a first aid kit.");
					currentLocation = 8;
					firstAid = true;
					house6 = true;
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 3) {	// to Street Segment 4
				
				currentLocation = 9;
				System.out.println("You have moved down the street and find another house on your left and on your right. \nA shriek of pain can be heard back from where you came from. \nWhich direction would you like to go?");
				
			}
		} else if (currentLocation == 7) { // House 5
			if(direction == 1) {	// to Dead End
				
				System.out.println("You cannot go any further left.");
				
			} else if(direction == 2) {	// to Street Segment 3
				
				currentLocation = 6;
				System.out.println("You are back out on the street.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		} else if (currentLocation == 8) { // House 6
			if(direction == 1) {	// to Street Segment 3
				
				currentLocation = 6;
				System.out.println("You are back out on the street.");
				
			} else if(direction == 2) {	// to Dead End
				
				System.out.println("You cannot go any further right.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		} else if (currentLocation == 9) { // Street Segment 4
			if (direction == 1) {	// to House 7
				
				if (house7 == false) {
					
					System.out.println("You walk into the house and find yourself face to face with a werewolf!");
					currentLocation = 10;
					house7 = true;
					
					if (ammo == true) {
						System.out.println("You shoot the werewolf quickly and escape injury.");
					} else {						
						System.out.println("You try to run but are quickly chased down and murdered.");
						interaction();
					}
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 2) {	// to House 8
				
				if (house8 == false) {
					
					System.out.println("You walk into the house and find yourself face to face with a werewolf!");
					currentLocation = 11;
					house8 = true;
					
					if (ammo == true) {
						System.out.println("You shoot the werewolf quickly and escape injury.");
					} else {						
						System.out.println("You try to hide but make a noise and the werewolf finds you and eats you.");
						interaction();
					}
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 3) {	// to Street Segment 5
				
				currentLocation = 12;
				System.out.println("You have moved down the street and find another house on your left and on your right. \nThe blood on the ground is still fresh and you see a corpse hidden behind a broken car. \nWhich direction would you like to go?");
				
			}
		} else if (currentLocation == 10) { // House 7
			if(direction == 1) {	// to Dead End
				
				System.out.println("You cannot go any further left.");
				
			} else if(direction == 2) {	// to Street Segment 4
				
				currentLocation = 9;
				System.out.println("You are back out on the street.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		} else if (currentLocation == 11) { // House 8
			if(direction == 1) {	// to Street Segment 4
				
				currentLocation = 9;
				System.out.println("You are back out on the street.");
				
			} else if(direction == 2) {	// to Dead End
				
				System.out.println("You cannot go any further right.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		} else if (currentLocation == 12) { // Street Segment 5
			if (direction == 1) {	// to House 9
				
				if (house9 == false) {
					
					System.out.println("You're in the House on the left and have obtained car keys.");
					currentLocation = 13;
					keys = true;
					house9 = true;
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 2) {	// to House 10
				
				if (house10 == false) {
					
					System.out.println("You walk into the house and find yourself face to face with a werewolf!");
					currentLocation = 14;
					house10 = true;
					
					if (ammo == true) {
						System.out.println("You shoot the werewolf quickly and escape injury.");
					} else {						
						System.out.println("You try to run but are quickly chased down and murdered.");
						interaction();
					}
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 3) {	// to Car
				
				currentLocation = 15;
				System.out.println("You hear the howls of werewolves behind you and as you run down the street, you find a car!");
				
				if (keys == true && gas == true) {
					System.out.println("You fill the gas tank of the car and manage to start the car. You have escaped the town and the werewolves!");
					end = true;
				} else if (keys == true && gas == false) {
					System.out.println("You try to start the car with the keys but realize there is no gas in the car! The werewolves catch up and you are killed.");
					badEnd = true;
				} else if (keys == false && gas == true) {
					System.out.println("You put the gas into the car but can't find the keys to start the car! The werewolves catch up and you are killed.");
					badEnd = true;
				} else if (keys == false && gas == false) {
					System.out.println("You do not have the keys or gas for the car! The werewolves catch up and murder you.");
					badEnd = true;
				}
				
			}
		} else if (currentLocation == 13) { // House 9
			if(direction == 1) {	// to Dead End
				
				System.out.println("You cannot go any further left.");
				
			} else if(direction == 2) {	// to Street Segment 5
				
				currentLocation = 12;
				System.out.println("You are back out on the street.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		} else if (currentLocation == 14) { // House 10
			if(direction == 1) {	// to Street Segment 5
				
				currentLocation = 12;
				System.out.println("You are back out on the street.");
				
			} else if(direction == 2) {	// to Dead End
				
				System.out.println("You cannot go any further right.");			
				
			} else if(direction == 3) {	// to Dead End
				
				System.out.println("You cannot go any further straight.");
				
			}
		}
	}
}
