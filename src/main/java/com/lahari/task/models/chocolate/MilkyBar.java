package com.lahari.task.models.chocolate;



public class MilkyBar extends Chocolate {
	private String name;
	public MilkyBar(int cocoaContent,int milkContent){
		super(cocoaContent,milkContent);
	}
	public void setName(String chocname){
		name = chocname;
	}
	public String getName() {
		return name;
	}
}