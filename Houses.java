
public class Houses extends Item {

	String[] places = new String[15];
	int currentLocation = 0;
	
	// Item List
	boolean foodWater = false;
	boolean ammo = false;
	int ammoCount = 3;			// number of bullets
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
	
	public void interaction() {
		
		// interaction of food & water as well as first aid kit with health of the character
		
	}
	
	/*
	 * direction 1 = left
	 * direction 2 = right
	 * direction 3 = straight
	 */
	
	public void navigate(int direction) {
		
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
				System.out.println("You have moved down the street and find another house on your left and on your right. Which direction would you like to go?");
				
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
						ammoCount--;
					} else {						
						System.out.println("You narrowly manage to stab the werewolf in the head with a knife but are injured in the process.");
						if (foodWater == true) {
							System.out.println("You eat the food & water you have and do manage to feel a bit better.");
							foodWater = false;
						} else {
							System.out.println("You feel weak but continue on.");
							// INSERT SOMETHING ABOUT CHARACTER HEALTH HERE
							// if health = 0, then you're dead
						}
					}
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 3) {	// to Street Segment 3
				
				currentLocation = 6;
				System.out.println("You have moved down the street and find another house on your left and on your right. Which direction would you like to go?");
				
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
						ammoCount--;
					} else {						
						System.out.println("You narrowly manage to stab the werewolf in the head with a knife but are injured in the process.");
						if (foodWater == true) {
							System.out.println("You eat the food & water you have and do manage to feel a bit better.");
							foodWater = false;
						} else {
							System.out.println("You feel weak but continue on.");
							// INSERT SOMETHING ABOUT CHARACTER HEALTH HERE
							// if health = 0, then you're dead
						}
					}
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 2) {	// to House 6
				
				if (house6 == false) {
					
					System.out.println("You're in the House on the right and have obtained a first aid kit.");
					// if health is not full, automatically use health kit (INSERT CODE FOR THAT HERE)
					currentLocation = 8;
					firstAid = true;
					house6 = true;
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 3) {	// to Street Segment 4
				
				currentLocation = 9;
				System.out.println("You have moved down the street and find another house on your left and on your right. Which direction would you like to go?");
				
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
						ammoCount--;
						if (ammoCount == 0) {
							ammo = false;
						}
					} else {						
						System.out.println("You narrowly manage to stab the werewolf in the head with a knife but are injured in the process.");
						if (foodWater == true) {
							System.out.println("You eat the food & water you have and do manage to feel a bit better.");
							foodWater = false;
						} else {
							System.out.println("You feel weak but continue on.");
							// INSERT SOMETHING ABOUT CHARACTER HEALTH HERE
							// if health = 0, then you're dead
						}
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
						ammoCount--;
						if (ammoCount == 0) {
							ammo = false;
						}
					} else {						
						System.out.println("You narrowly manage to stab the werewolf in the head with a knife but are injured in the process.");
						if (foodWater == true) {
							System.out.println("You eat the food & water you have and do manage to feel a bit better.");
							foodWater = false;
						} else {
							System.out.println("You feel weak but continue on.");
							// INSERT SOMETHING ABOUT CHARACTER HEALTH HERE
							// if health = 0, then you're dead
						}
					}
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 3) {	// to Street Segment 5
				
				currentLocation = 12;
				System.out.println("You have moved down the street and find another house on your left and on your right. Which direction would you like to go?");
				
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
						ammoCount--;
						if (ammoCount == 0) {
							ammo = false;
						}
					} else {						
						System.out.println("You narrowly manage to stab the werewolf in the head with a knife but are injured in the process.");
						if (foodWater == true) {
							System.out.println("You eat the food & water you have and do manage to feel a bit better.");
							foodWater = false;
						} else {
							System.out.println("You feel weak but continue on.");
							// INSERT SOMETHING ABOUT CHARACTER HEALTH HERE
							// if health = 0, then you're dead
						}
					}
					
				} else {
					
					System.out.println("You have already been to this house");
					
				}
				
			} else if(direction == 3) {	// to Car
				
				currentLocation = 15;
				System.out.println("You hear the howls of werewolves behind you and as you run down the street, you find a car!");
				
				if (keys == true && gas == true) {
					System.out.println("You fill the gas tank of the car and manage to start the car. You have escaped the town and the werewolves!");
				} else if (keys == true && gas == false) {
					System.out.println("You try to start the car with the keys but realize there is no gas in the car! The werewolves catch up and you are killed.");
				} else if (keys == false && gas == true) {
					System.out.println("You put the gas into the car but can't find the keys to start the car! The werewolves catch up and you are killed.");
				}
				
			}
		}
	}
}
