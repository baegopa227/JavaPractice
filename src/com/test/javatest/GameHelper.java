package com.test.javatest;

import java.util.ArrayList;

import com.test.javatest.part.MonsterInfo;
import com.test.javatest.type.Human;
import com.test.javatest.type.Monster;
import com.test.javatest.type.PlayerAbstract;

public class GameHelper {

	public boolean playGameMonster(Monster player1, Monster player2) {
		
		return playGameMonster(player1,player2, true);
		
		
	}

public boolean playGameMonster(Monster player1, Monster player2, boolean isPlay) {
		
		String player1Print = player1.play();
		String player2Print = player2.play();
		
		
		System.out.println("몬스터 놀이터 : " + player1Print + " , " + player2Print);
		
		return true;
	}

	
	public boolean playGameHuman(Human player1, Human player2) {
		
		String player1Print = player1.play();
		String player2Print = player2.play();
		
		System.out.println("인간 놀이터 : " + player1Print + " , " + player2Print);
		
		return true;
	}

	public boolean fight(PlayerAbstract fighter1, PlayerAbstract fighter2) {
		
		ArrayList<MonsterInfo> list1 = fighter1.getMonsterInfo();
		ArrayList<MonsterInfo> list2 = fighter2.getMonsterInfo();
		
		for(MonsterInfo fighter : list1) {
			String fighterName = fighter.getName();
			int fighterPower = fighter.getPower();
			System.out.print(" fighter : " + fighterName + " , power : " + fighterPower );
		}
		System.out.println("");
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("");
		
		for(MonsterInfo fighter : list2) {
			String fighterName = fighter.getName();
			int fighterPower = fighter.getPower();
			System.out.print(" fighter : " + fighterName + " , power : " + fighterPower );
		}
		
		
		return true;
	}

}
