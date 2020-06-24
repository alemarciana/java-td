package com.alessandra.web.model;

public class Dog extends Animal implements Pet {
	public Dog() {
		super();
	}
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
		return "Your " + this.getBreed() + " dog " + this.getName() + ((this.getWeight() >= 30) ? " curls up nexto to you" : " hops into your lap");
	}
}
