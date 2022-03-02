package com.bridgelab.birdsanctuaryproject;
public class Bird {
	String name ;
	String color;
	
	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color + "]";
	}
	
	public void fly() {
		System.out.println(getClass().getSimpleName() + " can fly");
	}

	public void eat() {
		System.out.println(getClass().getSimpleName() + " can eat");
	}

	public void swim() {
		System.out.println(getClass().getSimpleName() + " can swim");
	}
 
}
