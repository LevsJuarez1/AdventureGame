import java.util.Scanner;

public class Monster {

public String monsterName;
int currentHealth;
int maxHealth;
String intro;

public Monster(String monsterName, int currentHealth, int maxHealth, String intro) {
	this.monsterName = monsterName;
	this.currentHealth = currentHealth;
	this.maxHealth = maxHealth;
	this.intro = intro;
}
}