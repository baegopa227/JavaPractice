package com.test.javatest.type;

import java.util.ArrayList;

import com.test.javatest.part.MonsterInfo;

public abstract class PlayerAbstract implements Monster,Human,Fighter {

public abstract ArrayList<MonsterInfo> getMonsterInfo();
	
	public void attack() {
		System.out.println("attack!!");
	}
}
