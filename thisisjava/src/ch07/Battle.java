package ch07;

import ch08.sec02.RemoteControl;
import ch08.sec02.Television;

public class Battle {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 100, 10);
		Wizard wizard = new GreatWizard("대마법사", 80, 5);
		
		// 전사의 체력
		System.out.println("전사체력:"+warrior.hp);
		// 마법사의 체력
		System.out.println("마법사체력:"+wizard.hp);
		
		// 전사 -> 마법사 공격
//		warrior.attack(wizard);
		
		// 랜덤전투
		randomBattle(warrior, wizard);
		
		System.out.println("전사체력:"+warrior.hp);
		System.out.println("마법사체력:"+wizard.hp);
		
		RemoteControl rc = new Television();
		rc.turnOn();
	}
	
	public static void randomBattle(Character c1, Character c2) {
		while(true) {
			int n = (int)(Math.random()*2);
			Character[] c = new Character[2];
			if (n == 0) {
				c[0] = c1;
				c[1] = c2;
			} else {
				c[0] = c2;
				c[1] = c1;
			}
			c[0].attack(c[1]);
			if (c[0].hp == 0 || c[1].hp == 0) {
				System.out.println("게임 오버");
				break;
			}
		}
	}

	
	
	
	
	
}
