package com.test.javatest;

import java.util.ArrayList;

import com.test.javatest.part.MonsterInfo;
import com.test.javatest.type.PlayerAbstract;

public class Bug extends PlayerAbstract {

	@Override
	public String play() {
		return "Bug!! Playing Game!!";
	}

	@Override
	public ArrayList<MonsterInfo> getMonsterInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
