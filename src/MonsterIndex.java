import java.util.Scanner;

public class MonsterIndex {
	
	Scanner a = new Scanner(System.in);
		
	//peasant
	public Monster monster0 = new Monster("Peasant", 5, 5, "Hello hi what ");
	
	String response = a.nextLine();
	
	public String respond(String command){
		if (response.equalsIgnoreCase("hi")){
			return "hello";
		}
		else return "what";
	}
		
	//knight
	Monster monster1 = new Monster("Knight", 10, 10, "Hello");
	
	//boss
	Monster monster2 = new Monster("Boss", 15, 15, "Hello");


}
