package com.lahari.task.models.sweets;

public class MaWaBati extends Sweet {
	private String Sweetname;
	public MaWaBati(int sugar, int sweet, int weight){
		super(sugar,sweet,weight);
	}
	public void setName(String name){
		Sweetname = name;
	}
	public String getName(){
		return Sweetname;
	}
}