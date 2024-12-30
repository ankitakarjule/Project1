package com.ankita;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public void m1()
	{
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("adv java");
		list.add("collection framework");
		list.add("jdbc");
		for(String str:list)
		{
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.m1();
	}

}
