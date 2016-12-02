import java.util.Scanner;

public class Rooms {

Scanner a = new Scanner(System.in);

public int roomNumber;
int previousRoom;
int northRoom;
int eastRoom;
int southRoom;
int westRoom;

boolean monsterBattle = true;
private Monster roomMonster;

private String intro;
private String direction = "Which direction would you like to travel? North, East, South, or West";
private String answer;

public Rooms(int roomNumber, int previousRoom, int northRoom, int eastRoom, int southRoom, int westRoom, String intro) {
	this.roomNumber = roomNumber;
	this.northRoom = northRoom;
	this.eastRoom = eastRoom;
	this.southRoom = southRoom;
	this.westRoom = westRoom;
	this.monsterBattle = false;
	this.intro = intro;
}




public Rooms(int roomNumber, int previousRoom, int northRoom, int eastRoom, int southRoom, int westRoom, String intro, Monster roomMonster) {
	this.roomNumber = roomNumber;
	this.northRoom = northRoom;
	this.eastRoom = eastRoom;
	this.southRoom = southRoom;
	this.westRoom = westRoom;
	this.intro = intro;
	this.roomMonster = roomMonster;
}
public void prompt(){
	System.out.println(intro);
	System.out.println(direction);
	answer = a.nextLine();
}

public int destination(){
	if (answer.equalsIgnoreCase("North")){
		return northRoom;
	}
	else if (answer.equalsIgnoreCase("East")){
		return eastRoom;
}
	else if (answer.equalsIgnoreCase("South")){
	return southRoom;
}
	else if (answer.equalsIgnoreCase("West")){
		return westRoom;
	}
	else {
		return -1;
	}
}




public boolean isMonsterBattle() {
	return monsterBattle;
}





}



