package com.test.javatest;

import java.util.ArrayList;

import com.test.javatest.part.MonsterInfo;
import com.test.javatest.type.PlayerAbstract;

public class Human1 extends PlayerAbstract {

	@Override
	public String play() {
		return "Human1!! Playing Game!!";
	}

	@Override
	public ArrayList<MonsterInfo> getMonsterInfo() {
		
		ArrayList<MonsterInfo> list = new ArrayList<MonsterInfo>();
		MonsterInfo monsterInfo1 = new MonsterInfo();
		monsterInfo1.setName("red Human");
		monsterInfo1.setPower(1);
		MonsterInfo monsterInfo2 = new MonsterInfo();
		monsterInfo2.setName("yello Human");
		monsterInfo2.setPower(2);
		MonsterInfo monsterInfo3 = new MonsterInfo();
		monsterInfo3.setName("blue Human");
		
		monsterInfo3.setPower(3);
		
		list.add(monsterInfo1);
		list.add(monsterInfo2);
		list.add(monsterInfo3);
		return list;
	}

}
