package com.test.javatest;

import java.util.ArrayList;

import com.test.javatest.part.MonsterInfo;
import com.test.javatest.type.PlayerAbstract;

public class Human2 extends PlayerAbstract {

	@Override
	public String play() {
		return "Human2!! Playing Game!!";
	}

	@Override
	public ArrayList<MonsterInfo> getMonsterInfo() {
		return null;
	}

}
