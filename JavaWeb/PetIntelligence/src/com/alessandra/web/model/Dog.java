package com.alessandra.web.model;

public class Dog extends Animal implements Pet {
	public Dog() {
		super();
	}
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
		return "Tu perro " + this.getName() + " de raza " + this.getBreed() + ((this.getWeight() >= 30) ? " se acurruca cerca tuyo" : " salta a tu regazo");
	}
}
