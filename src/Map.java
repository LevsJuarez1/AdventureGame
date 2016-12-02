import java.util.Scanner;

public class Map {
	
	public Map(){} //empty constructor 
	
	//peasant
		public Monster monster0 = new Monster("Peasant", 5, 5, "Hello hi what ");
		
	/*	String response = a.nextLine();
		
		public String respond(String command){
			if (response.equalsIgnoreCase("hi")){
				return "hello";
			}
			else return "what";
		}*/
			
		//knight
		Monster monster1 = new Monster("Knight", 10, 10, "Hello");
		
		//boss
		Monster monster2 = new Monster("Boss", 15, 15, "Hello");

//start
Rooms rooms0 = new Rooms(0, -1, 1, 2, -1, -1, "You awake in a field in the middle of nowhere. \n"
				+ "The only sign of civilization that you can see is smoke coming from \n"
				+ "the South...");

//crop circle
Rooms rooms1 = new Rooms(1, 0, -1, -1, 0, -1, "You encounter a strange emblem etched \n"
		+ "into the ground, you are unsure of it's origin but you feel like you have seen it \n"
		+ "before.  A strange sound echoes in the distance and you begin to feel like you \n"
		+ "should not be here.");

//castle
Rooms rooms2 = new Rooms(2, 0, 0, 3, 4, -1, "A castle looms up in the distance it is \n"
		+ "built out of weathered stone faded into an almost white color \n"
		+ "the drawbridge is rusty and stuck in the downward position making the dried up \n"
		+ "moat surrounding it obselete.  As you approach the castle the birds perched on the \n"
		+ "walls fly away.");

//peasant
Rooms rooms3 = new Rooms(3, 2, -1, -1, 4, 2, "You approach a young male dressed in nothing \n"
		+ "but a ragged brown t shirt missing a sleeve and a pair of brown sack pants \n"
		+ "with patches on the knees");

//warrior TODO change to proper destinations 
Rooms rooms4 = new Rooms(4, 2, 2, -1, 5, -1, "A knight dressed in all black armor \n"
		+ "comes running out of the castle as you approach.  He stops about five feet from "
		+ "you and draws his sword in silence.  The blade is as long as your arm and pure white");

//inside castle
Rooms rooms5 = new Rooms(5, 4, 4, -1, 6, -1, "The inside of the castle appears barren "
		+ "no matter where you look there is no sign of life anywhere.  There is what once may "
		+ "have been a garden dead and whithered in the middle of the courtyard.  Aside from that "
		+ "the walls are bare and the ground is nothing but dirt.");

/*//fork
Rooms rooms6 = new Rooms(6, 5, 5, -1, 7 or 8 or 9, -1, "You spy a staircase in the corner of "
		+ "the courtyard that appears as if it may lead to the second floor, the stairs seem "
		+ "much to large for a normal person.  You also spy a trapdoor in the corner the opposite"
		+ "corner slightly covered by a broken barrel.  The trapdoor is located next to a door "
		+ "dead center of the far back wall of the courtyard.");*/

//room
Rooms rooms7 = new Rooms(7, 6, 6, -1, -1, -1, "The room is wood paneled from floor to ceiling"
		+ "in a pale maple.  The only object in the room is a bow and arrow on a pedastal in"
		+ "the middle of the room.");

//trapdoor
Rooms rooms8 = new Rooms(8, 7, 6, -1, 10, -1, "You open the trap door and see nothing but "
		+ "black.  You search for a ladder into the darkness but find none and are forced to jump"
		+ "you hit the ground with a resounding thud and wait for your eyes to adjust to the "
		+ "darkness");

//stairs
Rooms rooms9 = new Rooms(9, 6, 6, -1, 10, -1, "You start climbing the stairs and about "
		+ "halfway up the stairs begin to collapse propelling you into a dark black hole."
		+ "You hit the ground with a resounding thud and slowly wait until your eyes adjust.");
/*
//boss
Rooms rooms10 = new Rooms(10, 8 or 9, 8 or 9, -1, -1, -1, "As your eyes are adjusting"
		+ "you hear an echoing boom coming from the middle of the room.  You can't tell what it "
		+ "is at first but soon realize it's a laugh.  Your eyes finally fully adjust and"
		+ "you are inches away from the most grotesque man you have ever seen in your life.  His "
		+ "eyes are staring directly back at yours and you can't tell if he is still human or "
		+ "maybe at one point was.");*/

	public Rooms [] myDundgeon = {rooms0,rooms1, rooms2, rooms3, rooms4, rooms5}; //etc  
	
	//also make a myMonsters array and getMonsterByNum func too
	
	public Rooms getRoomByNum(int num){
		return myDundgeon[num]; 
	}
	// myDundgeon[0] == rooms0 is true 

}
