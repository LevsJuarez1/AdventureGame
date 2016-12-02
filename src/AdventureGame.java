import java.util.Scanner;

public class AdventureGame {
	
	public static void main(String[] args) {
		
		Rooms currentRoom; 
		Map myMap = new Map();
		int nextRoom=0; 
		// TODO Auto-generated method stub
		
		//begining of game 
	
		//return   99 if ded, -2 if win 
		while (nextRoom !=  99 || nextRoom!= -2 ){
			currentRoom = myMap.getRoomByNum(nextRoom); 
			currentRoom.prompt();
		/*	if (currentRoom.isMonsterBattle()){
				//we fightin
				//while(myHealth > 0 && myMonster.getHealth() > 0){
				//keep fightin } 
				//if myHealth < 1 player ded 
			    // else monster ded keep going to next room 
			}*/
			nextRoom = currentRoom.destination(); 
		}
		
		//if they win or die based on return code, tell them grats or sry accordingly 
		//do whatever the room does 
		//get the next room to go to 
		
		Scanner a = new Scanner(System.in);
		
	}

}
