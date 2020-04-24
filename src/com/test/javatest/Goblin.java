package com.test.javatest;

import java.util.ArrayList;

import com.test.javatest.part.MonsterInfo;
import com.test.javatest.type.PlayerAbstract;

public class Goblin extends PlayerAbstract {

	@Override
	public String play() {
		return "Goblin!! Playing Game!!";
	}

	@Override
	public ArrayList<MonsterInfo> getMonsterInfo() {
		// TODO Auto-generated method stub
		ArrayList<MonsterInfo> list = new ArrayList<MonsterInfo>();
		MonsterInfo monsterInfo1 = new MonsterInfo();
		monsterInfo1.setName("red Goblin");
		monsterInfo1.setPower(2);
		MonsterInfo monsterInfo2 = new MonsterInfo();
		monsterInfo2.setName("yello Goblin");
		monsterInfo2.setPower(3);
		MonsterInfo monsterInfo3 = new MonsterInfo();
		monsterInfo3.setName("blue Goblin");
		monsterInfo3.setPower(4);
		
		list.add(monsterInfo1);
		list.add(monsterInfo2);
		list.add(monsterInfo3);
		return list;
	}

}
