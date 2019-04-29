import java.util.ArrayList;

public class Rooms {

	public static void build(Room[][] room, final int WIDTH, final int HEIGHT) {

    	// Initialize rooms (a 2D array)
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                room[i][j] = new Room(i, "", "", null);
            }
        }

        room[0][0].setNumber(1);
        room[0][0].setName("House 1");
        room[0][0].setDescription("You are in your living room.");
        room[0][0].setItems("wallet");
        room[0][0].setItems("remote");

        room[0][1].setNumber(2);
        room[0][1].setName("House 2");
        room[0][1].setDescription("You are in your bedroom. Your closet is slightly ajar.");
        room[0][1].setItems("keys");
        room[0][1].setItems("flashlight");

        room[1][0].setNumber(3);
        room[1][0].setName("House 3");
        room[1][0].setDescription("You are in your kitchen.");
        room[1][0].setItems("pop tarts");
        room[1][0].setItems("soda");

        room[1][1].setNumber(4);
        room[1][1].setName("House 4");
        room[1][1].setDescription("You are in your bathroom.");
        room[1][1].setItems("toilet paper");
        room[1][1].setItems("magazine");
        
        room [2][0].setNumber(5);
        room[2][0].setName("House 5");
        
    }
	
}

class Room {

    private int number;
    private String name;
    private String description;
    public ArrayList<String> items = new ArrayList<>();

    public Room(int number, String name, String description,
            ArrayList<String> items) {
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setItems(String item) {
        this.items.add(item);
    }

    public void deleteItem(String item) {
        this.items.remove(item);
    }

    public ArrayList<String> getItems() {
        return this.items;
    }
}
