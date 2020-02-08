package com.lahari.task.models.chocolate;

import com.lahari.task.models.chocolate.Chocolate;

public class DairyMilk extends Chocolate {
	private String name;
	public DairyMilk(int cocoaContent,int milkContent){
		super(cocoaContent,milkContent);
	}
	public void setName(String chocname){
		name = chocname;
	}
	public String getName() {
		return name;
	}
}