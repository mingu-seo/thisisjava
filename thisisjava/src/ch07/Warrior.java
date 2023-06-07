package ch07;

public class Warrior extends Character {
	
	Warrior(String name, int hp, int ap) {
		super(name, hp, ap);
	}
	
	void jumpAttack(Character c) {
		c.hp = c.hp - (this.ap+10);
	}
	
}
